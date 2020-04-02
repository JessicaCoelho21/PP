package Demos;

import pkg2019_pp_fp_10.JumbHipermarket;

public class JumbHipermarketDemo {
    
    public static void main(String[] args) {
        JumbHipermarket jumbo = new JumbHipermarket(10, 5, "Jumbo", 1, 2, 1);
    
        System.out.println(jumbo.getPoints(10));
    }
}
