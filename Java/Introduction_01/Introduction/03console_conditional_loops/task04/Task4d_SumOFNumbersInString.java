package homework.console_conditional_loops_03;

import java.util.Scanner;

public class Task4d_SumOFNumbersInString {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter sentence whit number of quality and i will calculate for you1");
        String input = sc.nextLine();

        System.out.println("\nSum of numbers: ");
        int sum = 0;
        String currNumber = "";
        for (int i = 0; i < input.length(); i++) {
            if (input.charAt(i) >= '0' && input.charAt(i) <= '9') {
                currNumber = currNumber + input.charAt(i);
            } else if (!currNumber.isEmpty()) {
                sum += Integer.parseInt(currNumber);
                currNumber = "";
            }

        }

        System.out.println(sum);
    }
}
