package com.portfolio.JCP.Controller;

import com.portfolio.JCP.Dto.DtoAcerca;
import com.portfolio.JCP.Entity.Acerca;
import com.portfolio.JCP.Security.Controller.Mensaje;
import com.portfolio.JCP.Service.SAcerca;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/aceinf")
@CrossOrigin(origins = "https://frontend-jcp.web.app")
public class CAcerca {
    @Autowired
    SAcerca sAcerca;
    
    @GetMapping("/lista")
    public ResponseEntity<List<Acerca>> list(){
        List<Acerca> list = sAcerca.list();
        return new ResponseEntity(list, HttpStatus.OK);
    }
    
    @PostMapping("/create")
    public ResponseEntity<?> create(@RequestBody DtoAcerca dtoace){
        //if(StringUtils.isBlank(dtoace.getInfoA()))
            //return new ResponseEntity(new Mensaje("El nombre es obligatorio"), HttpStatus.BAD_REQUEST);
        if(sAcerca.existsByInfoA(dtoace.getInfoA()))
            return new ResponseEntity (new Mensaje ("Esa experiencia existe"), HttpStatus.BAD_REQUEST);
        
        Acerca acerca = new Acerca (dtoace.getInfoA());
        sAcerca.save(acerca);
        
        return new ResponseEntity(new Mensaje("Esperiencia agregada"), HttpStatus.OK);
    }
    
    @PutMapping("/update/{id}")
    public ResponseEntity<?> update(@PathVariable("id") int id, @RequestBody DtoAcerca dtoace){
        
       //Valida si existe id
        if(!sAcerca.existsById(id))
            return new ResponseEntity(new Mensaje("El ID no existe"), HttpStatus.BAD_REQUEST);
        //Compara nombre de experiencia
        if(sAcerca.existsByInfoA(dtoace.getInfoA()) && sAcerca.getbyInfoA(dtoace.getInfoA()).get().getId() != id)
            return new ResponseEntity(new Mensaje("Esa experiencia ya existe"), HttpStatus.BAD_REQUEST);
        //No puede estar vacio
        //if(StringUtils.isBlank(dtoace.getInfoA()))
            //return new ResponseEntity(new Mensaje("El nombre es obligatorio"), HttpStatus.BAD_REQUEST);
        
        Acerca acerca = sAcerca.getOne(id).get();
        acerca.setInfoA(dtoace.getInfoA());
        
        sAcerca.save(acerca);
        return new ResponseEntity(new Mensaje("Experiencia actualizada"), HttpStatus.OK);
    }
    
    @DeleteMapping("/delete/{id}")
    public ResponseEntity<?> delete(@PathVariable("id") int id){
        //Valida si existe id
        if(!sAcerca.existsById(id))
            return new ResponseEntity(new Mensaje("El ID no existe"), HttpStatus.BAD_REQUEST);
        
        sAcerca.delete(id);
        
        return new ResponseEntity(new Mensaje("Experiencia eliminada"), HttpStatus.OK);
    }
    
    @GetMapping("/detail/{id}")
    public ResponseEntity<Acerca> getById(@PathVariable("id") int id){
        if(!sAcerca.existsById(id))
            return new ResponseEntity(new Mensaje("no existe"), HttpStatus.NOT_FOUND);
        Acerca acerca = sAcerca.getOne(id).get();
        return new ResponseEntity(acerca, HttpStatus.OK);
    }
}
