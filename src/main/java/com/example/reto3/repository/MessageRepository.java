package com.example.reto3.repository;

import com.example.reto3.entities.Message;
import com.example.reto3.repository.crudRepository.MessageCrudRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public class MessageRepository {

    @Autowired
    private MessageCrudRepository messageCrudRepository;

    public List<Message> getAll(){
        return (List<Message>) messageCrudRepository.findAll();
    }

    public Message save(Message c){
        return messageCrudRepository.save(c);
    }

    public void delete(Message c){
        messageCrudRepository.delete(c);
    }

    public Optional<Message> getById(int id){
        return messageCrudRepository.findById(id);
    }

}