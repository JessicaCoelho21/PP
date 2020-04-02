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
public class GasStation extends Company implements GasService{
    
    /**
     * gasPrice - preço do combustível
     */
    private double gasPrice;

    /**
     * Método construtor para instanciar um posto de combustível
     * @param name - nome do posto de Combustível
     * @param vatNumber - numero de contribuinte do posto de Combustível
     * @param gasPrice - preço do combustível
     */
    public GasStation(String name, int vatNumber, double gasPrice) {
        super(name, vatNumber);
        this.gasPrice = gasPrice;
    }
    
    /**
     * Método que obtém o preço do combustível
     * @return
     */
    @Override
    public double getGasPrice() {
        return this.gasPrice;
    }

    /**
     * Método que atribui um preço ao combustível
     * @param p
     */
    @Override
    public void setGasPrice(double p) {
        if(p<0){
            System.out.println("Erro!");
        } else{
            this.gasPrice = p;
        }
    }

    /**
     * Método que calcula o preço total a pagar pelo cliente
     * @param litres - numero de litros de combustível
     * @return o valor total a pagar
     */
    @Override
    public double getGasTotal(double litres) {
         return this.gasPrice * litres;
    }

    /**
     * Método toString()
     * @return uma String com todas as informações do posto de combustível
     */
    @Override
    public String toString() {
        String s = "";
        s+=super.toString();
        s+="Preço Combustível: " + this.gasPrice + "\n";
        
        return s;
    }
}
