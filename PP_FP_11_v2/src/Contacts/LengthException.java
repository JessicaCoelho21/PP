package Contacts;

//Exceção caso o contacto não tenha 9 dígitos
public class LengthException extends Exception {
    
    public LengthException(){
        super();
    }

    public LengthException(String message) {
        super(message);
    }
}
