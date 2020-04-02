package pp_fp_10_ex3;

public class GasStation extends Company implements GasService{
    private double gasprice;

    /**
     * Método get
     * @return 
     */
    @Override
    public double getGasPrice() {
        return this.gasprice;
    }

    /**
     * Método set
     * @param p 
     */
    @Override
    public void setGasPrice(double p) {
        if (p < 0) {
            System.out.println("Erro");
        } else{
            this.gasprice = p;
        }
    }
    
    /**
     * Método que obtém o custo total de combustível
     * @param litres
     * @return 
     */
    @Override
    public double getGasTotal(double litres){
        double gastotal = 0;
        gastotal = this.gasprice * litres;
        return gastotal;
    }

    /**
     * Método construtor
     * @param gasprice
     * @param name
     * @param vatNumber 
     */
    public GasStation(double gasprice, String name, int vatNumber) {
        super(name, vatNumber);
        this.gasprice = gasprice;
    }

    /**
     * Método toString
     * @return 
     */
    @Override
    public String toString() {
        String s = "";
        s+=super.toString();
        s+= "Preço: " + this.gasprice;
        
        return s;
    }
}
