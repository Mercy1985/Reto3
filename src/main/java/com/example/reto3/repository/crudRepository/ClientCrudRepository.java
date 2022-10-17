package com.example.reto3.repository.crudRepository;
import org.springframework.data.repository.CrudRepository;
import com.example.reto3.entities.Client;
public interface ClientCrudRepository extends CrudRepository<Client,Integer> {
}