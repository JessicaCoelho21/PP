/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pp_fp_10_ex3;

/**
 *
 * @author Jéssica Beatriz
 */
public class Company {
    private String name;
    private int vatNumber; //contribuinte

    public String getName() {
        return name;
    }

    public void setName(String val) {
        this.name = val;
    }

    public int getVatNumber() {
        return vatNumber;
    }

    public void setVatNumber(int val) {
        this.vatNumber = val;
    }

    public Company(String name, int vatNumber) {
        this.name = name;
        this.vatNumber = vatNumber;
    }
    
    @Override
    public String toString() {
        String s = "";
        s+= "Nome: " + this.name + "\n";
        s+= "Número de Contribuinte: " + this.vatNumber + "\n";
        return s;
    }
}
