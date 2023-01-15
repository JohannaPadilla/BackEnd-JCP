/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.portfolio.JCP.Dto;

import javax.validation.constraints.NotBlank;

/**
 *
 * @author johi7
 */
public class DtoCursos {
    @NotBlank
    private String institucionC;
    @NotBlank
    private String cursoC;
    @NotBlank
    private String infoC;
    @NotBlank
    private String enlaceC;
    
    //Const

    public DtoCursos() {
    }

    public DtoCursos(String institucionC, String cursoC, String infoC, String enlaceC) {
        this.institucionC = institucionC;
        this.cursoC = cursoC;
        this.infoC = infoC;
        this.enlaceC = enlaceC;
    }
    
    //Get and set

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
