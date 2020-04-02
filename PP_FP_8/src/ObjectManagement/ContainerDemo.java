/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ObjectManagement;

import BikeStore.Bicycle;
import ficha7_enums.BrakeType;
import ficha7_enums.Material;

/**
 *
 * @author Jéssica Beatriz
 */
public class ContainerDemo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Bicycle bike1 = new Bicycle(0, 0, "blue", 0, BrakeType.P, Material.ALUMINIO, 0.5f, 2);
        
        //Teste 1 - Container Vazio
        ContainerOfObjects bicicletas = new ContainerOfObjects();
        bicicletas.addObject(bike1);
        
        //condição de sucesso
        if(bicicletas.size() == 1){
            System.out.println("Teste com sucesso");
        }
        else{
            System.err.println("Teste sem sucesso");
        }
    }
    
}
