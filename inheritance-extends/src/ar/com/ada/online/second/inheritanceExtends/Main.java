package ar.com.ada.online.second.inheritanceExtends;

import ar.com.ada.online.second.inheritanceExtends.Zoo.Dog;
import ar.com.ada.online.second.inheritanceExtends.Zoo.Horse;

public class Main {

    public static void main(String[] args) {

        Dog perro = new Dog("Pastor aleman", 4,4);
        Dog perro2 = new Dog("caniche", 4 , 6);
        Horse caballo = new Horse("Meztizo","Mariop",20);
        Horse caballo2 = new Horse("Pura Sangre", "Pepa", 25);

        System.out.println(perro.toString());

        System.out.println(perro2.toString());

        System.out.println(caballo.toString());

        System.out.println(caballo2.toString());


    }
}
