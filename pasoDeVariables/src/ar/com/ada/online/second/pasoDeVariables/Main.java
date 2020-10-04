package ar.com.ada.online.second.pasoDeVariables;

import sun.java2d.loops.ScaledBlit;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Double a;
        Double b;

        Scanner sc = new Scanner(System.in);
        System.out.print("Ingrese el valor para a: ");
        a = sc.nextDouble();

        System.out.print("Ingrese el valor para a: ");
        b = sc.nextDouble();

        Result result = new Result();
        Arimethic calcular = new Arimethic();


        calcular.substraction(a, b , result);
        System.out.println("La resta es: " + result.getResultSubtraction());

        calcular.sum(a, b , result);
        System.out.println("La suma es: " + result.getResultSum());

        calcular.multiplication(a, b , result);
        System.out.println("La multi es: " + result.getResultMultiplication());

        calcular.division(a, b , result);
        System.out.println("La division es: " + result.getResultDivision());



    }
}
