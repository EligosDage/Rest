package com.example.rest.Repository;

import com.example.rest.Entity.ChatEntity;
import org.springframework.data.repository.CrudRepository;

public interface ChatRepo extends CrudRepository<ChatEntity, Integer> {
}
