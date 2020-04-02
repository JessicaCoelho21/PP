package BikeStore;

import ficha7_enums.BikeTools;
import ficha7_enums.Material;
import ficha7_enums.MountainBikeSuspension;
import ficha7_enums.BrakeType;

/**
 * <h3>
 * ESTG - Escola Superior de Tecnologia e Gestão<br>
 * IPP - Instituto Politécnico do Porto <br>
 * LEI - Licenciatura em Engenharia Informática<br>
 * PP - Paradigmas de Programação<br>
 * </h3>
 * <p>
 * <strong>Descrição: </strong><br>
 * Classe que representa a estrutura de uma Bicicleta de montanha
 * </p>
 */

public class MountainBike extends Bicycle{
    /**
     * Número de luzes
     */
    private int numberOfLights;
     /**
     * Tipo de suspensão
     */
    private MountainBikeSuspension suspension;
     /**
     * Utensílios existentes neste tipo de bicicleta
     */
    private BikeTools[] bikeTools;

    /**
     * Método construtor para a criação de uma instância de
     * {@link MountainBike bicicleta de montanha} sem utensílios.
     * 
     * @param numberOfLights Número de luzes
     * @param suspension Tipo de suspensão
     * @param id Identificador da bicicleta
     * @param numberOfGears Número de velocidades
     * @param mainColor Cor da bicicleta
     * @param weelSize Diâmetro das rodas
     * @param brakes {@link BrakeType tipo de travões} da bicicleta
     * @param material {@link Material tipo de material} da bicicleta
     * @param price Preço da bicicleta
     * @param guarantee Anos de garantia
     */
    public MountainBike(int numberOfLights, MountainBikeSuspension suspension, 
            int id, int numberOfGears, String mainColor, float weelSize, 
            BrakeType brakes, Material material, float price, int guarantee) {
        super(id, numberOfGears, mainColor, weelSize, brakes, material, 
                price, guarantee);
        this.numberOfLights = numberOfLights;
        this.suspension = suspension;
    }
    
    @Override
    public String toString(){
        return super.toString() + "MountainBike(" + "numberOfLights=" + numberOfLights + ", suspension=" + suspension + "')";
    }
}
