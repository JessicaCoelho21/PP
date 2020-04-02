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
public enum Service {
    PASSEIO, ALOJAMENTO, TRANSPORTE, BANHO, TOSQUIA, SESSÃO;
    
     public static String Service(Service serviço){
        switch(serviço){
            case PASSEIO:
                return "Passeio";
                
            case ALOJAMENTO:
                return "Alojamento";
                
            case TRANSPORTE:
                return "Transporte";
                
            case BANHO:
                return "Banho";
                
            case TOSQUIA:
                return "Tosquia";
                
            case SESSÃO:
                return "Sessão Fotográfica";
                
            default:
                return "Serviço não é válido.";
        }
    }
}
