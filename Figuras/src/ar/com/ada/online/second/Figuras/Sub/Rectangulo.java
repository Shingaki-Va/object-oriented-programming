package ar.com.ada.online.second.Figuras.Sub;

import ar.com.ada.online.second.Figuras.Super.Figure;

public class Rectangulo extends Figure {

    private Double base, altura;
    private String name = "Rectangulo";

    @Override
    public String getName() {
        return name;
    }

    public Rectangulo(Double area, Double base, Double altura) {
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

    public Double calculateArea(){
        this.area = base*altura;

        return this.area;

    }


}
