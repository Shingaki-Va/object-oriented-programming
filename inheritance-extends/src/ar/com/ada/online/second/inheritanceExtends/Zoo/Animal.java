package ar.com.ada.online.second.inheritanceExtends.Zoo;

public class Animal {
    private String breed;

    public Animal() {
    }

    public Animal(String breed) {
        this.breed = breed;
    }

    public String getBreed() {
        return breed;
    }

    public void setBreed(String breed) {
        this.breed = breed;
    }

    @Override
    public String toString() {
        return "Animal{" +
                "breed='" + breed + '\'' +
                '}';
    }
}
