package ar.com.ada.online.second.Figuras.Sub;

import ar.com.ada.online.second.Figuras.Super.Figure;

public class Circulo extends Figure {

    private Double radio;
    public String name = "Circulo";

    @Override
    public String getName() {
        return this.name;
    }

    public Circulo(Double radio, Double area) {
        super(area);
        this.radio = radio;
    }

    public Double getRadio() {
        return radio;
    }

    public void setRadio(Double radio) {
        this.radio = radio;
    }

    @Override
    public Double calculateArea() {
        this.area = Math.PI * Math.pow(radio, 2);
        return area;
    }
}
