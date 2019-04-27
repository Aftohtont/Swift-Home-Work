package homework.console_conditional_loops_03;

import java.util.Scanner;

public class Task2a_PrintSumOfN {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter digit which represent set of numbers:");
        int n=sc.nextInt();
        System.out.println();
        double sum=0;
        for (int i = 0; i <n ; i++) {
            System.out.print("enter number which add to sum:");
            sum+=sc.nextDouble();
        }
        System.out.println("Sum is "+sum);

    }
}
