package Exceptions;

public class Aritmethic {
    public static int division(int numerator, int denominator) throws OperationExceptions {
        if(denominator == 0) {
            throw new OperationExceptions("La división entre 0 no es permitida");
        }
        return numerator / denominator;
    }
}
