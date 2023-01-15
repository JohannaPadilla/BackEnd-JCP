/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.portfolio.JCP.Service;

import com.portfolio.JCP.Entity.Acerca;
import com.portfolio.JCP.Repository.RAcerca;
import java.util.List;
import java.util.Optional;
import javax.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author johi7
 */
@Service
@Transactional
public class SAcerca {
    @Autowired
    RAcerca rAcerca;
    
    public List<Acerca> list(){
        return rAcerca.findAll();
    }
    
    public Optional<Acerca> getOne(int id){
        return rAcerca.findById(id);
    }
    
    public Optional<Acerca> getbyInfoA(String infoA){
        return rAcerca.findByInfoA(infoA);
    }
    
    public void save(Acerca acer){
        rAcerca.save(acer);
    }
    
    public void delete(int id){
        rAcerca.deleteById(id);
    }
    
    public boolean existsById(int id){
        return rAcerca.existsById(id);
    }
    
    public boolean existsByInfoA(String infoA){
        return rAcerca.existsByInfoA(infoA);
    }
}
