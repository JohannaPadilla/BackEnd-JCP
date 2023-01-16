package com.portfolio.JCP.Entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Acerca {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String infoA;
    
    
    //Const.
    public Acerca() {
    }

    public Acerca(String infoA) {
        this.infoA = infoA;
    }
    
    //Get and Set

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getInfoA() {
        return infoA;
    }

    public void setInfoA(String infoA) {
        this.infoA = infoA;
    }    
}
