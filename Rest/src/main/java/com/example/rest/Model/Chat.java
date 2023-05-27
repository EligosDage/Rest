package com.example.rest.Model;

import com.example.rest.Entity.ChatEntity;

public class Chat {
    private Integer id_chat;
    private String chatname;

    public static Chat toModel(ChatEntity chatEntity){
        Chat cmodel = new Chat();
        cmodel.setId_chat(chatEntity.getId_chat());
        cmodel.setChatname(chatEntity.getChatname());
        return cmodel;
    }

    public Chat() {
    }
    /*дописать реализацию геттеров и сеттеров*/

    public Integer getId_chat() {
        return id_chat;
    }

    public void setId_chat(Integer id_chat) {
        this.id_chat = id_chat;
    }

    public String getChatname() {
        return chatname;
    }

    public void setChatname(String chatname) {
        this.chatname = chatname;
    }
}
