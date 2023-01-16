package com.portfolio.JCP.Service;

import com.portfolio.JCP.Entity.Cursos;
import com.portfolio.JCP.Repository.RCursos;
import java.util.List;
import java.util.Optional;
import javax.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
@Transactional
public class SCursos {
    @Autowired
    RCursos rCursos;
    
    public List<Cursos> list(){
        return rCursos.findAll();
    }
    
    public Optional<Cursos> getOne(int id){
        return rCursos.findById(id);
    }
    
    public Optional<Cursos> getbyCursoC(String CursoC){
        return rCursos.findByCursoC(CursoC);
    }
    
    public void save(Cursos curs){
        rCursos.save(curs);
    }
    
    public void delete(int id){
        rCursos.deleteById(id);
    }
    
    public boolean existsById(int id){
        return rCursos.existsById(id);
    }
    
    public boolean existsByCursoC(String CursoC){
        return rCursos.existsByCursoC(CursoC);
    }
}
