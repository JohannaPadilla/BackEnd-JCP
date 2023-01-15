/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.portfolio.JCP.Repository;

import com.portfolio.JCP.Entity.Cursos;
import java.util.Optional;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
/**
 *
 * @author johi7
 */
@Repository
public interface RCursos extends JpaRepository<Cursos, Integer>{
    public Optional<Cursos> findByCursoC(String cursoC);
    public boolean existsByCursoC(String CursoC);
}
