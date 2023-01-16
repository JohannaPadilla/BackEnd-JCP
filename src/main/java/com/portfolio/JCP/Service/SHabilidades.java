package com.portfolio.JCP.Service;

import com.portfolio.JCP.Entity.Habilidades;
import com.portfolio.JCP.Repository.RHabilidades;
import java.util.List;
import java.util.Optional;
import javax.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
@Transactional
public class SHabilidades {
    @Autowired
    RHabilidades rHabilidades;
    
    public List<Habilidades> list(){
        return rHabilidades.findAll();
    }
    
    public Optional<Habilidades> getOne(int id){
        return rHabilidades.findById(id);
    }
    
    public Optional<Habilidades> getbyNombreH(String nombreH){
        return rHabilidades.findByNombreH(nombreH);
    }
    
    public void save(Habilidades habi){
        rHabilidades.save(habi);
    }
    
    public void delete(int id){
        rHabilidades.deleteById(id);
    }
    
    public boolean existsById(int id){
        return rHabilidades.existsById(id);
    }
    
    public boolean existsByNombreH(String nombreH){
        return rHabilidades.existsByNombreH(nombreH);
    }
}
