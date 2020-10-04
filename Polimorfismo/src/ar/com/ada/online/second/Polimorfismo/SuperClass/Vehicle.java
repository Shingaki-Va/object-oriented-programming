package ar.com.ada.online.second.Polimorfismo.SuperClass;

public class Vehicle {

    protected String brand;
    protected String model;
    protected Integer year;

    public Vehicle() {
    }

    public Vehicle(String brand, String model, Integer year) {
        this.brand = brand;
        this.model = model;
        this.year = year;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public Integer getYear() {
        return year;
    }

    public void setYear(Integer year) {
        this.year = year;
    }

    public String tecnicalSheet() {
        String msj = "Este vehiculo no tiene categoria asignada\n\t"
                + "Marca: " + getBrand() + " \n\tModelo: " + getModel()
                + "\n\tAño: " + getYear();


        return msj;
    }


}
