package com.alimohammad.freelancer.firebasechatapp;

public class Messages {
    String sender;
    String mess;

    public Messages() {
    }

    public Messages(String sender, String mess) {
        this.sender = sender;
        this.mess = mess;
    }

    public String getSender() {
        return sender;
    }

    public String getMess() {
        return mess;
    }
}
