package ar.com.ada.online.second.myfirstobject;
//Plantilla de la clase

public class Person {
//atributos
    String name;
    String lastName;
//Métodos
    void showAttributesValues() {

        System.out.println("Name: " + name);
        System.out.println("Last Name: " + this.lastName);
        System.out.println("");
    }

}
