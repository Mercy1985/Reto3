package com.example.reto3.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.example.reto3.entities.Machine;
import com.example.reto3.entities.Category;
import com.example.reto3.repository.MachineRepository;


import java.util.List;
import java.util.Optional;

@Service
public class MachineService {

    @Autowired
    private MachineRepository machineRepository;

    public List<Machine> getAll(){
        return machineRepository.getAll();
    }

    public Optional<Machine>getById(int id){
        return machineRepository.getById(id);
    }

    public Machine save(Machine c){
        if(c.getId()==null){
            return machineRepository.save(c);
        }
        return c;
    }
    /*
    public boolean delete(int id){
        Optional<Machine> cOp= machineRepository.getById(id);
        if(cOp.isPresent()){
            machineRepository.delete(cOp.get());
            return true;
        }
        return false;
    }
    public Machine update(Machine c){
    validar los atributos -----
        if(c.getId()!=null){
            Optional<Machine> old= machineRepository.getById(c.getId());
            if(old.isPresent()){
                Machine k=old.get();
                if(c.getName()!=null){
                    k.setName(c.getName());
                }
                if(c.getDescription()!=null){
                    k.setDescription(c.getDescription());
                }
                if(c.getTarget()!=null){
                    k.setTarget(c.getTarget());
                }
                if(c.getCapacity()!=null){
                    k.setCapacity(c.getCapacity());
                }
                if(c.getCategory()!=null){
                    k.setCategory(c.getCategory());
                }
                return libraryRepository.save(k);
            }
        }
        return c;
    }*/
}
