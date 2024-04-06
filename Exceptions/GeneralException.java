package Exceptions;

import Exceptions.OperationExceptions.*;

public class GeneralException {
    public static void main(String[] args) {
        int number = 0;
        try {
            number = 10/0;
        } catch (Exception e) {
            e.printStackTrace(System.out);
        }
        System.out.println(number);
    }
}
