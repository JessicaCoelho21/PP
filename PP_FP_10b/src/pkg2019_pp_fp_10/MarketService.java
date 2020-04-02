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
 * Interface que representa os metodos de um Mercado
 * </p>
 */
public interface MarketService {
    
    /**
     * Método que obtém o preço das batatas
     * @return o preço das batatas
     */
    public double getPotatoesPrice();
    
    /**
     * Método que altera o preço das batatas
     * @param p - novo preço
     */
    public void setPotatoePrice(double p);
    
    /**
     * Método que calcula o total a pagar
     * @param quilos - quantidade de batatas
     * @return valor total a pagar
     */
    public double getMarketTotal(int quilos);
}
