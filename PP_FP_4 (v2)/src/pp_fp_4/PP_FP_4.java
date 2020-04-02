package pp_fp_4;

public class PP_FP_4 {
    
    private static final int ID_SIZE  = 3;
    protected static char[] id = new char [ID_SIZE];
    protected static char[] name;
    protected static char[] email;

    private int b;
    //public int getB()

    static PP_FP_4 user1;

    public static void main(String[] args) {
        PP_FP_4 user1 = new PP_FP_4();
        PP_FP_4 user2 = new PP_FP_4();
        
        user1.id[0] = 'A';
        user1.id[1] = 'B';
        user1.id[2] = 'C';
        user1.name = new char[]{'J', 'e', 's', 's', 'i', 'c', 'a'};
        user1.email = new char[]{'j', 's', 'c', '@', 'e', 's', 't', 'g', '.', 'i', 'p', 'p', '.', 'p', 't'};
        //user1.setB(1);
        
        System.out.println("------User 1------");
        System.out.print("ID: ");
        System.out.println(user1.id);
        System.out.print("Name: ");
        System.out.print(user1.id);
        System.out.println("Email: ");
        System.out.println(user1.email);
    }
}

