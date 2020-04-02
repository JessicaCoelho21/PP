package pp_fp_10_ex1_e_2;

public class PP_FP_10 {
    
    public static void main(String[] args) {
        GasStation demo = new GasStation(2, "Galp", 2);
        System.out.println(demo.getGasTotal(5));
        System.out.println(demo.toString());
        demo.setGasPrice(3);
        System.out.println("Total: " + demo.getGasTotal(10));
        
        LargeGasStation demo2 = new LargeGasStation(2, "Galp", 2, 1);
        System.out.println(demo2.getCoffeeTotal(2));
        System.out.println(demo2.toString());
        
    }
}
