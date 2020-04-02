/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Contacts;

import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author jpcm_
 */
public class Demo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    
        ContactManagerAPI cm = new ContactManager();
        
        Contact ic1 = null;
        Contact ic2 = null;
        Contact ic3 = null;
        Contact ic4 = null;
        Contact nc5 = null;
        Contact ic6 = null;
        
        try {
            ic1 = new InternationalContact("00351" , "Portugal", "João", "Moreira", "938725605");
        } 
        catch (StartsWithException  | LengthException ex) {
            System.out.println(ex);
        }
        try {
            ic2 = new InternationalContact("0034" , "Espanha", "Catarina", "Moreira", "919081292");;
        } catch (StartsWithException  | LengthException ex) {
            System.out.println(ex);
        }
        try {
            ic3 = new InternationalContact("0049" , "Alemanha", "Pedro", "Moreira", "938725604");
        } catch (StartsWithException  | LengthException ex) {
            System.out.println(ex);
        }
        try {
            ic4 = new InternationalContact("0033" , "França", "Tiago", "Oliveira", "918725605");
        } catch (StartsWithException  | LengthException ex) {
            System.out.println(ex);
        }
        try {
            nc5 = new NationalContact("João", "Moreira","938725605");
        } catch (StartsWithException  | LengthException ex) {
            System.out.println(ex);
        }
        
        Contact [] ctct = {ic1,ic2,ic3,ic4,nc5};
        
        cm.addContact(ic1);
        cm.addContact(ic2);
        
        System.out.println(cm.listAllContacts());
        
        try{
            cm.removeContact(ic1);
        }
        
        catch(NullPointerException ex ){
            System.out.println(ex);
        }
        
        System.out.println("\n JÁ REMOVI !! \n");
        
        System.out.println(cm.listAllContacts());
        
        try{
            cm.removeContact(ic2);
        }
        
        catch(NullPointerException ex ){
            System.out.println(ex);
        }
        
        System.out.println("\n JÁ REMOVI !! \n");
        
        try{
            cm.addContact(ic6);
        }
        
        catch(NullPointerException ex){
            System.out.println(ex);
        }

        System.out.println("ADICIONEI UM NULO PÓ CARALHO");
        
        System.out.println(cm.listAllContacts());
        
        for(int i = 0; i < 5; i++){
            try{
                cm.addContact(ctct[i]);
            }
            
            catch(NullPointerException ex){
                System.out.println(ex);
            }
        }
        
        System.out.println(cm.listAllContacts());
        
        cm.removeContact(ic3);
        
        System.out.println("REMOVI O PEDRO");
        
        System.out.println(cm.listAllContacts());
    }
}