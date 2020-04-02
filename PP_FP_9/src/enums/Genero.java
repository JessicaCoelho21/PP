package enums;

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
