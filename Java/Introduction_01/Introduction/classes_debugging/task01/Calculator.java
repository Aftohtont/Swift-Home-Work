package homework.oop_principles_debugginf_06.task01;

public class Calculator {

    public double sum(double a, double b) {
        return a + b;
    }

    public double substract(double a, double b) {
    /*
        if (a > b) {
            double tmp = a;
            a = b;
            b = tmp;
        }
        */
        return a - b;
    }

    public double multiply(double a, double b) {
        return a * b;
    }

    public double divide(double a, double b) {
            return a / b;
    }


    public double percentage(double a, double b) {
        return (b / 100) * a;
    }


}
