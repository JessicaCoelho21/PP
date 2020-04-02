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
 * Classe que representa a estrutura de um Posto de combustível
 * </p>
 */
public class LargeGasStation extends GasStation implements CoffeService{
    
    /**
     * coffePrice - preço do café
     */
    private double coffePrice;

    /**
     * Método construtor que instancia um posto de combustível
     * @param name - nome do posto de combustível
     * @param vatNumber - numero de contribuinte do posto de combustível
     * @param gasPrice - preço do combustível
     * @param coffePrice - preço do café
     */
    public LargeGasStation(String name, int vatNumber, double gasPrice, double coffePrice) {
        super(name, vatNumber, gasPrice);
        this.coffePrice = coffePrice;
    }

    /**
     * Método que obtém o preço do café
     * @return
     */
    @Override
    public double getCoffePrice() {
        return this.coffePrice;
    }

    /**
     * Método que atribui um preço ao café
     * @param p
     */
    @Override
    public void setCoffePrice(double p) {
        this.coffePrice = p;
    }

    /**
     * Método que calcula o preço total a pagar pelos cafés
     * @param n_coffe - numero de cafés
     * @return o valor total a pagar pelo cliente
     */
    @Override
    public double getCoffeTotal(int n_coffe) {
        return n_coffe * this.coffePrice;
    }

    /**
     * Método toString()
     * @return uma String com todas as informções do posto de combustível
     */
    @Override
    public String toString() {
        String s = "";
        s+=super.toString();
        s+="Preço Café: " + this.coffePrice + "\n";
        
        return s;
    }
    
    
}
