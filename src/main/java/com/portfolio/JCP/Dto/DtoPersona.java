package com.portfolio.JCP.Dto;

import javax.validation.constraints.NotBlank;

public class DtoPersona {
    @NotBlank
    private String nombre;
    @NotBlank
    private String apellido;
    @NotBlank
    private String img;
    
    
    //Const

    public DtoPersona() {
    }

    public DtoPersona(String nombre, String apellido, String img) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.img = img;
    }
    
    
    //Get and set

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getImg() {
        return img;
    }

    public void setImg(String img) {
        this.img = img;
    }
    
}
