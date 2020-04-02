/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package PPod_pp11;

import static PPod_pp11.Shuffle.orderDurationAsc;
import static PPod_pp11.Shuffle.orderDurationDesc;
import static PPod_pp11.Shuffle.orderNameAsc;
import static PPod_pp11.Shuffle.orderNameDesc;

/**
 *
 * @author Jéssica Beatriz
 */
public class GestorPPod implements PPod{
    private File[] file;
    private static int DEFAULT = 20;
    private File actualfile;
    private int num_files;

    /**
     * Método construtor para criar um array com o tamanho por defeito
     */
    public GestorPPod() {
        this.file = new File[DEFAULT];
    }
    
    /**
     * Método que encontra a primeira posição livre do array
     * @return primeira posição livre
     */
    public int primeiroLivre(){
        for (int i = 0; i < this.file.length; i++) {
            if (this.file[i] == null) {
                return i;
            }
        }
        
        return -1;
    }
    
    /**
     * Método que calcula a memória total da lista de faixas
     * @return memória total
     */
    public int memoriaTotal(){
        int memoria = 0;
        
        for(int i = 0; i < this.file.length; i++) {
            if(this.file[i] != null){
               memoria = memoria + this.file[i].getTamanho();
            }
        }
        
        return memoria;
    }
    
    /**
     * Método que adiciona uma faixa ao array
     * @param file faixa a adicionar
     */
    @Override
    public void addFile(File file) throws MemoriaMaxima{
        //Se a faixa não existir
        if(file == null){
            throw new NullPointerException("Faixa inválida.");
        }
        
        //Se não houver posições livres
        if (primeiroLivre() == -1) {
            throw new ArrayIndexOutOfBoundsException("Impossível adicionar música.");
        }
        
        //Se a  memória estiver cheia
        if (file.getTamanho() + memoriaTotal() > 100000) {
            throw new MemoriaMaxima ("Memória maior que 100 MB");
        }
        
        //Atribui o ficheiro recebido como parâmetro à primeira posição livre do array
        this.file[primeiroLivre()] = file;
    }
    
    /**
     * Método que apaga uma faixa numa certa posição do array
     * @param index posição do array a apagar
     */
    @Override
    public void deleteFile(int index){
        //se o índice não pertencer ao limite
        if (index < -1 || index >= 20) {
            throw new ArrayIndexOutOfBoundsException("Posição inválida.");
        }
        
        //se não existir uma faixa na posição recebida
        if (this.file[index] == null) {
            throw new NullPointerException("A faixa não existe.");
        }
        
        //Caso a faixa exista, apaga a faixa naquela posição
        this.file[index] = null;
        
        /*try{
            //se não existir uma faixa na posição recebida
            if(this.file[index] == null){
                throw new NullPointerException("Não existe uma faixa nessa posição");
            }
            
            //se o índice não pertencer ao limite
            else if (index <= -1 || index > 20) {
                throw new ArrayIndexOutOfBoundsException("Posição inválida.");
            }
            
            //Caso a faixa exista, apaga a faixa naquela posição e decrementa o número total de faixas
            else{
                this.file[index] = null;
                this.num_files--;
            }
        }
        */
    }
    
    /**
     * Método para reproduzir a faixa num certo índice 
     * @param index posição da faixa a reproduzir
     */
    @Override
    public void playTrack(int index) /*throws Extensao*/{
        /*
        //se o índice não pertencer ao limite
        if (index < -1 || index > 20) {
            throw new ArrayIndexOutOfBoundsException("Posição inválida.");
        }
        
        //Se a extensão não for mp3
        if (!".mp3".equals(this.file[index].getExtensao())){
            throw new Extensao("Ficheiro não suportado");
        }
        
        //se não existir uma faixa na posição recebida
        if (this.file[index] == null) {
            throw new NullPointerException("A faixa não existe.");
        }
        
        //Imprime nome e duração da faixa
        System.out.println("Nome da faixa: " + this.file[index].getNome());
        System.out.println("Duração: " + this.file[index].getDuracao());
        */
        
        this.actualfile = null;
        
        try{
            //Se a faixa na posição não for nula
            if(this.file[index] != null){
                //Imprime nome e duração, e atribui à faixa atual a faixa presente nessa posição
                System.out.println("Nome: " + this.file[index].getNome());
                System.out.println("Duração: " + this.file[index].getDuracao());
                this.actualfile = this.file[index];
            }
            
            else{
                //lança exceção
                throw new NullPointerException("Não existe uma faixa da posição introduzida!");
            }
        }
        
        //Caso o que se encontra no try não se verifique, lança uma exceção
        catch(NullPointerException e){
            System.out.println(e);
        }
    }
    
    /**
     * Método para avançar para a faixa seguinte daquela que está a ser reproduzida no momento
     */
    @Override
    public void nextTrack(){
        File file = this.actualfile;
        
        try{
            //Para i = 0; i menor que o número de faixas; i++
            for (int i = 0; i < this.num_files; i++) {
                //Se a faixa na posição i for igual à faixa atual
                if (this.file[i].equals(file)) {
                    //Se a faixa seguinte for nula
                    if (this.file[i + 1] == null) {
                        //A lista de reprodução volta ao início
                        this.actualfile = this.file[0];
                        
                        //Imprime nome e duração da faixa
                        System.out.println("Playlist acabou.......");
                        System.out.println("......Iniciando a playlist");
                        System.out.println("Nome: " + this.file[0].getNome());
                        System.out.println("Duração: " + this.file[0].getDuracao());
                    } 
                    
                    //Caso exista uma faixa seguinte
                    else {
                        //Imprime nome e duração
                        System.out.println("Nome: " + this.file[i + 1].getNome());
                        System.out.println("Duração: " + this.file[i + 1].getDuracao());
                        
                        //Atribui a faixa na posição i+1 à faixa na posição atual
                        this.actualfile = this.file[i + 1];
                    }
                }
            }
        } 
        
        //Caso o que se encontra no try não se verifique, lança uma exceção
        catch (NullPointerException e) {
            this.actualfile = this.file[0];
        }
    }

     /**
     * Método para recuar para a faixa anterior daquela que está a ser reproduzida no momento
     */
    @Override
    public void previousTrack() {
        File file = this.actualfile;
        
        try{
            //Para i = 0; i menor que o número de faixas; i++
            for (int i = 0; i < this.num_files; i++) {
                //Se a faixa na posição i for igual à faixa atual
                if (this.file[i].equals(file)) {
                    //Se a faixa anterior for nula
                    if (this.file[i - 1] == null) {
                        //A lista de reprodução volta ao início
                        this.actualfile = this.file[0];
                        
                        //Imprime nome e duração da faixa
                        System.out.println("Playlist acabou.......");
                        System.out.println("......Iniciando a playlist");
                        System.out.println("Nome: " + this.file[0].getNome());
                        System.out.println("Duração: " + this.file[0].getDuracao());
                    } 
                    
                    //Caso exista uma faixa seguinte
                    else {
                        //Imprime nome e duração
                        System.out.println("Nome: " + this.file[i - 1].getNome());
                        System.out.println("Duração: " + this.file[i - 1].getDuracao());
                        
                        //Atribui a faixa na posição i-1 à faixa na posição atual
                        this.actualfile = this.file[i - 1];
                    }
                }
            }
        } 
        
        //Caso o que se encontra no try não se verifique, lança uma exceção
        catch (NullPointerException e) {
            this.actualfile = this.file[0];
        }
    }
    
    public static void takeOrder(File [] files,TypeShufflePlay type){
        switch(type){
            case NameAsc:
                orderNameAsc(files);
                break;
            case NameDesc:
                orderNameDesc(files);
                break;
            case DurationDesc:
                orderDurationDesc(files);
                break;
            case DurationAsc:
                orderDurationAsc(files);
                break;
        }
    }
}
