package homework.console_conditional_loops_03;

import java.util.Scanner;

public class Task0b_ReadLine {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter something and hit enter at the end!");

        String line=sc.nextLine();// use to storage in string becouse nextLine() retunr vvariable in type string
        System.out.println("Your input text is: "+line);
    }
}
