package pp_fp_6.v2;

import enumerations.PizzaSize;

/**
 * <h3>
 * ESTG - Escola Superior de Tecnologia e Gestão <br>
 * IPP - Instituto Politécnico do Porto <br>
 * LEI - Licenciatura em Engenharia Informática<br>
 * PP - Paradigmas de Programação <br>
 * </h3>
 * <p>
 * <strong>Descrição: </strong><br>
 * Classe que representa a estrutura de uma pizza
 * </p>
 */
public class Pizza {
    private final int MAX_INGREDIENTS = 5;
    private int id;
    private String name;
    private String description;
    private Ingredient[] ingredients;
    private int numberOfIngredients;
    private PizzaSize size;

    /**
     * Método construtor para a criação de uma instância de {@link Pizza pizza}.
     * @param id Código que identifica uma <b>Pizza</b>
     * @param name Nome da <b>Pizza</b>
     * @param description Descrição resumida da <b>Pizza</b>
     */
    public Pizza(int id, String name, String description) {
        numberOfIngredients = 0;
        this.id = id;
        this.name = name;
        this.description = description;
        this.ingredients = new Ingredient[MAX_INGREDIENTS];
    }

    /**
     * Método construtor para a criação de uma instância de {@link Pizza pizza}.
     * @param id Código que identifica uma <b>Pizza</b>
     * @param name Nome da <b>Pizza</b>
     */
    public Pizza(int id, String name) {
        this.id = id;
        this.name = name;
        numberOfIngredients = 0;
    }

    /**
     * Método de acesso get (obter)
     * Quer-se obter o id da pizza
     * @return 
     */
    public int getId() {
        return id;
    }

    /**
     * Método de acesso set (atribuir)
     * Quer-se atribuir o id da pizza
     * @param id 
     */
    public void setId(int id) {
        this.id = id;
    }

    /**
     * Método de acesso get (obter)
     * Quer-se obter o nome da pizza
     * @return 
     */
    public String getName() {
        return name;
    }

    /**
     * Método de acesso set (atribuir)
     * Quer-se atribuir o nome da pizza
     * @param name 
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * Método de acesso get (obter)
     * Quer-se obter a descrição da pizza
     * @return 
     */
    public String getDescription() {
        return description;
    }

    /**
     * Método de acesso set (atribuir)
     * Quer-se atribuir a descrição da pizza
     * @param description 
     */
    public void setDescription(String description) {
        this.description = description;
    }

    /**
     * Método de acesso get (obter)
     * Quer-se obter os ingredientes da pizza
     * @return 
     */
    public Ingredient[] getIngredients() {
        return ingredients;
    }

    /**
     * Método de acesso set (atribuir)
     * Quer-se atribuir ingredientes à pizza
     * @param ingredients 
     */
    public void setIngredients(Ingredient[] ingredients) {
        this.ingredients = ingredients;
    }

    /**
     * Método de acesso get (obter)
     * Quer-se obter o número de ingredientes da pizza
     * @return 
     */
    public int getNumberOfIngredients() {
        return numberOfIngredients;
    }

    /**
     * Método de acesso set (atribuir)
     * Quer-se atribuir um número de ingredientes à pizza
     * @param numberOfIngredients 
     */
    public void setNumberOfIngredients(int numberOfIngredients) {
        this.numberOfIngredients = numberOfIngredients;
    }
    
    /**
     * Impressão dos detalhes da pizza
     * @return s - strings com as informações
     */
    @Override
    public String toString(){
        String s = "";
        
        s += "nome: "+this.name+"\n";
        s += "descricao: "+this.description+"\n";
        s += "id: "+this.id+"\n";
        s += "numero de ingredientes: "+numberOfIngredients+"\n";
        
        for(int i = 0; i < numberOfIngredients; i++){
            s += ingredients[i].toString();
        }
        
        return s;
    }
    
    /**
     * Adicionar ingredientes
     * @param i 
     */
    public void addIngredient (Ingredient i){
        if(numberOfIngredients < MAX_INGREDIENTS){
            this.ingredients[numberOfIngredients] = i;
            this.numberOfIngredients++; //numero de ingredientes daquela pizza
        } else{
            System.out.println("Esta cheio, gordo!");
        }
    }
    
    /**
     * Remover ingredientes
     * @param id 
     */
    public void removeIngredient (int id){
       int pos = -1;
       
       for(int i = 0; i < numberOfIngredients; i++){
           if(ingredients[i].getId() == id){
               pos = i;
           }
       }
    }
}

