/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ficha7_enums;

/**
 *
 * @author Jéssica Beatriz
 */
public enum Material {
    CARBONO, ALUMINIO;
    
    public static String MaterialToString(Material type){
        switch(type){
            case CARBONO:
                return "Bicicleta de carbono";
                
            case ALUMINIO:
                return "Bicicleda de aluminio";
                
            default:
                return "Materiais nao validos.";
        }
    }
}
