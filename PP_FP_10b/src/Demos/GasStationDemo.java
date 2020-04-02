package Demos;

import pkg2019_pp_fp_10.GasStation;

public class GasStationDemo {

    public static void main(String[] args) {
        //instancia de um posto de combustível
        GasStation estacao = new GasStation("Galp", 1, 5);
        
        //calcular o preço total a pagar
        System.out.println(estacao.getGasTotal(5));
        
        //printar todas as informações do posto de combustível
        System.out.println(estacao.toString());
        
        //alterar o preço do combustível
        estacao.setGasPrice(3);
        System.out.println(estacao.getGasTotal(5));
    }
}
