package com.example.rest.Repository;

import com.example.rest.Entity.MessageEntity;
import org.springframework.data.repository.CrudRepository;

public interface MessageRepo extends CrudRepository<MessageEntity, Integer> {
}
