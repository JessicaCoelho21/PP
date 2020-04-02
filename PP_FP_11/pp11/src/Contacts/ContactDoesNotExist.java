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

//Exceção caso o contacto não exista
public class ContactDoesNotExist extends Exception {

    public ContactDoesNotExist(String message) {
        super(message);
    }
}
