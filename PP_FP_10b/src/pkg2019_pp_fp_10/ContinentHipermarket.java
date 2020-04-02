package pkg2019_pp_fp_10;

import java.util.Date;

public class ContinentHipermarket extends Hipermarket{

    /**
     * Método construtor
     * @param annualRate
     * @param potatoesPrice
     * @param name
     * @param vatNumber
     * @param gasPrice
     * @param coffePrice 
     */
    public ContinentHipermarket(double annualRate, double potatoesPrice, String name, int vatNumber, double gasPrice, double coffePrice) {
        super(annualRate, potatoesPrice, name, vatNumber, gasPrice, coffePrice);
    }
    
    /**
     * Método get
     * @param purchaseValue
     * @return 
     */
    @Override
    public int getPoints(double purchaseValue){
        Date data = new Date(System.currentTimeMillis());
        
        int points = 0;
        
        if(data.getDate() <= 20) {
            while(purchaseValue >= 5){
                points = points + 1;
                purchaseValue = purchaseValue - 5;
            }
        } else{
            while(purchaseValue >= 20){
                points = points + 3;
                purchaseValue = purchaseValue - 20;
            }
        }
        
        return points;
    }
}
