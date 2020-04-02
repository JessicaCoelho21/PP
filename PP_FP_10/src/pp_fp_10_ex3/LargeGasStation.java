package pp_fp_10_ex3;

public class LargeGasStation extends GasStation implements CoffeeService{
    private double coffeePrice;

    /**
     * Método construtor
     * @param gasprice
     * @param name
     * @param vatNumber
     * @param coffeePrice 
     */
    public LargeGasStation(double gasprice, String name, int vatNumber, double coffeePrice) {
        super(gasprice, name, vatNumber);
        this.coffeePrice = coffeePrice;
    }

    /**
     * Método get
     * @return 
     */
    @Override
    public double getCoffeePrice() {
        return this.coffeePrice;
    }

    /**
     * Método set
     * @param p 
     */
    @Override
    public void setCoffeePrice(double p) {
        this.coffeePrice = p;
    }

    /**
     * Método que obtém o custo total de café
     * @param coffees
     * @return 
     */
    @Override
    public double getCoffeeTotal(int coffees) {
        double total = 0;
        
        total = coffees * this.coffeePrice;
        
        return total;
    }

    /**
     * Método toString
     * @return 
     */
    @Override
    public String toString() {
        String s = "";
        s+= super.toString();
        s+= "Preço do café: " + this.coffeePrice + "\n";
        
        return s;
    }
}
