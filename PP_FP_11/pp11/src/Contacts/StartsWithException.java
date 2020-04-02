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

//Exceção caso o nome do contacto ou país não começe com letra maíuscula, ou o indicativo não comece com 00
public class StartsWithException extends Exception{

    public StartsWithException(String message) {
        super(message);
    }
}
