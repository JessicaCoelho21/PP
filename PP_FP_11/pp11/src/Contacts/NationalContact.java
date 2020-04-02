/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Contacts;

/**
 *
 * @author jpcm_
 */
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
