

import java.util.Scanner;
import java.util.Stack;

public class Task7_StackMax {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Stack stack = new Stack();
        Stack auxiliaryStack = new Stack();

        stopkLooop:

        while (true) {


            String command = sc.next().toUpperCase();

            if (command.equalsIgnoreCase("END")) {

                if (!auxiliaryStack.isEmpty()) {
                    while (!auxiliaryStack.isEmpty()) {
                        System.out.print(auxiliaryStack.toString() + " ");
                        break stopkLooop;
                    }
                } else {
                    System.out.println("Bye, no pop and remove elementh!");
                    break stopkLooop;
                }
            }

            switch (command) {
                // push insert element

                case "PUSH":
                    int number = sc.nextInt();
                    stack.push(number);

                    System.out.println("_________________");
                    System.out.println("|insert number->" + number + "|");


                    break;

                // pop- remove element
                case "POP":
                    auxiliaryStack.push(stack.peek());
                    System.out.println("_________________");
                    System.out.println("|remove number->" + stack.pop().toString() + "|");

                    break;

                // max-find max number
                case "MAX":
                	
                    int maxNumber = (int) stack.peek();

                    while (!stack.isEmpty()) {
                        if (maxNumber < (int) stack.peek()) {
                            maxNumber = (int) stack.peek();

                        }

                        stack.pop();
                    }
                    auxiliaryStack.push(maxNumber);
                    System.out.println(maxNumber);
                    break;

                default:
                    System.out.println("Invalid command , try again!");
                    break;
            }
        }


    }
}
