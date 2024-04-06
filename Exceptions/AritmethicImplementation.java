package Exceptions;

import static Exceptions.Aritmethic.*;

public class AritmethicImplementation {
    public static void main(String[] args) {
        try {
            division(10,0);
        }
        catch (OperationExceptions e) {
            System.out.println(e.getMessage());
        }
        catch (Exception e) {
            //e.printStackTrace(System.out);
            System.out.println(e.getMessage());
        } finally {
            System.out.println("execution completed");
        }
    }
}
