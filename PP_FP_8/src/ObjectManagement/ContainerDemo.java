package ObjectManagement;

import BikeStore.Bicycle;
import ficha7_enums.BrakeType;
import ficha7_enums.Material;

public class ContainerDemo {

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
