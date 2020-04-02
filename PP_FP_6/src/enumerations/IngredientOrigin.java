package enumerations;

public enum IngredientOrigin {
    ANIMAL, VEGETAL, MINERAL;
    
    public static String IngredientOriginToString(IngredientOrigin origin){
        switch(origin){
            case ANIMAL:
                return "The ingridients of this pizza are from animal origin.";
            case VEGETAL:
                return "The ingridients of this pizza are from vegetal origin.";
            case MINERAL:
                return "The ingridients of this pizza are from mineral origin.";
            default:
                return "The ingredients origin aren't valid.";
        }
    }
}
