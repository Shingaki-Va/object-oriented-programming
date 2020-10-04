package ar.com.ada.online.second.objectexerciseone;

public class Main {

    public static void main(String[] args) {
        System.out.println("Clase Animal: ");

        Animal perro = new Animal();
        perro.bread = "Caniche";
        perro.color = "Blanco";
        perro.name = "Mr Momo";

        perro.showEat();
        perro.showMove();
        perro.showSleep();

        System.out.println("mi raza es: " + perro.bread);
        System.out.println("mi color es: " + perro.color);
        System.out.println("mi nombre es: " + perro.name);
///////////////////////////////////////////////////////////

        System.out.println("Clase Persona");
        Vehicle auto = new Vehicle();
        auto.brand = "audi";
        auto.color = "Blanco";
        auto.maxSpeed = "200km/h";

        auto.showBreak();
        auto.showMoveOn();


        System.out.println("mi marca es: " + auto.brand);
        System.out.println("mi color es: " + auto.color);
        System.out.println("mi vel max es: " + auto.maxSpeed);
        //////////////////////////////////////////////////

        System.out.println("Clase Perro");

        Person persona = new Person();
        persona.age = 20;
        persona.lastName = "Martinez";
        persona.name = "Josefina";

        persona.ShowPlay();
        persona.ShowSing();
        persona.ShowTalk();

        System.out.println("mi edad es: " + persona.age);
        System.out.println("mi apellido es: " + persona.lastName);
        System.out.println("mi nombre es: " + persona.name);


    }
}
