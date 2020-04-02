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
public enum TipoGato {
    INTERIOR, EXTERIOR;
    
     public static String TipoGato(TipoGato type){
        switch(type){
            case INTERIOR:
                return "Gato de Interior";
                
            case EXTERIOR:
                return "Gato de Exterior";
                
            default:
                return "O tipo do gato não é válido.";
        }
    }
}
