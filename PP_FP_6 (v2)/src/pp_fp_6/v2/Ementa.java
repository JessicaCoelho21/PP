package pp_fp_6.v2;

import java.util.Date;

public class Ementa {
    private final int MAX_PIZZA = 10;
    private Pizza[] pizzas;
    private String designacao;
    private int numberOfPizzas;
    Date inicio;
    Date fim;

    /**
     * Método construtor para a criação de uma instância
     * @param pizzas
     * @param designacao
     * @param inicio
     * @param fim 
     */
    public Ementa(Pizza[] pizzas, String designacao, Date inicio, Date fim) {
        this.pizzas = pizzas;
        this.designacao = designacao;
        this.inicio = inicio;
        this.fim = fim;
    }
    
    /**
     * Adicionar Pizzas
     * @param i 
     */
    public void addPizza (Pizza i){
        if(numberOfPizzas < MAX_PIZZA){
            this.pizzas[numberOfPizzas] = i;
            this.numberOfPizzas++; //numero de ingredientes daquela pizza
        } else{
            System.out.println("Esta cheio, gordo!");
        }
    }
    
    /**
     * Remover Pizzas
     * @param id 
     */
    public void removePizza (int id){
       int pos = -1;
       
       for(int i = 0; i < numberOfPizzas; i++){
           if(pizzas[i].getId() == id){
               pos = i;
           }
       }
    }
}
