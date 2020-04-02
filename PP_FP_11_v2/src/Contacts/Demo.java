package Contacts;

public class Demo {

    public static void main(String[] args) {
    
        ContactManagerAPI cm = new ContactManager();
        
        Contact ic1 = null;
        Contact ic2 = null;
        Contact ic3 = null;
        Contact ic4 = null;
        Contact nc5 = null;
        Contact ic6 = null;
        
        try {
            ic1 = new InternationalContact("00351" , "Portugal", "Jéssica", "Coelho", "123456789");
        } catch (StartsWithException  | LengthException ex) {
            System.out.println(ex);
        }
        
        try {
            ic2 = new InternationalContact("0034" , "Espanha", "Antonio", "Carabajal", "987654321");;
        } catch (StartsWithException  | LengthException ex) {
            System.out.println(ex);
        }
        
        try {
            ic3 = new InternationalContact("0049" , "Alemanha", "Evelyn", "Von Hardenburg", "876543210");
        } catch (StartsWithException  | LengthException ex) {
            System.out.println(ex);
        }
        
        try {
            ic4 = new InternationalContact("0033" , "França", "Jean-François", "Vérany", "012345678");
        } catch (StartsWithException  | LengthException ex) {
            System.out.println(ex);
        }
        
        try {
            nc5 = new NationalContact("Jéssica", "Coelho","987654321");
        } catch (StartsWithException  | LengthException ex) {
            System.out.println(ex);
        }
        
        Contact [] ctct = {ic1,ic2,ic3,ic4,nc5};
        
        cm.addContact(ic1);
        cm.addContact(ic2);
        
        System.out.println(cm.listAllContacts());
        
        try{
            cm.removeContact(ic1);
        } catch(NullPointerException ex ){
            System.out.println(ex);
        }
        
        System.out.println("\nRemovido!!\n");
        System.out.println(cm.listAllContacts());
        
        try{
            cm.removeContact(ic2);
        } catch(NullPointerException ex ){
            System.out.println(ex);
        }
        
        System.out.println("\nRemovido!!\n");
        
        try{
            cm.addContact(ic6);
        } catch(NullPointerException ex){
            System.out.println(ex);
        }

        System.out.println("...");
        
        System.out.println(cm.listAllContacts());
        
        for(int i = 0; i < 5; i++){
            try{
                cm.addContact(ctct[i]);
            } catch(NullPointerException ex){
                System.out.println(ex);
            }
        }
        
        System.out.println(cm.listAllContacts());
        
        cm.removeContact(ic3);
        
        System.out.println("\nRemovido!!\n");
        
        System.out.println(cm.listAllContacts());
    }
}