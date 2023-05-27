package com.example.rest.Service;

import com.example.rest.Entity.UserEntity;
import com.example.rest.Model.User;
import com.example.rest.Repository.UserRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService {
   @Autowired
    public UserRepo userRepo;

    public UserEntity registration(UserEntity user){
       return userRepo.save(user);
    }

    public User getUsersById(Integer id){
        UserEntity user = userRepo.findById(id).get();
        return User.toModel(user);
    }

    public Integer delete(Integer id){
       userRepo.deleteById(id);
       return id;
    }







}
