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
public class DtoAcerca {
    private String infoA;
    
    //Cont

    public DtoAcerca() {
    }
    
    public DtoAcerca(String infoA){
        this.infoA = infoA;
    }
    
    
    // Get and Set

    public String getInfoA() {
        return infoA;
    }

    public void setInfoA(String infoA) {
        this.infoA = infoA;
    }
    
}
