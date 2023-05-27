package com.example.rest.Model;

import com.example.rest.Entity.ChatEntity;
import com.example.rest.Entity.MessageEntity;
import com.example.rest.Entity.UserEntity;

public class Message {
    private Integer id_message;
    private String message;
    private String timestamp;
    private UserEntity user;
    private ChatEntity chat;

    public static Message toModel(MessageEntity message){
        Message model = new Message();
        model.setId_message(message.getId_message());
        model.setMessage(message.getMessage());
        model.setTimestamp(message.getTimestamp());
        model.setUser(message.getUser());
        model.setChat(message.getChat());
        return model;


    }

    public Message() {
    }

    public Integer getId_message() {
        return id_message;
    }

    public void setId_message(Integer id_message) {
        this.id_message = id_message;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public String getTimestamp() {
        return timestamp;
    }

    public void setTimestamp(String timestamp) {
        this.timestamp = timestamp;
    }

    public UserEntity getUser() {
        return user;
    }

    public void setUser(UserEntity user) {
        this.user = user;
    }

    public ChatEntity getChat() {
        return chat;
    }

    public void setChat(ChatEntity chat) {
        this.chat = chat;
    }
}
