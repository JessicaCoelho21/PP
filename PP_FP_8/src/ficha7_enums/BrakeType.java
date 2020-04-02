package ficha7_enums;

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
