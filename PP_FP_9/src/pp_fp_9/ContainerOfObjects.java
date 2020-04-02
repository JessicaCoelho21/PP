package pp_fp_9;

public class ContainerOfObjects {
    private final int DEFAULT_SIZE = 100;
    private Object objects[];
    
    /**
     * Construtor que permite a instanciação da classe tendo por base um vetor de elementos recebido
     * @param objects Lista de objetos sem tamanho fixo
     */
    public ContainerOfObjects(Object[] objects){
        this.objects = objects;
    }

    /**
     * Construtor que perminte a instanciação da classe tendo por base um valor por defeito (100)
     */
    public ContainerOfObjects(){
        this.objects = new Object[DEFAULT_SIZE];
    }
    
    /**
     * Cosntrutor que permite a instanciação da classe definindo um valo máximo de elementos
     * @param maxSize número máximo de elementos permitidos no vetor
     */
    public ContainerOfObjects(int maxSize){
        this.objects = new Object[maxSize];
    }
    
    /**
     * Método que procura a primeira posição livre do vetor de objetos
     * @return a primeira posição livre do vetor
     */
    protected int procuraPosicaoLivre(){
        int pos = -1;
        boolean sair = false;
        
        for (int i = 0; i < this.objects.length && sair == false; i++) {
            if (this.objects[i] == null) {
                pos = i;
                sair = true;
            }
        }
        return pos;
    }
    
    /**
     * Método que verifica se uma certa posição está ou não nula
     * @param position para a posição que se pretende verificar
     * @return se a pusição está o não vazia
     */
    protected boolean isNull(int position){
        if(this.objects[position] == null) {
            return true;
        } else{
            return false;
        }
    }
    
    /**
     * Método responsável por inserir um {@link Object objeto} na coleção de
     * {@link ContainerOfObjects#objects objetos}
     * @param newObject {@link Object objeto} a inserir no vetor
     * @return valor booleano que sinaliza o sucesso/insucesso da operação
     */
    protected boolean addObject(Object newObject){
        int pos = procuraPosicaoLivre();
        
        if(pos == -1){
            return false;
        } else{
            this.objects[pos] = newObject;
            return true;
        }
    }
    
    /**
     * Método responsável por remover um {@link Object objeto} do vetor de
     * {@link  ContainerOfObjects#objects objetos}
     * @param position indice correspondente ao elemento a eliminar
     * @return  o {@link Object objeto} eliminado
     */
    protected Object removeObject (int position){
        //int pos = procuraPosicaoLivre();
        Object obj = objects[position];
        boolean isNull = isNull(position);
        int i;
        
        if(isNull){
            return null;
        } else{
            for (i = position; i < this.objects.length - 1 && objects[i] != null; i++) {
                this.objects[i] = this.objects[i + 1];
            }
            
            this.objects[i] = null;
            return obj;
        }
    }
    
    /**
     * Método responsável por substituir um {@link Object objeto} no vetor de
     * {@link ContainerOfObjects#objects objetos}
     * @param position índice correspondente ao elemento a modificar
     * @param newObject novo objeto a colocar no vetor
     * @return valor booleano que sinaliza o sucesso/insucesso da operação
     */
    protected boolean setObject(int position, Object newObject){
        boolean isNull = isNull(position);
        
        if (isNull) {
            return false;
        } else{
            this.objects[position] = newObject;
            return true;
        }
    }
    
    /**
     * Método responsável por encontrar um {@link Object objeto} no vetor de
     * {@link ContainerOfObjects#objects objetos}
     * @param obj
     * @return 
     */
    protected int findObject(Object obj){
        for (int i = 0; i < this.objects.length; i++) {
            if(this.objects[i].equals(obj)){
             return i;   
            }
        }
        
        return -1;
    }

    /**
     * Define o tamanho do array de bicicletas
     * @return a última posição livre do array de bicicletas
     */
    int size() {
        return this.procuraPosicaoLivre();
    }
    
    /**
     * Obter todos os objetos do array
     * @return 
     */
    protected Object[] getAllObj(){
        Object[] temp = new Object[this.size()];
        
        for (int i = 0; i < this.size(); i++) {
            temp[i] = this.objects[i]; 
        }
        
        return temp;
    }
}
