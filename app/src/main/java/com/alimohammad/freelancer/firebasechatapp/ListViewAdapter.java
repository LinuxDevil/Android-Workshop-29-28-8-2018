package com.alimohammad.freelancer.firebasechatapp;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;

public class ListViewAdapter extends ArrayAdapter<Messages> {

    ArrayList<Messages> messagesArrayList = new ArrayList<>();


    public ListViewAdapter(@NonNull Context context, int resource, ArrayList<Messages> messages) {
        super(context, resource, messages);

        messagesArrayList = messages;

    }

    @Override
    public int getCount() {
       return messagesArrayList.size();
    }

    @Nullable
    @Override
    public Messages getItem(int position) {
        return super.getItem(position);
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {

        View view = convertView;

        if(view == null){
            LayoutInflater inflater = LayoutInflater.from(getContext());
            view = inflater.inflate(R.layout.listview_custom,null);
        }



        Messages message = getItem(position);

        if(message != null) {
            TextView messageTextView = view.findViewById(R.id.message);
            TextView senderTextView = view.findViewById(R.id.sender);

            messageTextView.setText(message.getMess());
            senderTextView.setText(message.getSender());
        }

        return view;
    }
}
