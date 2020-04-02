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
public class GasStation extends Company implements GasService{
    private double gasprice;

    @Override
    public double getGasPrice() {
        return this.gasprice;
    }

    @Override
    public void setGasPrice(double p) {
        if (p < 0) {
            System.out.println("Erro");
        }
        
        else{
            this.gasprice = p;
        }
    }
    
    @Override
    public double getGasTotal(double litres){
        double gastotal = 0;
        gastotal = this.gasprice * litres;
        return gastotal;
    }

    public GasStation(double gasprice, String name, int vatNumber) {
        super(name, vatNumber);
        this.gasprice = gasprice;
    }

    @Override
    public String toString() {
        String s = "";
        s+=super.toString();
        s+= "Preço: " + this.gasprice;
        return s;
    }
}
