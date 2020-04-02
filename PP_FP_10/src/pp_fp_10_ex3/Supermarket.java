package pp_fp_10_ex3;

public class Supermarket extends Company implements MarketService{
    private double potatoesPrice;

    /**
     * Método construtor
     * @param potatoesPrice
     * @param name
     * @param vatNumber 
     */
    public Supermarket(double potatoesPrice, String name, int vatNumber) {
        super(name, vatNumber);
        this.potatoesPrice = potatoesPrice;
    }

    /**
     * Método get
     * @return 
     */
    @Override
    public double getPotatoesPrice() {
        return this.potatoesPrice;
    }

    /**
     * Método set
     * @param p 
     */
    @Override
    public void setPotatoesPrice(double p) {
        this.potatoesPrice = p;
    }

    /**
     * Método que obtém o custo total de batatas
     * @param kilos
     * @return 
     */
    @Override
    public double getMarketTotal(double kilos) {
        double markettotal = 0;
        
        markettotal = this.potatoesPrice * kilos;
        
        return markettotal;
    }

    /**
     * Método toString
     * @return 
     */
    @Override
    public String toString() {
        String s = "";
        s+= super.toString();
        s+= "Preço das batatas: " + this.potatoesPrice;
        
        return s;
    }
}
