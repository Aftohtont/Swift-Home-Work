package homework.console_conditional_loops_03;

import java.util.Scanner;

public class Task2c_PrintEvenNumbers {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter number of iteration to input set of numbers:");
        int n=sc.nextInt();
        String[] setNumbers=new String[n];

        // input numbers from user
        for (int i = 0; i <n ; i++) {
            System.out.print("enter number:");
            double d=sc.nextDouble();
            if (d%2==0){
                setNumbers[i]=String.valueOf(d);
            }

        }

        //print even numbers
        for (int i = 0; i <setNumbers.length ; i++) {
            if (setNumbers[i]!=null)
            System.out.print(setNumbers[i]+" ");
        }
    }
}
