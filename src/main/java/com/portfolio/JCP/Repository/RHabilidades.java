/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.portfolio.JCP.Repository;

import com.portfolio.JCP.Entity.Habilidades;
import java.util.Optional;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
/**
 *
 * @author johi7
 */
@Repository
public interface RHabilidades extends JpaRepository<Habilidades, Integer>{
    public Optional<Habilidades> findByNombreH (String nombreH);
    public boolean existsByNombreH (String nombreH);
}
