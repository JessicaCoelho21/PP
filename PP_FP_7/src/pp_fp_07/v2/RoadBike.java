package pp_fp_07.v2;

import enumerations.Material;
import enumerations.BrakeType;

public class RoadBike extends Bicycle{
    private String handlebelt;
    private int frameSize;
    private String observations;

    /**
     * Método construtou para alterar o tipo de material e de travões
     * @param handlebelt
     * @param frameSize
     * @param observations
     * @param id
     * @param numberOfGears
     * @param mainColor
     * @param weelSize
     * @param brakes
     * @param material
     * @param price
     * @param guaranteeYears 
     */
    public RoadBike(String handlebelt, int frameSize, String observations, int id, int numberOfGears, String mainColor, float weelSize, BrakeType brakes, Material material, float price, int guaranteeYears) {
        super(id, numberOfGears, mainColor, weelSize, brakes, material, price, guaranteeYears);
        this.handlebelt = handlebelt;
        this.frameSize = frameSize;
        this.observations = observations;
    }
    
    /**
     * Método construtor para alterar o tipo de travões
     * @param handlebelt
     * @param frameSize
     * @param observations
     * @param id
     * @param numberOfGears
     * @param mainColor
     * @param weelSize
     * @param brakes
     * @param price
     * @param guaranteeYears 
     */
    public RoadBike(String handlebelt, int frameSize, String observations, int id, int numberOfGears, String mainColor, float weelSize, BrakeType brakes, float price, int guaranteeYears) {
        super(id, numberOfGears, mainColor, weelSize, brakes, Material.CARBONO, price, guaranteeYears);
        this.handlebelt = handlebelt;
        this.frameSize = frameSize;
        this.observations = observations;
    }
    
    /**
     * Método construtot para alterar o tipo de material
     * @param handlebelt
     * @param frameSize
     * @param observations
     * @param id
     * @param numberOfGears
     * @param mainColor
     * @param weelSize
     * @param material
     * @param price
     * @param guaranteeYears 
     */
    public RoadBike(String handlebelt, int frameSize, String observations, int id, int numberOfGears, String mainColor, float weelSize, Material material, float price, int guaranteeYears) {
        super(id, numberOfGears, mainColor, weelSize, BrakeType.H, material, price, guaranteeYears);
        this.handlebelt = handlebelt;
        this.frameSize = frameSize;
        this.observations = observations;
    }
    
    /**
     * Método construtor para manter o tipo de material e de travões por defeito
     * @param handlebelt
     * @param frameSize
     * @param observations
     * @param id
     * @param numberOfGears
     * @param mainColor
     * @param weelSize
     * @param price
     * @param guaranteeYears 
     */
    public RoadBike(String handlebelt, int frameSize, String observations, int id, int numberOfGears, String mainColor, float weelSize, float price, int guaranteeYears) {
        super(id, numberOfGears, mainColor, weelSize, BrakeType.H, Material.CARBONO, price, guaranteeYears);
        this.handlebelt = handlebelt;
        this.frameSize = frameSize;
        this.observations = observations;
    }
}
