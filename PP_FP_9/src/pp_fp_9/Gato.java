/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pp_fp_9;

import enums.Genero;
import enums.TipoGato;

/**
 *
 * @author Jéssica Beatriz
 */
public class Gato extends Animal{
    private Gato TipoGato;

    public Gato(int id, String nome, Genero genero, int idade) {
        super(id, nome, genero, idade);
        this.TipoGato = TipoGato;
    }

    public Gato getTipoGato() {
        return TipoGato;
    }

    public void setTipoGato(Gato TipoGato) {
        this.TipoGato = TipoGato;
    }
}
