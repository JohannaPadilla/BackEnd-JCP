package com.portfolio.JCP.Entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Habilidades {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String nombreH;
    private String nivelH;
    
    //const

    public Habilidades() {
    }

    public Habilidades(String nombreH, String nivelH) {
        this.nombreH = nombreH;
        this.nivelH = nivelH;
    }
    
    //Get and set

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

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
