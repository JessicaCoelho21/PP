package pp_fp_07.v2;

import enumerations.Material;
import enumerations.BrakeType;

/**
 * <h3>
 * ESTG - Escola Superior de Tecnologia e Gestão<br>
 * IPP - Instituto Politécnico do Porto <br>
 * LEI - Licenciatura em Engenharia Informática<br>
 * PP - Paradigmas de Programação<br>
 * </h3>
 * <p>
 * <strong>Descrição: </strong><br>
 * Classe que representa a estrutura de uma Bicicleta
 * </p>
 */

public class Bicycle {
    /**
     * Identificador numérico da bicicleta
     */
    private int id;
    /**
     * Número de velocidades
     */
    private int numberOfGears;
    /**
     * Cor da bicicleta
     */
    private String mainColor;
    /**
     * Diâmetro das rodas
     */
    private float weelSize;
   
    /**
     * Tipo de travões
     * TODO: BrakeType
     */
    private BrakeType brakes;
   
    /**
     * Tipo de material
     * TODO: Material
     */
    private Material material;
    
    /**
     * Preço da bicicleta
     */
    private float price;
    
    /**
     * Número de anos de garantia
     */
    private int guaranteeYears;

    /**
     * Método construtor para a criação de uma instância de
     * {@link Biclycle bicicleta}.
     * 
     * @param id Identificador da bicicleta
     * @param numberOfGears Número de velocidades
     * @param mainColor Cor da bicicleta
     * @param weelSize Diâmetro das rodas
     * @param brakes {@link BrakeType tipo de travões} da bicicleta
     * @param material {@link Material tipo de material} da bicicleta
     * @param price Preço da bicicleta
     * @param guaranteeYears Anos de garantia da bicicleta
     */
    public Bicycle(int id, int numberOfGears, String mainColor, float weelSize, 
            BrakeType brakes, Material material, float price, int guaranteeYears) {
        this.setId(id);
        this.numberOfGears = numberOfGears;
        this.mainColor = mainColor;
        this.weelSize = weelSize;
        this.brakes = brakes;
        this.material = material;
        this.price = price;
        this.guaranteeYears=guaranteeYears;
    }

    /**
     *  
     * @return o {@link Bicycle#id id} de uma bicicleta 
     */
    public int getId() {
        return id;
    }
    
    /**
     * 
     * @param id {@link Bicycle#id id} de uma bicicleta 
     */
    public final void setId(int id) {
        this.id = id;
    }
    
}
