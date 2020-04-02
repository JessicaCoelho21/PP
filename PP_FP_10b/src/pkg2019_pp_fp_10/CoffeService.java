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
 * Interface que representa os metodos de um Café
 * </p>
 */
public interface CoffeService {
    /**
     * Método que obtém o preço do café
     * @return o preço do café
     */
    public double getCoffePrice();
    
    /**
     * Método que altera o preço do café
     * @param p - novo preço
     */
    public void setCoffePrice(double p);
    
    /**
     * Método que calcula o preço total a pagar peços cafés
     * @param n_coffe - numero de cafes
     * @return preço total a pagar
     */
    public double getCoffeTotal(int n_coffe);
}
