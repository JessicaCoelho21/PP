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
 * Classe que representa a estrutura de uma Empresa
 * </p>
 */
public abstract class Company {
    /**
     * name - nome da Empresa
     */
    private String name;
    
    /**
     * varNumber - numero de contribuinte da Empresa
     */
    private int vatNumber;

    /**
     * Método construtor para instanciar uma Empresa
     * @param name - nome da Empresa
     * @param vatNumber - numero de contribuinte da Empresa
     */
    public Company(String name, int vatNumber) {
        this.name = name;
        this.vatNumber = vatNumber;
    }
    
    /**
     * Método para obter o nome da empresa
     * @return
     */
    public String getName() {
        return name;
    }

    /**
     * Método para atribuir o nome à empresa
     * @param name
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * Método para obter o número de contribuinte da empresa
     * @return
     */
    public int getVatNumber() {
        return vatNumber;
    }

    /**
     * Método para atribuir um número de contribuinte à empresa
     * @param vatNumber
     */
    public void setVatNumber(int vatNumber) {
        this.vatNumber = vatNumber;
    }

    /**
     * Método toString()
     * @return uma String com todas as informações da Empresa
     */
    @Override
    public String toString() {
        String s = "";
        s+="Nome: " + this.name + "\n";
        s+="Nº contribuinte: " + this.vatNumber + "\n";
        
        return s;
    }
}
