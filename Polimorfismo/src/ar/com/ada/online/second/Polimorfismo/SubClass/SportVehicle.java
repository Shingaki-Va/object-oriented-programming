package ar.com.ada.online.second.Polimorfismo.SubClass;

import ar.com.ada.online.second.Polimorfismo.SuperClass.Vehicle;

public class SportVehicle extends Vehicle {

    private Integer rpm;

    public SportVehicle() {
    }

    public SportVehicle(Integer rpm) {
        this.rpm = rpm;
    }

    public SportVehicle(String brand, String model, Integer year, Integer rpm) {
        super(brand, model, year);
        this.rpm = rpm;
    }

    public Integer getRpm() {
        return rpm;
    }

    public void setRpm(Integer rpm) {
        this.rpm = rpm;
    }

    @Override
    public String tecnicalSheet() {

        String att = "Informacion Tecnica(vehiculo Deportivo" +
                "\n\t modelo: " + getModel() + "\n\t Marca: " + getBrand()
                + "\n\t Año: " + getYear();
        String msj;
        if (rpm > 0 && rpm < 51) {
            msj = "\nel auto es muy bonito pero solo sirve para ir a pasear";
        } else if (rpm > 50 && rpm < 301) {
            msj = "\ncon este auto podes deasfiar a cualquiera en la pista";
        } else if (rpm>300&&rpm>601) {
            msj = "\n¡¡¡Debes participar en el Nascar!!";


        }msj = "\n¿eres de rap y furiosos?";

        return att + msj;
    }

}

