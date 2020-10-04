package ar.com.ada.online.second.Figuras.Super;

public abstract class  Figure {

    protected Double area;
    public String name;

    public String getName() {
        return this.name;
    }

    public Figure(Double area) {
        this.area = area;
    }

    public Double getArea() {
        return area;
    }

    public void setArea(Double area) {
        this.area = area;
    }

    public abstract Double calculateArea();



}
