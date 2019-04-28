package homework.exception_09.exercise.homewrork.task01;

import java.util.Scanner;

public class Task_01SumNumber {

    public static void main(String[] args) throws ArithmeticException {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter positive number");
        double a=sc.nextDouble();
        System.out.println("enter positive number");
        double b=sc.nextDouble();
        calculateSum(a,b);
   }

    static void calculateSum(double a, double b) throws ArithmeticException {
        if (a == b) {
            throw new ArithmeticException("Numbers can't be equal!");
        } else if (a < 0 || b < 0) {
            throw new ArithmeticException("Negative number", new java.lang.ArithmeticException());
        }

        System.out.println("Sum is:"+(a+b));
    }


    static class ArithmeticException extends Exception {


        public ArithmeticException(String message) {
            super(message);
        }

        public ArithmeticException(String message, Throwable cause) {
            super(message, cause);
        }
    }

}
