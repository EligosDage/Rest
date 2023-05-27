package com.example.rest.Service;

import com.example.rest.Entity.ChatEntity;
import com.example.rest.Model.Chat;
import com.example.rest.Repository.ChatRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ChatService {
@Autowired
   public ChatRepo chatRepo;

    public ChatEntity registration(ChatEntity chat){
        return chatRepo.save(chat);
    }

    public Chat  getChatsById(Integer id){
        ChatEntity chat = chatRepo.findById(id).get();
        return Chat.toModel(chat);
    }

    public Integer delete(Integer id){
        chatRepo.deleteById(id);
        return id;
    }




}
