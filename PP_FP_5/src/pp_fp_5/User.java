/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pp_fp_5;

import java.util.Date;

/**
 *
 * @author Jéssica Beatriz
 */
public class User {
    private static final int ID_SIZE = 3;
    
    protected char [] id;
    protected String name;
    protected String email;
    protected Date birthdate;
    protected Expenses[] expenses;
    protected Date validade = null;
    
    public User (char[] tempId, String tempName, String tempEmail, Date tempBirthdate, Expenses[] tempExpenses)
    {
        id = tempId;
        name = tempName;
        email = tempEmail;
        birthdate = tempBirthdate;
        expenses = tempExpenses;
    }
    
    public void addPrime(Date data, int valor)
        {
         if(valor>=1)
         {
             
         }
        }
}
