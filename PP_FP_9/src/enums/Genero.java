/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package enums;

/**
 *
 * @author Jéssica Beatriz
 */

/**
 * Enumeração do género
 */
public enum Genero {
    F, M;
    
    public static String Genero(Genero gen){
        switch(gen){
            case M:
                return "Masculino";
                
            case F:
                return "Feminino";
                
            default:
                return "Género não é válido.";
        }
    }
}
