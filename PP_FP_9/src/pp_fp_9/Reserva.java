package pp_fp_9;

import java.util.Date;

public class Reserva {
    private Date data;
    private Animal animal;
    private ContainerOfObjects services;

    /**
     * Método construtor para as reservas
     * @param data
     * @param animal
     * @param services 
     */
    public Reserva(Date data, Animal animal) {
        this.data = data;
        this.animal = animal;
    }

    /**
     * Método de acesso getter para obter a data
     * @return data
     */
    public Date getData() {
        return data;
    }
    
    /**
     * Método de acesso getter para obter o animal
     * @return animal
     */
    public Animal getAnimal() {
        return animal;
    }

    /**
     * Método de acesso getter para obter os serviços
     * @return 
     */
    public ContainerOfObjects getServices() {
        return services;
    }

    /**
     * Método de acesso setter para atribuir dados aos serviços
     * @param services 
     */
    public void setServices(ContainerOfObjects services) {
        this.services = services;
    }

    /**
     * Método toString
     * @return 
     */
    @Override
    public String toString() {
        return "Reserva{" + "data=" + data + ", animal=" + animal + ", services=" + services + '}';
    }
}
