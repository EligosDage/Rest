package com.example.rest.Controller;

import com.example.rest.Entity.ChatEntity;
import com.example.rest.Entity.MessageEntity;
import com.example.rest.Repository.MessageRepo;
import com.example.rest.Service.MessageService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/messages")
public class MessageController {
    @Autowired
    private MessageService messageService;
    @Autowired
    private MessageRepo messageRepo;

    @PostMapping
    public ResponseEntity createMessage(@RequestBody MessageEntity message,
                                        @RequestParam Integer id_user,
                                        @RequestParam Integer id_chat){

            return ResponseEntity.ok(messageService.createMessage(message,id_user,id_chat));
    }
    @GetMapping("/all")
    public @ResponseBody Iterable<MessageEntity> getAllMessages(){
        return messageRepo.findAll();
    }

    @PutMapping
    public ResponseEntity updateMessage(@RequestBody MessageEntity message,
                                        @RequestParam Integer id_user,
                                        @RequestParam Integer id_chat){

            return ResponseEntity.ok(messageService.updateMessage(message,id_user,id_chat));
    }
    @DeleteMapping("/{id}")
    public ResponseEntity deleteMessageById(@PathVariable Integer id_mess){
        return ResponseEntity.ok(messageService.deleteMessage(id_mess));
    }
}
