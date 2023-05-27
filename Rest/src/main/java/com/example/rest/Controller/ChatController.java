package com.example.rest.Controller;

import com.example.rest.Entity.ChatEntity;
import com.example.rest.Entity.UserEntity;
import com.example.rest.Service.ChatService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/chatrooms")
public class ChatController {
    @Autowired
    private ChatService chatService;

    @PostMapping
    public ResponseEntity registration(@RequestBody ChatEntity chat){
        try {
            chatService.registration(chat);
            return ResponseEntity.ok("Чат добавлен!");
        }
        catch (Exception e){
            return ResponseEntity.badRequest().body("Error");
        }
    }

    @GetMapping("/{id}")
    public ResponseEntity getChatsById(@PathVariable Integer id){
        try {
            return ResponseEntity.ok(chatService.getChatsById(id));
        }
        catch (Exception e){
            return ResponseEntity.badRequest().body("Error");
        }
    }


    @GetMapping(path = "/all")
    public @ResponseBody Iterable<ChatEntity> getAllChats(){
        return chatService.chatRepo.findAll();
    }

    @PutMapping
    public ResponseEntity updateChat(@RequestBody ChatEntity chat){
        try {
            chatService.registration(chat);
            return ResponseEntity.ok("Чат изменен!");
        }
        catch (Exception e){
            return ResponseEntity.badRequest().body("Error");
        }
    }

    @DeleteMapping("/{id}")
    public ResponseEntity deleteById(@PathVariable Integer id){
        return ResponseEntity.ok(chatService.delete(id));
    }
}
