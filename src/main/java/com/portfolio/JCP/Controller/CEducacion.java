package com.portfolio.JCP.Controller;

import com.portfolio.JCP.Dto.DtoEducacion;
import com.portfolio.JCP.Entity.Educacion;
import com.portfolio.JCP.Security.Controller.Mensaje;
import com.portfolio.JCP.Service.SEducacion;
import java.util.List;
import org.apache.commons.lang3.StringUtils;
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
@RequestMapping("/educ")
@CrossOrigin(origins = "https://frontend-jcp.web.app")
public class CEducacion {
    @Autowired
    SEducacion sEducacion;
    
    @GetMapping("/lista")
    public ResponseEntity<List<Educacion>> list(){
        List<Educacion> list = sEducacion.list();
        return new ResponseEntity(list, HttpStatus.OK);
    }
    
    @PostMapping("/create")
    public ResponseEntity<?> create(@RequestBody DtoEducacion dtoedu){
        if(StringUtils.isBlank(dtoedu.getNombreEd()))
            return new ResponseEntity(new Mensaje("El nombre es obligatorio"), HttpStatus.BAD_REQUEST);
        if(sEducacion.existsByNombreEd(dtoedu.getNombreEd()))
            return new ResponseEntity (new Mensaje ("Esa experiencia existe"), HttpStatus.BAD_REQUEST);
        
        Educacion educacion = new Educacion(dtoedu.getNombreEd(), dtoedu.getTituloEd());
        sEducacion.save(educacion);
        
        return new ResponseEntity(new Mensaje("Esperiencia agregada"), HttpStatus.OK);
    }
    
    @PutMapping("/update/{id}")
    public ResponseEntity<?> update(@PathVariable("id") int id, @RequestBody DtoEducacion dtoedu){
        
       //Valida si existe id
        if(!sEducacion.existsById(id))
            return new ResponseEntity(new Mensaje("El ID no existe"), HttpStatus.BAD_REQUEST);
        //Compara nombre de experiencia
        if(sEducacion.existsByNombreEd(dtoedu.getNombreEd()) && sEducacion.getbyNombreEd(dtoedu.getNombreEd()).get().getId() != id)
            return new ResponseEntity(new Mensaje("Esa experiencia ya existe"), HttpStatus.BAD_REQUEST);
        //No puede estar vacio
        if(StringUtils.isBlank(dtoedu.getTituloEd()))
            return new ResponseEntity(new Mensaje("El nombre es obligatorio"), HttpStatus.BAD_REQUEST);
        
        Educacion educacion = sEducacion.getOne(id).get();
        educacion.setNombreEd(dtoedu.getNombreEd());
        educacion.setTituloEd((dtoedu.getTituloEd()));
        
        sEducacion.save(educacion);
        return new ResponseEntity(new Mensaje("Experiencia actualizada"), HttpStatus.OK);
    }
    
    @DeleteMapping("/delete/{id}")
    public ResponseEntity<?> delete(@PathVariable("id") int id){
        //Valida si existe id
        if(!sEducacion.existsById(id))
            return new ResponseEntity(new Mensaje("El ID no existe"), HttpStatus.BAD_REQUEST);
        
        sEducacion.delete(id);
        
        return new ResponseEntity(new Mensaje("Experiencia eliminada"), HttpStatus.OK);
    }
    
    @GetMapping("/detail/{id}")
    public ResponseEntity<Educacion> getById(@PathVariable("id") int id){
        if(!sEducacion.existsById(id))
            return new ResponseEntity(new Mensaje("no existe"), HttpStatus.NOT_FOUND);
        Educacion educacion = sEducacion.getOne(id).get();
        return new ResponseEntity(educacion, HttpStatus.OK);
    }
}
