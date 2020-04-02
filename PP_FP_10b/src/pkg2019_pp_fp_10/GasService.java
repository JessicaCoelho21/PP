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
 * Interface que representa os metodos de Posto de Combustivel
 * </p>
 */
public interface GasService {
    
    /**
     * Método que obtem o preço do combustível
     * @return o preço do combustível
     */
    public double getGasPrice();
    
    /**
     * Método que altera o preço do combustível
     * @param p - novo preço
     */
    public void setGasPrice(double p);
    
    /**
     * Método que calcula o valor total a pagar
     * @param litres - numero de litros de combustível
     * @return o valor total a pagar
     */
    public double getGasTotal(double litres);
}
