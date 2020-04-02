/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pp_fp_10;

/**
 *
 * @author Jéssica Beatriz
 */
public class LargeGasStation extends GasStation implements CoffeeService{
    private double coffeePrice;

    public LargeGasStation(double gasprice, String name, int vatNumber, double coffeePrice) {
        super(gasprice, name, vatNumber);
        this.coffeePrice = coffeePrice;
    }

    @Override
    public double getCoffeePrice() {
        return this.coffeePrice;
    }

    @Override
    public void setCoffeePrice(double p) {
        this.coffeePrice = p;
    }

    @Override
    public double getCoffeeTotal(int coffees) {
        double total = 0;
        
        total = coffees * this.coffeePrice;
        
        return total;
    }

    @Override
    public String toString() {
        String s = "";
        s+= super.toString();
        s+= "Preço do café: " + this.coffeePrice + "\n";
        return s;
    }
}
