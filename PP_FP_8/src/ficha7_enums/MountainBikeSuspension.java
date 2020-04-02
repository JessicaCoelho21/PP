package ficha7_enums;

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
