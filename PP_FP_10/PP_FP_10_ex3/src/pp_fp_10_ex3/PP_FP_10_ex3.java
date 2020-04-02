/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pp_fp_10_ex3;

/**
 *
 * @author Jéssica Beatriz
 */
public class PP_FP_10_ex3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Supermarket demo = new Supermarket(3, "Continente", 4);
        System.out.println("Total: " + demo.getMarketTotal(3));
        System.out.println(demo.toString());
    }
}
