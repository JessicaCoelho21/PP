package pkg2019_pp_fp_10;

import java.util.Date;

public class JumbHipermarket extends Hipermarket {

    /**
     * Método construtor
     *
     * @param annualRate
     * @param potatoesPrice
     * @param name
     * @param vatNumber
     * @param gasPrice
     * @param coffePrice
     */
    public JumbHipermarket(double annualRate, double potatoesPrice, String name, int vatNumber, double gasPrice, double coffePrice) {
        super(annualRate, potatoesPrice, name, vatNumber, gasPrice, coffePrice);
    }

    /**
     * Método para obter os pontos
     * @param purchaseValue
     * @return 
     */
    @Override
    public int getPoints(double purchaseValue) {
        Date data = new Date(System.currentTimeMillis());

        int points = 0;

        if (data.getDay() == 0 || data.getDay() == 6) {
            while (purchaseValue >= 10) {
                points = points + 1;
                purchaseValue = purchaseValue - 10;
            }
        } else {
            while (purchaseValue >= 10) {
                points = points + 3;
                purchaseValue = purchaseValue - 10;
            }
        }

        return points;
    }
}
