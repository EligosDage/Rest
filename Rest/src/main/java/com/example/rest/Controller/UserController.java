package com.example.rest.Controller;

import com.example.rest.Entity.UserEntity;
import com.example.rest.Service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;



@RestController
@RequestMapping("/users")
public class UserController {
    @Autowired
    private UserService userService;

    @PostMapping
    public ResponseEntity registration(@RequestBody UserEntity user){
        try {
            userService.registration(user);
            return ResponseEntity.ok("Пользователь добавлен!");
        }
        catch (Exception e){
            return ResponseEntity.badRequest().body("Error");
        }
    }
   @GetMapping("/{id}")
    public ResponseEntity getUsersById(@PathVariable Integer id){
        try {
            return ResponseEntity.ok(userService.getUsersById(id));
        }
        catch (Exception e){
            return ResponseEntity.badRequest().body("Error");
        }
    }
    @GetMapping(path = "/all")
    public @ResponseBody Iterable<UserEntity> getAllUsers(){
        return userService.userRepo.findAll();
    }

    @PutMapping
    public ResponseEntity updateUser(@RequestBody UserEntity user){
        try {
            userService.registration(user);
            return ResponseEntity.ok("Пользователь изменен!");
        }
        catch (Exception e){
            return ResponseEntity.badRequest().body("Error");
        }
    }

    @DeleteMapping("/{id}")
    public ResponseEntity deleteById(@PathVariable Integer id){
        return ResponseEntity.ok(userService.delete(id));

    }


}
