package pp_fp_9;

public class GestorReserva extends ContainerOfObjects{
    private History historico;

    /**
     * Método construtor
     * @param objects 
     */
    public GestorReserva(Object[] objects) {
        super(objects);
        this.historico = new History();
    }
    
    /**
     * Método construtor
     * @param maxSize 
     */
    public GestorReserva(int maxSize){
        super(maxSize);
    }
}
