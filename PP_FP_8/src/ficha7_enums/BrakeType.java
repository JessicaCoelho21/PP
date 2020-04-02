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
public enum BrakeType {
    H, P;
    
    public static String BrakesToString(BrakeType type){
        switch(type){
            case H:
                return "Travoes hidraulicos";
                
            case P:
                return "Travoes de pincas";
                
            default:
                return "Travoes nao validos.";
        }
    }
}
