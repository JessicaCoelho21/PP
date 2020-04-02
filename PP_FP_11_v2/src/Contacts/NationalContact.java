package Contacts;

public class NationalContact extends Contact{

    /**
     * Método construtor para instanciar um número nacional
     * @param name
     * @param surname
     * @param number
     * @throws StartsWithException
     * @throws LengthException 
     */
    public NationalContact(String name, String surname, String number) throws StartsWithException, LengthException {
        super(name, surname, number);
    }
}
