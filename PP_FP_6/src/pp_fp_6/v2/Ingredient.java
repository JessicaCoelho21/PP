package pp_fp_6.v2;

import enumerations.IngredientOrigin;

public class Ingredient {
    private int id;
    private String nome;
    private IngredientOrigin origin;

    /**
     * Método construtor para a criação de um instância (@link Ingredient ingredient)
     * @param id
     * @param nome
     * @param origin 
     */
    public Ingredient(int id, String nome, IngredientOrigin origin) {
        this.id = id;
        this.nome = nome;
        this.origin = origin;
    }

    /**
     * Método de acesso get (obter)
     * Quer-se obter o id do ingrediente
     * @return 
     */
    public int getId() {
        return id;
    }

    /**
     * Método de acesso set (atribuir)
     * Quer-se atribuir um id ao ingrediente
     * @param id 
     */
    public void setId(int id) {
        this.id = id;
    }

    /**
     * Método de acesso get (obter)
     * Quer-se obter o nome do ingrediente
     * @return 
     */
    public String getNome() {
        return nome;
    }

    /**
     * Método de acesso set (atribuir)
     * Quer-se atribuir um nome ao ingrediente
     * @param nome 
     */
    public void setNome(String nome) {
        this.nome = nome;
    }

    /**
     * Método de acesso get (obter)
     * Quer-se obter a origem do ingrediente
     * @return 
     */
    public IngredientOrigin getOrigin() {
        return origin;
    }

    /**
     * Método de acesso set (atribuir)
     * Quer-se atribuir uma origem ao ingrediente
     * @param origin 
     */
    public void setOrigin(IngredientOrigin origin) {
        this.origin = origin;
    }
}
