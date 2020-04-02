package pp_fp_5;

import java.util.Date;

public class PP_FP_5 {
    public static void main(String[] args) {
        Date data1 = new Date(2019,1,1);
        Expenses ex1 = new Expenses(1, "car",1,data1,"Dolar");
        Expenses ex2 = new Expenses(1, "car",1,data1,"Iene");
        
        System.out.println(ex1.value);
        System.out.println(ex2.value);
        
        Expenses[] ex = new Expenses[]{ex1, ex2};
        
        User util = new User(new char[] {'G', 'H', 'J'}, "Jessica", "jscoelho21@gmail.com", data1, ex);
        
        System.out.println(System.currentTimeMillis()); //tempo atual
    }
}
