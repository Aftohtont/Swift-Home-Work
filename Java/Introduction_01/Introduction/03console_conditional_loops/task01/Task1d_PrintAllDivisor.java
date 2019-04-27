package homework.console_conditional_loops_03;

import java.util.Scanner;

public class Task1d_PrintAllDivisor {
    public static void main(String[] args) {
        System.out.println("enter number");

        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        for (int i = 1; i <=a ; i++) {
            if (a%i==0){
                System.out.print(i+ " ");
            }
        }
    }
}
