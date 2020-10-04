package ar.com.ada.online.second.pasoDeVariables;

public class Arimethic {

    public static void sum(Double a, Double b, Result finalSum){
        Double result = a+b;
        finalSum.setResultSum(result);

    }

    public static void substraction(Double a, Double b, Result finalSum){
        Double result = a-b;
        finalSum.setResultSubtraction(result);

    }

    public static void multiplication(Double a, Double b, Result finalSum){
        Double result = a*b;
        finalSum.setResultMultiplication(result);

    }

    public static void division(Double a, Double b, Result finalSum){
        Double result = a/b;
        finalSum.setResultDivision(result);

    }




}
