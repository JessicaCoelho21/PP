package pp_fp_9;

import enums.Genero;

public abstract class Animal {
    private int id;
    private String nome;
    private Genero genero;
    private int idade;

    /**
     * Método construtor
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
     * @return 
     */
    public int getId() {
        return id;
    }

    /**
     * Método de acesso setter
     * @param id 
     */
    public void setId(int id) {
        this.id = id;
    }

    /**
     * Método de acesso getter
     * @return 
     */
    public String getNome() {
        return nome;
    }

    /**
     * Método de acesso setter
     * @param nome 
     */
    public void setNome(String nome) {
        this.nome = nome;
    }

    /**
     * Método de acesso getter
     * @return 
     */
    public Genero getGenero() {
        return genero;
    }

    /**
     * Método de acesso setter
     * @param genero 
     */
    public void setGenero(Genero genero) {
        this.genero = genero;
    }

    /**
     * Método de acesso getter
     * @return 
     */
    public int getIdade() {
        return idade;
    }

    /**
     * Método de acesso setter
     * @param idade 
     */
    public void setIdade(int idade) {
        this.idade = idade;
    }
}
