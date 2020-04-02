package pp_fp_10_ex3;

public class PP_FP_10_ex3 {

    public static void main(String[] args) {
        Supermarket demo = new Supermarket(3, "Continente", 4);
        System.out.println("Total: " + demo.getMarketTotal(3));
        System.out.println(demo.toString());
    }
}
