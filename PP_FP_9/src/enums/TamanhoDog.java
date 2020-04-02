package enums;

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
