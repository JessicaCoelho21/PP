package pp_fp_10_ex1_e_2;

public class Company {
    private String name;
    private int vatNumber; //contribuinte

    /**
     * Método get
     * @return 
     */
    public String getName() {
        return name;
    }

    /**
     * Método set
     * @param val 
     */
    public void setName(String val) {
        this.name = val;
    }

    /**
     * Método get
     * @return 
     */
    public int getVatNumber() {
        return vatNumber;
    }

    /**
     * Método set
     * @param val 
     */
    public void setVatNumber(int val) {
        this.vatNumber = val;
    }

    /**
     * Método construtor
     * @param name
     * @param vatNumber 
     */
    public Company(String name, int vatNumber) {
        this.name = name;
        this.vatNumber = vatNumber;
    }
    
    /**
     * Método toString
     * @return 
     */
    @Override
    public String toString() {
        String s = "";
        s+= "Nome: " + this.name + "\n";
        s+= "Número de Contribuinte: " + this.vatNumber + "\n";
        
        return s;
    }
}
