package homework.oop_principles_debugginf_06.task01;

import java.util.Scanner;

public class DemoCalc {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter function like example: sum 4 3");

        String[] input = sc.nextLine().split(" ");
        String command = "";
        double a = 0;
        double b = 0;
        if (input.length == 1) {
            command = input[0].toLowerCase();
        } else if (input.length >= 3) {
            command = input[0].toLowerCase();
            a = Double.parseDouble(input[1]);
            b = Double.parseDouble(input[2]);
        } else {
            System.out.println("incorrect input");

        }


        while (command != "end") {
            Calculator calc = new Calculator();
            if (command.equals("end")) {
                System.out.println("Turn off calculator");
            } else {
                switch (command) {
                    case "sum":
                        System.out.printf("%.3f%n", (calc.sum(a, b)));
                        break;
                    case "sub":
                        System.out.printf("%.3f%n", calc.substract(a, b));
                        break;
                    case "mul":
                        System.out.printf("%.3f%n", calc.multiply(a, b));
                        break;
                    case "div":
                        System.out.printf("%.3f%n", calc.divide(a, b));
                        break;
                    case "per":
                        System.out.printf("%.3f%n", calc.percentage(a, b));
                        break;
                    default:
                        System.out.println("unsupported future");
                        break;
                }
            }
            System.out.println("Enter function like example: sum 4 3");
            input = sc.nextLine().split(" ");
            if (input.length == 1) {
                command = input[0];
            } else {
                command = input[0].toLowerCase();
                a = Double.parseDouble(input[1]);
                b = Double.parseDouble(input[2]);
            }


        }
    }
}