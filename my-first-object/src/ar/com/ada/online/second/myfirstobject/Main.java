package ar.com.ada.online.second.myfirstobject;

public class Main {

    public static void main(String[] args) {
    // // // Clase objeto Person \\ \\ \\

//crea los objetos

        Person alemendra = new Person();
        Person giuliana = new Person();
        Person pau = new Person();
//Set attributes
        alemendra.name = "Almendra";
        alemendra.lastName = "Pollezzi";

        giuliana.name = "Paulina";
        giuliana.lastName = "Fertonani";

        pau.name = "Paulina";
        pau.lastName = "Stanic";

//invoco el metodo
        alemendra.showAttributesValues();
        giuliana.showAttributesValues();
        pau.showAttributesValues();


       // // // EJEMPLO CALCULATOR \\ \\ \\

// Creo objeto Calulator
        Calculator myCalculator = new Calculator();

//set Attributes
        myCalculator.numberA = 10;
        myCalculator.numberB = 2;

//Invoco los metodos
        Integer resultSum = myCalculator.sumAttributes();
        Integer resultMultipy = myCalculator.multiplyAttributes();


//Imprimo resultados

        System.out.println("El resultado de la multiplicación es: "+resultMultipy);
        System.out.println("El resultado de la suma es: "+resultSum);

    }
}
