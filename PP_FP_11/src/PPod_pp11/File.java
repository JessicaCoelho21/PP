/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package PPod_pp11;

/**
 *
 * @author Jéssica Beatriz
 */
public class File {
    private String nome, extensao;
    private int tamanho, duracao;

    /**
     * Método construtor para intanciar File
     * @param nome nome da faixa
     * @param extensao tipo de ficheiro da faixa
     * @param tamanho tamanho da faixa em KB
     * @param duracao duração da faixa em segundos
     */
    public File(String nome, String extensao, int tamanho, int duracao) {
        this.nome = nome;
        this.extensao = extensao;
        this.tamanho = tamanho;
        this.duracao = duracao;
    }

    /**
     * Método getter para obter o nome da faixa
     * @return nome da faixa
     */
    public String getNome() {
        return nome;
    }

    /**
     * Método setter para aribuir um nome à faixa
     * @param nome nome atribuído à faixa
     */
    public void setNome(String nome) {
        this.nome = nome;
    }

    /**
     * Método getter para obter uma extensão à faixa
     * @return extensão da faixa
     */
    public String getExtensao() {
        return extensao;
    }

    /**
     * Método setter para atribuir uma extensão à faixa
     * @param extensao extensão atribuída à faixa
     */
    public void setExtensao(String extensao) {
        this.extensao = extensao;
    }

    /**
     * Método getter para obter um tamanho à faixa
     * @return tamanho da faixa
     */
    public int getTamanho() {
        return tamanho;
    }

    /**
     * Método setter para abribuir um tamanho à faixa
     * @param tamanho tamanho atribuído à faixa
     */
    public void setTamanho(int tamanho) {
        this.tamanho = tamanho;
    }

    /**
     * Método getter para obter a duração da faixa
     * @return duração da faixa
     */
    public int getDuracao() {
        return duracao;
    }

    /**
     * Método setter para atribuir uma duração à faixa
     * @param duracao duração atribuída à faixa
     */
    public void setDuracao(int duracao) {
        this.duracao = duracao;
    }

    /**
     * Método toString para imprimir todos os dados
     * @return todos os dados existentes
     */
    @Override
    public String toString() {
        return "File{" + "nome=" + nome + ", extensao=" + extensao + ", tamanho=" + tamanho + ", duracao=" + duracao + '}';
    }
}
