package pkg2019_pp_fp_10;

public abstract class Hipermarket extends LargeGasStation implements HipermarketService{
    /**
     * annualRate - taxa de juro anual
     */
    private double annualRate;
    
    /**
     * potatoesPrice - preço das batatas
     */
    private double potatoesPrice;

    /**
     * Método construtor que instancia um Hipermercado
     * @param annualRate - taxa de juro anual
     * @param potatoesPrice - preço das batatas
     * @param name - nome do Hipermercado
     * @param vatNumber - numero de contribuinte do Hipermercado
     * @param gasPrice - preço do Combustível
     * @param coffePrice - preço do café
     */
    public Hipermarket(double annualRate, double potatoesPrice, String name, int vatNumber, double gasPrice, double coffePrice) {
        super(name, vatNumber, gasPrice, coffePrice);
        this.annualRate = annualRate;
        this.potatoesPrice = potatoesPrice;
    }

    /**
     * Método que obtém a taxa de juro anual
     * @return
     */
    @Override
    public double getAnnualRate() {
        return this.annualRate;
    }

    /**
     * Método que atribui uma taxa de juro anual
     * @param r
     */
    @Override
    public void setAnnualRate(double r) {
        this.annualRate = r;
    }

    /**
     * Método que calcula o valor da prestação mensal a suportar pelo cliente
     * @param ammount - quantidade
     * @param months - meses
     * @return o valor da prestação mensal a suportar pelo cliente
     */
    @Override
    public double computeMonthlyPayment(double ammount, int months) {
        double monthlyRate = Math.pow(1 + this.annualRate, (double)1/(double)12)-1; //taxa mensal
        return ((monthlyRate * ammount)/(1-Math.pow(1 + monthlyRate, -months))); 
    }

    /**
     * Método que obtém o preço das batatas
     * @return
     */
    @Override
    public double getPotatoesPrice() {
        return this.potatoesPrice;
    }

    /**
     * Método que atribui um preço às batatas
     * @param p
     */
    @Override
    public void setPotatoePrice(double p) {
        this.potatoesPrice = p;
    }

    /**
     * Método que calcula o valor total das batatas a pagar pelo cliente
     * @param quilos - numero de quilos da batatas
     * @return o valor total a pagar pelo cliente
     */
    @Override
    public double getMarketTotal(int quilos) {
        return this.potatoesPrice * quilos;
    }
    
    /**
     * Método toString()
     * @return uma String com todas as informções do Hipermercado
     */
    @Override
    public String toString() {
        String s = "";
        s+= "Annual Rate: " + this.annualRate;
        s+= "Preço batatas por quilos: " + this.potatoesPrice;
        s+= super.toString();
        
        return s;
    }
    
    /**
     * Método abstrato
     * @param purchaseValue
     * @return 
     */
    public abstract int getPoints(double purchaseValue);
}