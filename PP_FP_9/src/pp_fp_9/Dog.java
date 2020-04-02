/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pp_fp_9;

import enums.Genero;
import enums.TamanhoDog;

/**
 *
 * @author Jéssica Beatriz
 */
public class Dog extends Animal{
    private Dog TamanhoDog;

    public Dog(int id, String nome, Genero genero, int idade) {
        super(id, nome, genero, idade);
        this.TamanhoDog = TamanhoDog;
    }
    
}
