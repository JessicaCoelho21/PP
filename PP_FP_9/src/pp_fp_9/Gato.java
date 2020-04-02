package pp_fp_9;

import enums.Genero;
import enums.TipoGato;

public class Gato extends Animal{
    private Gato TipoGato;

    /**
     * Método construtor
     * @param id
     * @param nome
     * @param genero
     * @param idade 
     */
    public Gato(int id, String nome, Genero genero, int idade) {
        super(id, nome, genero, idade);
        this.TipoGato = TipoGato;
    }

    /**
     * Método de acesso getter
     * @return 
     */
    public Gato getTipoGato() {
        return TipoGato;
    }

    /**
     * Método de acesso setter
     * @param TipoGato 
     */
    public void setTipoGato(Gato TipoGato) {
        this.TipoGato = TipoGato;
    }
}
