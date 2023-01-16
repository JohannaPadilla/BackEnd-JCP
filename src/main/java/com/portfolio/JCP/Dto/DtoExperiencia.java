package com.portfolio.JCP.Dto;

import javax.validation.constraints.NotBlank;

public class DtoExperiencia {
    @NotBlank
    private String nombreE;
    @NotBlank
    private String descripcionE;
    @NotBlank
    private String empresaE;
    
    //Const.

    public DtoExperiencia(String nombreE, String descripcionE, String empresaE) {
        this.nombreE = nombreE;
        this.descripcionE = descripcionE;
        this.empresaE = empresaE;
    }
    
    // Get and Set

    public String getNombreE() {
        return nombreE;
    }

    public void setNombreE(String nombreE) {
        this.nombreE = nombreE;
    }

    public String getDescripcionE() {
        return descripcionE;
    }

    public void setDescripcionE(String descripcionE) {
        this.descripcionE = descripcionE;
    }

    public String getEmpresaE() {
        return empresaE;
    }

    public void setEmpresaE(String empresaE) {
        this.empresaE = empresaE;
    }
    
    
}
