package enumerations;

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
