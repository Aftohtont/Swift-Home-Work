package homework.console_conditional_loops_03;

import java.util.Scanner;

public class Task2b_PrintReverseSequnece {
    public static void main(String[] args) {

        Scanner sc =new Scanner(System.in);
        System.out.print("enter digit represent set of numbers:");

                  int n=sc.nextInt();
                  String[] setNumbers=new String[n];

        // input numbers from user
        for (int i = 0; i <n ; i++) {
            System.out.print("enter number:");
            double d=sc.nextDouble();
            setNumbers[i]=String.valueOf(d);
        }

        // print reverse order numbers
        for (int i = setNumbers.length-1; i >=0 ; i--) {
            System.out.print(setNumbers[i]+" ");
        }
    }
}
