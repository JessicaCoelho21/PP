/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pp_fp_9;

/**
 *
 * @author Jéssica Beatriz
 */
public class GestorReserva extends ContainerOfObjects{
    private History historico;

    public GestorReserva(Object[] objects) {
        super(objects);
        this.historico = new History();
    }
    
    public GestorReserva(int maxSize){
        super(maxSize);
    }
    
}
