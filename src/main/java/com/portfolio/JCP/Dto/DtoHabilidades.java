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
public class DtoHabilidades {
    @NotBlank
    private String nombreH;
    @NotBlank
    private String nivelH;
    
    //Const

    public DtoHabilidades() {
    }

    public DtoHabilidades(String nombreH, String nivelH) {
        this.nombreH = nombreH;
        this.nivelH = nivelH;
    }
    
    
    //Get and set

    public String getNombreH() {
        return nombreH;
    }

    public void setNombreH(String nombreH) {
        this.nombreH = nombreH;
    }

    public String getNivelH() {
        return nivelH;
    }

    public void setNivelH(String nivelH) {
        this.nivelH = nivelH;
    }
    
}
