package ar.com.ada.online.second.Polimorfismo.SubClass;

import ar.com.ada.online.second.Polimorfismo.SuperClass.Vehicle;

public class ElectricalVehicle extends Vehicle {

    private Integer potency;

    public ElectricalVehicle() {
    }

    public ElectricalVehicle(Integer potency) {
        this.potency = potency;
    }

    public ElectricalVehicle(String brand, String model, Integer year, Integer potency) {
        super(brand, model, year);
        this.potency = potency;
    }

    public Integer getPotency() {
        return potency;
    }

    public void setPotency(Integer potency) {
        this.potency = potency;
    }

    @Override
    public String tecnicalSheet() {
        String msj;
        if (getYear() < 2007){
            msj = "Informacion tecnica (Vehículo Electrico): \n\tNo existe modelo para este año";
        }else
            msj = String.format(
                    "Informacion tecnica (Vehículo Electrico):\n\tMarca: %s\n\tModelo: %s\n\tAño: %s\n\tEste es un auto de última tecnología!",
                    brand,
                    model,
                    getYear()
            );

        return msj;
    }
}
