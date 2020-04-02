package pp_fp_6.v2;

import enumerations.IngredientOrigin;

public class PP_FP_6V2 {
    
    public static void main(String[] args) {
        /**
         * Imprime dos detalhes da pizza 1
         */
        Pizza p1 = new Pizza(0, "cheeseHam", "queijo e fiambre");
        System.out.println(p1.getId());
        System.out.println(p1.getDescription());
        System.out.println(p1.getName());
        System.out.println(p1.toString());
        
        /**
         * Imprime detalhes da pizza 2
         */
        Pizza p2 = new Pizza(1, "nome", "descricao");
        System.out.println(p2.getId());
        System.out.println(p2.getDescription());
        System.out.println(p2.getName());
        System.out.println(p2.toString());
        
        /**
         * Teste para adicionar ingredientes
         */
        Ingredient ing1 = new Ingredient(0, "queijo", IngredientOrigin.ANIMAL);
        p1.addIngredient(ing1);
        System.out.println(p1.getNumberOfIngredients());
    }
}
