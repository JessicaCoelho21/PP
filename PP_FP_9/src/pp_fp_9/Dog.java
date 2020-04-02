package pp_fp_9;

import enums.Genero;
import enums.TamanhoDog;

public class Dog extends Animal{
    private Dog TamanhoDog;

    /**
     * Método construtor
     * @param id
     * @param nome
     * @param genero
     * @param idade 
     */
    public Dog(int id, String nome, Genero genero, int idade) {
        super(id, nome, genero, idade);
        this.TamanhoDog = TamanhoDog;
    }
}
