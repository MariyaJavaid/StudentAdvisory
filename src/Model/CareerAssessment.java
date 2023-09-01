/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

/**
 *
 * @author owner
 */
public class CareerAssessment {
    public static String[] careerset;
    RIASEC traits;

    public RIASEC getTraits() {
        return traits;
    }

    public void setTraits(RIASEC traits) {
        this.traits = traits;
    }
    Big5 traits1;

    public CareerAssessment() {
        System.out.println("default constructor called");
       
    }

    public Big5 getTraits1() {
        return traits1;
    }

    public void setTraits1(Big5 traits1) {
        this.traits1 = traits1;
    }

    public Needs getTraits2() {
        return traits2;
    }

    public void setTraits2(Needs traits2) {
        this.traits2 = traits2;
    }

    public Values getTraits3() {
        return traits3;
    }

    public void setTraits3(Values traits3) {
        this.traits3 = traits3;
    }

    public String getCareerset1() {
        return careerset1;
    }

    public void setCareerset1(String careerset1) {
        this.careerset1 = careerset1;
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }
    Needs traits2;
    Values traits3;
    String careerset1;
    int size;

    public static String[] getCareerset() {
        return careerset;
    }

    public static void setCareerset(String[] careerset) {
        CareerAssessment.careerset = careerset;
    }
    
    public CareerAssessment(int size)
    {
     careerset=new String[size];   
    }    

   
}
