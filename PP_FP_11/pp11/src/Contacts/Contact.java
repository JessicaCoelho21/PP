/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Contacts;

import java.util.Objects;

/**
 *
 * @author jpcm_
 */
public abstract class Contact {
    
    private String name;
    private String surname;
    private String number;

    /**
     * Método construtor
     * @param name
     * @param surname
     * @param number
     * @throws StartsWithException
     * @throws LengthException 
     */
    public Contact(String name, String surname, String number) throws StartsWithException, LengthException {
        //Se o nome recebido não começar com letra maiúscula, lança exceção
        if(!(name.substring(0, 1).equals(name.substring(0,1).toUpperCase()))){
            throw  new StartsWithException("Doesn't start with UpperCase on the 1st letter in name!");
        }
        
        //Se o apelido recebido não começar com letra maiúscula, lança exceção
        if(!(surname.substring(0, 1).equals(surname.substring(0,1).toUpperCase()))){
            throw  new StartsWithException("Doesn't start with UpperCase on the 1st letter in name!");
        }
        
        //Se o número de telefone recebido não tiver 9 dígitos, lança exceção
        if((number.length() != 9)){
            throw new LengthException("Doesn't have 9 digits!");
        }
        
        this.name = name;
        this.surname = surname;
        this.number = number;
    }

    /**
     * Método construtor
     */
    public Contact() {
    }   

    /**
     * Método getter que obtem o nome
     * @return nome
     */
    public String getName() {
        return name;
    }

    /**
     * Método setter para atribuir um nome
     * @param name
     * @throws StartsWithException 
     */
    public void setName(String name) throws StartsWithException {
        //Se o nome recebido não começar por letra maiúscula, lança exceção
        if(!(name.substring(0, 1).equals(name.substring(0,1).toUpperCase()))){
            throw  new StartsWithException("Doesn't start with UpperCase on the 1st letter in name!");
        }
        
        this.name = name;
    }

    /**
     * Método getter para obter o apelido
     * @return 
     */
    public String getSurname() {
        return surname;
    }

    /**
     * Método setter para atribuir um apelido
     * @param surname
     * @throws StartsWithException 
     */
    public void setSurname(String surname) throws StartsWithException {
        //Se o nome recebido não começar por letra maiúscula, lança exceção
        if(!(surname.substring(0, 1).equals(surname.substring(0,1).toUpperCase()))){
            throw  new StartsWithException("Doesn't start with UpperCase on the 1st letter in name!");
        }
        
        this.surname = surname;
    }

    /**
     * Método getter para obter o número de telefone
     * @return número de telefone
     */
    public String getNumber() {
        return number;
    }

    /**
     * Método setter para atribuir um número de telefone
     * @param number
     * @throws LengthException 
     */
    public void setNumber(String number) throws LengthException {
        //Se o número de telefone não tiver 9 dígitos, lança exceção
        if((number.length()!=9)){
            throw new LengthException("Doesn't have 9 digits!");
        }
        
        this.number = number;
    }

    /**
     * Método toString
     * @return 
     */
    @Override
    public String toString() {
        String s = "";
        s += "Name: " + this.name + "\n";
        s += "Surname: " + this.surname + "\n";
        s += "Number: " + this.number + "\n";
        return s;
    }

    /**
     * Método equals
     * @param obj
     * @return 
     */
    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        
        if (obj == null) {
            return false;
        }
        
        if (getClass() != obj.getClass()) {
            return false;
        }
        
        final Contact other = (Contact) obj;
        
        if (!Objects.equals(this.name, other.name)) {
            return false;
        }
        
        if (!Objects.equals(this.surname, other.surname)) {
            return false;
        }
        
        if (!Objects.equals(this.number, other.number)) {
            return false;
        }
        
        return true;
    }
}