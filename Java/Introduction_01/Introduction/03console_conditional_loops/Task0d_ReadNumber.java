package homework.console_conditional_loops_03;

import java.util.Scanner;

public class Task0d_ReadNumber {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter number for number of digit you will input");
        int b=sc.nextByte();

        for (int i = 0; i < b; i++) {
            System.out.println(sc.nextInt());
        }

    }
}
