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
public enum TamanhoDog {
    GRANDE, MÉDIO, PEQUENO;
    
     public static String TamanhoDog(TamanhoDog tam){
        switch(tam){
            case GRANDE:
                return "Grande";
                
            case MÉDIO:
                return "Médio";
                
            case PEQUENO:
                return "Pequeno";
                
            default:
                return "Tamanho não é válido.";
        }
    }
}
