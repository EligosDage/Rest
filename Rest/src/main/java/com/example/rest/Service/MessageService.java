package com.example.rest.Service;

import com.example.rest.Entity.ChatEntity;
import com.example.rest.Entity.MessageEntity;
import com.example.rest.Entity.UserEntity;
import com.example.rest.Model.Message;
import com.example.rest.Repository.ChatRepo;
import com.example.rest.Repository.MessageRepo;
import com.example.rest.Repository.UserRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class MessageService {
    @Autowired
    private MessageRepo messageRepo;
    @Autowired
    private UserRepo userRepo;
    @Autowired
    private ChatRepo chatRepo;

    public Message createMessage(MessageEntity message, Integer id_user, Integer id_chat){
        UserEntity user = userRepo.findById(id_user).get();
        ChatEntity chat = chatRepo.findById(id_chat).get();
        message.setUser(user);
        message.setChat(chat);
        return Message.toModel(messageRepo.save(message));

    }

    public Message updateMessage(MessageEntity message, Integer id_user, Integer id_chat){
        UserEntity user = userRepo.findById(id_user).get();
        ChatEntity chat = chatRepo.findById(id_chat).get();
        message.setUser(user);
        message.setChat(chat);
        return Message.toModel(messageRepo.save(message));

    }
    public Integer deleteMessage(Integer id_mess){
        messageRepo.deleteById(id_mess);
        return id_mess;
    }
}
