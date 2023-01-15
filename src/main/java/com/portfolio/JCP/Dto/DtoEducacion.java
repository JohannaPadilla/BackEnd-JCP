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
public class DtoEducacion {
    @NotBlank
    private String nombreEd;
    @NotBlank
    private String tituloEd;
    
    //Const

    public DtoEducacion() {
    }

    public DtoEducacion(String nombreEd, String tituloEd) {
        this.nombreEd = nombreEd;
        this.tituloEd = tituloEd;
    }
    
    //Get and set

    public String getNombreEd() {
        return nombreEd;
    }

    public void setNombreEd(String nombreEd) {
        this.nombreEd = nombreEd;
    }

    public String getTituloEd() {
        return tituloEd;
    }

    public void setTituloEd(String tituloEd) {
        this.tituloEd = tituloEd;
    }
    
}
