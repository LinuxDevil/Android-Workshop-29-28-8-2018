package com.alimohammad.freelancer.firebasechatapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.ListView;
import android.widget.Toast;

import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.database.ValueEventListener;

import java.util.ArrayList;
import java.util.Date;

public class HomePage extends AppCompatActivity {
    long count;
     ListViewAdapter adapter;
    ListView listView;
    ArrayList<Messages> messages = new ArrayList<>();
    EditText messageEditText;
    FirebaseDatabase db = FirebaseDatabase.getInstance();
    FirebaseAuth auth;
    DatabaseReference ref = db.getReference();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home_page);

        auth = FirebaseAuth.getInstance();
        listView = findViewById(R.id.listView);
        messageEditText = findViewById(R.id.messageEditText);

        adapter = new ListViewAdapter(this,R.layout.listview_custom, messages);

        listView.setAdapter(adapter);

        ref.child("messages").addValueEventListener(new ValueEventListener() {
            @Override
            public void onDataChange(DataSnapshot dataSnapshot) {
                count = dataSnapshot.getChildrenCount();
                messages.clear();
//                dataSnapshot.
                for (DataSnapshot data:
                     dataSnapshot.getChildren()) {

//                    data.getValue(Messages.class);

                    messages.add(data.getValue(Messages.class));
                    adapter.notifyDataSetChanged();
                }
            }

            @Override
            public void onCancelled(DatabaseError databaseError) {

            }
        });

    }

    public void send(View view){
        Toast.makeText(this, messageEditText.getText().toString(), Toast.LENGTH_SHORT).show();

        ref.child("messages").child(new Date().getTime() + "message_" + String.valueOf(++count))
                .setValue(new Messages(auth.getCurrentUser().getEmail(),
                        messageEditText.getText().toString()));

    }

}
