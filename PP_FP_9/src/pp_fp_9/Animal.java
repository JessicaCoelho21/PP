/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pp_fp_9;

import enums.Genero;


/**
 *
 * @author Jéssica Beatriz
 */
public abstract class Animal {
    private int id;
    private String nome;
    private Genero genero;
    private int idade;

    /**
     * Método construtor
     * 
     * @param id
     * @param nome
     * @param genero
     * @param idade 
     */
    public Animal(int id, String nome, Genero genero, int idade) {
        this.id = id;
        this.nome = nome;
        this.genero = genero;
        this.idade = idade;
    }

    /**
     * Método de acesso getter
     * 
     * @return 
     */
    public int getId() {
        return id;
    }

    /**
     * Método de acesso setter
     * 
     * @param id 
     */
    public void setId(int id) {
        this.id = id;
    }

    /**
     * Método de acesso getter
     * 
     * @return 
     */
    public String getNome() {
        return nome;
    }

    /**
     * Método de acesso setter
     * 
     * @param nome 
     */
    public void setNome(String nome) {
        this.nome = nome;
    }

    /**
     * Método de acesso getter
     * 
     * @return 
     */
    public Genero getGenero() {
        return genero;
    }

    /**
     * 
     * @param genero 
     */
    public void setGenero(Genero genero) {
        this.genero = genero;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }
}
