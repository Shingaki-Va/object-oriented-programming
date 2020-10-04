package ar.com.ada.online.second.Polimorfismo.SubClass;

import ar.com.ada.online.second.Polimorfismo.SuperClass.Vehicle;

public class Truck extends Vehicle {

    private Integer maxLoad;

    public Truck() {
    }

    public Truck(Integer maxLoad) {
        this.maxLoad = maxLoad;
    }

    public Truck(String brand, String model, Integer year, Integer maxLoad) {
        super(brand, model, year);
        this.maxLoad = maxLoad;
    }

    @Override
    public String tecnicalSheet() {
        String msj;
        String att = "Informacion Tecnica(vehiculo Deportivo" +
                "\n\t modelo: " + getModel() + "\n\t Marca: " + getBrand()
                + "\n\t Año: " + getYear();
        if (maxLoad < 100){
            msj = "\n Para iniciar un negocio de flete, está muy bien este auto ";

        }else msj = "\n Tienes que usar este auto en el campo, ¡¡Es  una máquina de trabajo!!";


        return att + msj;
    }

}
