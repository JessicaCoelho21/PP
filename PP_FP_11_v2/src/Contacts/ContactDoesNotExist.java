package Contacts;

//Exceção caso o contacto não exista
public class ContactDoesNotExist extends Exception {
    
    public ContactDoesNotExist(){
        super();
    }

    public ContactDoesNotExist(String message) {
        super(message);
    }
}
