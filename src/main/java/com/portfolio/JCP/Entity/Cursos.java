/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.portfolio.JCP.Entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

/**
 *
 * @author johi7
 */
@Entity
public class Cursos {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String institucionC;
    private String cursoC;
    private String infoC;
    private String enlaceC;
    
    // Const

    public Cursos() {
    }

    public Cursos(String institucionC, String cursoC, String infoC, String enlaceC) {
        this.institucionC = institucionC;
        this.cursoC = cursoC;
        this.infoC = infoC;
        this.enlaceC = enlaceC;
    }
    
    //Get and set

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getInstitucionC() {
        return institucionC;
    }

    public void setInstitucionC(String institucionC) {
        this.institucionC = institucionC;
    }

    public String getCursoC() {
        return cursoC;
    }

    public void setCursoC(String cursoC) {
        this.cursoC = cursoC;
    }

    public String getInfoC() {
        return infoC;
    }

    public void setInfoC(String infoC) {
        this.infoC = infoC;
    }

    public String getEnlaceC() {
        return enlaceC;
    }

    public void setEnlaceC(String enlaceC) {
        this.enlaceC = enlaceC;
    }
    
    
}
