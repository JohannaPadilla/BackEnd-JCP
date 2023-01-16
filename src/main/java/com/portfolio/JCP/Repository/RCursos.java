package com.portfolio.JCP.Repository;

import com.portfolio.JCP.Entity.Cursos;
import java.util.Optional;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RCursos extends JpaRepository<Cursos, Integer>{
    public Optional<Cursos> findByCursoC(String cursoC);
    public boolean existsByCursoC(String CursoC);
}
