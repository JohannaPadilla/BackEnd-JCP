package com.portfolio.JCP.Dto;

import javax.validation.constraints.NotBlank;

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
