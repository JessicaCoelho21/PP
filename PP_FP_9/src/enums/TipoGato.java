package enums;

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
