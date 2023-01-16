package com.portfolio.JCP.Dto;

import javax.validation.constraints.NotBlank;

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
