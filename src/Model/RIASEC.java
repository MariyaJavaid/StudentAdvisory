/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

/**
 *
 * @author owner
 */
public class RIASEC {
   int Realistic;
   int investigative;
    int Artistic;
    int Social;
    int Enterprising; 
    int Conventional;
 public boolean valid;
    public int getRealistic() {
        return Realistic;
    }

    public void setRealistic(int Realistic) {
        this.Realistic = Realistic;
    }

    public int getInvestigative() {
        return investigative;
    }

    public void setInvestigative(int investigative) {
        this.investigative = investigative;
    }

    public int getArtistic() {
        return Artistic;
    }

    public void setArtistic(int Artistic) {
        this.Artistic = Artistic;
    }

    public int getSocial() {
        return Social;
    }

    public void setSocial(int Social) {
        this.Social = Social;
    }

    public int getEnterprising() {
        return Enterprising;
    }

    public void setEnterprising(int Enterprising) {
        this.Enterprising = Enterprising;
    }

    public int getConventional() {
        return Conventional;
    }

    public void setConventional(int Conventional) {
        this.Conventional = Conventional;
    }

     public boolean isValid() {
        return valid;
    }

    public void setValid(boolean valid) {
        this.valid = valid;
    }
    
    
}
