package ar.com.ada.online.second.inheritanceExtends.Zoo;

public class Horse extends Animal {

    private String name;
    private Integer power;

    public Horse() {
    }

    public Horse(String breed, String name, Integer power) {
        super(breed);
        this.name = name;
        this.power = power;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getPower() {
        return power;
    }

    public void setPower(Integer power) {
        this.power = power;
    }

    @Override
    public String toString() {
        return "Horse{" +
                "name='" + name + '\'' +
                ", power=" + power +
                '}';
    }
}
