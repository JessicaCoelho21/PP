package Contacts;

//Exceção caso o nome do contacto ou país não começe com letra maíuscula, ou o indicativo não comece com 00
public class StartsWithException extends Exception{
    
    public StartsWithException(){
        super();
    }

    public StartsWithException(String message) {
        super(message);
    }
}
