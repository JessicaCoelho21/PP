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
 * Interface que representa os metodos de uma empresa de Contabilidade
 * </p>
 */
public interface CreditService {
    
    /**
     * Método que obtém a taxa de juro
     * @return a taxa de juro
     */
    public double getAnnualRate();
    
    /**
     * Método que altera a taxa de juro
     * @param r - novo valor
     */
    public void setAnnualRate(double r);
    
    /**
     * Método que calcula o valor da prestação mensal a suportar pelo cliente
     * @param ammount - quantidade
     * @param months - meses
     * @return o valor da prestação mensal a suportar pelo cliente
     */
    public double computeMonthlyPayment(double ammount, int months);
}
