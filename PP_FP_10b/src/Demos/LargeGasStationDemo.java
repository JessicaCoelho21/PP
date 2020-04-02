package Demos;

import pkg2019_pp_fp_10.LargeGasStation;

public class LargeGasStationDemo {
    
    public static void main(String[] args) {
        //instancia de um posto de combustível
        LargeGasStation estacao1 = new LargeGasStation("BP", 2, 3, 2);
        
        //calcular o preço total a pagar
        System.out.println(estacao1.getCoffeTotal(2));
        
        //printar todas as informações do posto de combustível
        System.out.println(estacao1.toString());
        
        //alterar o preço do café
        estacao1.setCoffePrice(5);
        System.out.println(estacao1.getCoffeTotal(2));
    }
}
