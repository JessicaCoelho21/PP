package Demos;

import pkg2019_pp_fp_10.Supermarket;

public class SupermarketDemo {

    public static void main(String[] args) {
        //instancia de um Supermercado
        Supermarket s1 = new Supermarket("Minipreço", 1, 4);
        
        //calcular o preço total a pagar
        System.out.println(s1.getMarketTotal(2));
        
        //printar todas as informações do Supermercado
        System.out.println(s1.toString());
        
        //alterar o preço das batatas
        s1.setPotatoePrice(2);
        System.out.println(s1.getMarketTotal(2));
    }
}
