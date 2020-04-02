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
public class Supermarket extends Company implements MarketService{
    private double potatoesPrice;

    public Supermarket(double potatoesPrice, String name, int vatNumber) {
        super(name, vatNumber);
        this.potatoesPrice = potatoesPrice;
    }

    @Override
    public double getPotatoesPrice() {
        return this.potatoesPrice;
    }

    @Override
    public void setPotatoesPrice(double p) {
        this.potatoesPrice = p;
    }

    @Override
    public double getMarketTotal(double kilos) {
        double markettotal = 0;
        
        markettotal = this.potatoesPrice * kilos;
        
        return markettotal;
    }

    @Override
    public String toString() {
        String s = "";
        s+= super.toString();
        s+= "Preço das batatas: " + this.potatoesPrice;
        return s;
    }
    
    
}
