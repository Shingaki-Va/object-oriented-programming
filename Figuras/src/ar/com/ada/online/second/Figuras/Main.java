package ar.com.ada.online.second.Figuras;

import ar.com.ada.online.second.Figuras.Sub.Circulo;
import ar.com.ada.online.second.Figuras.Sub.Rectangulo;
import ar.com.ada.online.second.Figuras.Sub.Triangulo;
import ar.com.ada.online.second.Figuras.Super.Figure;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        ArrayList<Figure> arrayList = new ArrayList<Figure>();

        Scanner sc = new Scanner(System.in);
        menu(arrayList, sc);


        for (Figure figure:arrayList) {
            System.out.println("");
            System.out.println("el área del " + figure.getName() + " es: " + figure.calculateArea());

        }

    }

    public static void menu(ArrayList<Figure> arrayList, Scanner sc) {

        for (int i = 0; i < 3; i++) {
            System.out.print("Ingrese la figura que desea calcular el Area: \n\t1) Cuadrado" +
                    "\n\t2) Triangulo" +
                    "\n\t3) Círuclo\n");
            int opcion = sc.nextInt();

            switch (opcion) {
                case 1:
                    Rectangulo rectangulo = crearRectangulo(sc);
                    arrayList.add(rectangulo);
                    break;

                case 2:
                    Triangulo triangulo = crearTriangulo(sc);
                    arrayList.add(triangulo);
                    break;

                case 3:

                    Circulo circulo = crearCirculo(sc);
                    arrayList.add(circulo);
                    break;
            }
        }


    }


    //creo métodos para ingreso de datos por teclado
    public static Rectangulo crearRectangulo(Scanner sc) {

        System.out.println("ingrese la base");
        Double base = sc.nextDouble();
        System.out.println("ingrese la altura");
        Double altura = sc.nextDouble();

        Rectangulo rectangulo = new Rectangulo(null, base, altura);
        rectangulo.setAltura(altura);
        rectangulo.setBase(base);

        return rectangulo;

    }

    public static Triangulo crearTriangulo(Scanner sc) {

        System.out.println("ingrese la base");
        Double base = sc.nextDouble();
        System.out.println("ingrese la altura");
        Double altura = sc.nextDouble();

        Triangulo triangulo = new Triangulo(null, base, altura);
        triangulo.setAltura(altura);
        triangulo.setBase(base);

        return triangulo;

    }

    public static Circulo crearCirculo(Scanner sc) {

        System.out.println("ingrese el radio");
        Double radio = sc.nextDouble();

        Circulo circulo = new Circulo(null, radio);
        circulo.setRadio(radio);

        return circulo;

    }

    
    

}
