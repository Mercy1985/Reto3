package com.example.reto3.service;
import com.example.reto3.entities.Client;
import com.example.reto3.entities.Message;
import com.example.reto3.repository.ClientRepository;
import com.example.reto3.repository.MessageRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class MessageService {

    @Autowired
    private MessageRepository messageRepository;

    public List<Message> getAll(){
        return messageRepository.getAll();
    }

    public Optional<Message>getById(int id){
        return messageRepository.getById(id);
    }
    public Message save(Message c){
        if(c.getIdMessage()==null){
            return messageRepository.save(c);
        }
        return c;
    }

}


