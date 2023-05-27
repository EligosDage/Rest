package com.example.rest.Repository;

import com.example.rest.Entity.UserEntity;
import org.springframework.data.repository.CrudRepository;


public interface UserRepo extends CrudRepository<UserEntity, Integer> {

}
