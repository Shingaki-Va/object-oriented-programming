package ar.com.ada.online.second.Figuras.Sub;

import ar.com.ada.online.second.Figuras.Super.Figure;

public class Triangulo extends Figure {

    private Double base, altura;
    private String name = "Triangulo";

    @Override
    public String getName() {
        return name;
    }

    public Triangulo(Double area, Double base, Double altura) {
        super(area);
        this.base = base;
        this.altura = altura;
    }

    public Double getBase() {
        return base;
    }

    public void setBase(Double base) {
        this.base = base;
    }

    public Double getAltura() {
        return altura;
    }

    public void setAltura(Double altura) {
        this.altura = altura;
    }

    @Override
    public Double calculateArea() {
        this.area = (base*altura)/2;

        return this.area;
    }
}
