package homework.console_conditional_loops_03;

import java.util.Scanner;

public class Task0e_ReadNumbersOnNewLines {
    public static void main(String[] args) {
		
		// use Scanner to read from user input
        Scanner sc=new Scanner(System.in);
        System.out.println("enter digit represent number of inputs ");
		
        int count=sc.nextInt();
        String digits="";

        for (int i = 0; i < count; i++) {
            System.out.println("enter digit");
            digits+=sc.nextLine();
        }

        for (int i = 0; i <digits.length() ; i++) {
            System.out.print(digits.charAt(i)+" ");
        }
    }
}
