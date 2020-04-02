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
public enum MountainBikeSuspension {
    SIMPLES, DUPLA, SEM;
    
    public static String MountainBikeSuspensionToString(MountainBikeSuspension type){
        switch(type){
            case SIMPLES:
                return "Suspensao simples";
                
            case DUPLA:
                return "Suspensao dupla";
                
            case SEM:
                return "Sem suspensao";
                
            default:
                return "Suspensao nao valida.";
        }
    }
}
