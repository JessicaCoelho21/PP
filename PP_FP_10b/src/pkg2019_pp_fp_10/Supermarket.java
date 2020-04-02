package pkg2019_pp_fp_10;

/**
 * <h3>
 * ESTG - Escola Superior de Tecnologia e Gestão<br>
 * IPP - Instituto Politécnico do Porto <br>
 * LEI - Licenciatura em Engenharia Informática<br>
 * PP - Paradigmas de Programação<br>
 * </h3>
 * <p>
 * <strong>Descrição: </strong><br>
 * Classe que representa a estrutura de um Supermercado
 * </p>
 */
public class Supermarket extends Company implements MarketService{
    
    /**
     * potatoesPrice - preço das batatas
     */
    private double potatoesPrice;

    /**
     * Método construtor que instancia um Supermercado
     * @param name - nome do Supermercado
     * @param vatNumber - numero de contribuinte do Supermercado
     * @param potatoesPrice - preço das batatas
     */
    public Supermarket(String name, int vatNumber, double potatoesPrice) {
        super(name, vatNumber);
        this.potatoesPrice = potatoesPrice;
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
     * Método que calcula o preço a pagar pelas batatas
     * @param quilos - quantidade de batatas
     * @return o valor total a pagar pelo cliente
     */
    @Override
    public double getMarketTotal(int quilos) {
        return quilos * this.potatoesPrice;
    }

    /**
     * Método toString()
     * @return uma String com todas as informações do Supermercado
     */
    @Override
    public String toString() {
        String s="";
        s+= super.toString();
        s+= this.potatoesPrice + "\n";
        
        return s;
    }
}
