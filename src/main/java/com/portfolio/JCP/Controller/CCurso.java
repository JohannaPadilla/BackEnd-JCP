package com.portfolio.JCP.Controller;


import com.portfolio.JCP.Dto.DtoCursos;
import com.portfolio.JCP.Entity.Cursos;
import com.portfolio.JCP.Security.Controller.Mensaje;
import com.portfolio.JCP.Service.SCursos;
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
@RequestMapping("/curs")
@CrossOrigin(origins = "https://frontend-jcp.web.app")
public class CCurso {
    @Autowired 
    SCursos sCursos;
    
    @GetMapping("/lista")
    public ResponseEntity<List<Cursos>> list(){
        List<Cursos> list = sCursos.list();
        return new ResponseEntity(list, HttpStatus.OK);
    }
    
    @PostMapping("/create")
    public ResponseEntity<?> create(@RequestBody DtoCursos dtocur){
        if(StringUtils.isBlank(dtocur.getCursoC()))
            return new ResponseEntity(new Mensaje("El nombre es obligatorio"), HttpStatus.BAD_REQUEST);
        if(sCursos.existsByCursoC(dtocur.getCursoC()))
            return new ResponseEntity (new Mensaje ("Esa cursos existe"), HttpStatus.BAD_REQUEST);
        
        Cursos cursos = new Cursos(dtocur.getInstitucionC(), dtocur.getCursoC(), dtocur.getInfoC(), dtocur.getEnlaceC());
        sCursos.save(cursos);
        
        return new ResponseEntity(new Mensaje("Esperiencia agregada"), HttpStatus.OK);
    }
    
    @PutMapping("/update/{id}")
    public ResponseEntity<?> update(@PathVariable("id") int id, @RequestBody DtoCursos dtoexp){
        
       //Valida si existe id
        if(!sCursos.existsById(id))
            return new ResponseEntity(new Mensaje("El ID no existe"), HttpStatus.BAD_REQUEST);
        //Compara nombre de cursos
        if(sCursos.existsByCursoC(dtoexp.getCursoC()) && sCursos.getbyCursoC(dtoexp.getCursoC()).get().getId() != id)
            return new ResponseEntity(new Mensaje("Esa cursos ya existe"), HttpStatus.BAD_REQUEST);
        //No puede estar vacio
        if(StringUtils.isBlank(dtoexp.getInstitucionC()))
            return new ResponseEntity(new Mensaje("El nombre es obligatorio"), HttpStatus.BAD_REQUEST);
        
        Cursos cursos = sCursos.getOne(id).get();
        cursos.setCursoC(dtoexp.getCursoC());
        cursos.setEnlaceC((dtoexp.getEnlaceC()));
        cursos.setInfoC((dtoexp.getInfoC()));
        cursos.setInstitucionC((dtoexp.getInstitucionC()));
        
        sCursos.save(cursos);
        return new ResponseEntity(new Mensaje("Cursos actualizada"), HttpStatus.OK);
    }
    
    @DeleteMapping("/delete/{id}")
    public ResponseEntity<?> delete(@PathVariable("id") int id){
        //Valida si existe id
        if(!sCursos.existsById(id))
            return new ResponseEntity(new Mensaje("El ID no existe"), HttpStatus.BAD_REQUEST);
        
        sCursos.delete(id);
        
        return new ResponseEntity(new Mensaje("Cursos eliminada"), HttpStatus.OK);
    }
    
    @GetMapping("/detail/{id}")
    public ResponseEntity<Cursos> getById(@PathVariable("id") int id){
        if(!sCursos.existsById(id))
            return new ResponseEntity(new Mensaje("no existe"), HttpStatus.NOT_FOUND);
        Cursos cursos = sCursos.getOne(id).get();
        return new ResponseEntity(cursos, HttpStatus.OK);
    }
}
