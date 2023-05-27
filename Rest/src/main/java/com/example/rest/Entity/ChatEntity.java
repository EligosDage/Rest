package com.example.rest.Entity;

import jakarta.persistence.*;

import java.util.List;

@Entity
@Table(name="chatrooms")
public class ChatEntity {
    @Id
    @Column(name="id_chatroom")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id_chat;
    private String chatname;

    @OneToMany(cascade = CascadeType.ALL, mappedBy = "chat")
    private List<MessageEntity> messages;

    public ChatEntity() {
    }

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
