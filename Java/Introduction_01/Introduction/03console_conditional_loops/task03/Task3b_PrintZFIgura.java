package homework.console_conditional_loops_03;

import java.util.Scanner;

public class Task3b_PrintZFIgura {

    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);
        System.out.println("enter number to draw figura \"Z\" ");
        int n=sc.nextInt();


        for (int i = 0; i < n; i++) {
            if (i==0||i==n-1){
                for (int j = 0; j <n ; j++) {
                    System.out.print("* ");
                }

            }else{

                for (int j = 0; j <n ; j++) {
                    if (j==n-i-1){
                        System.out.print("*");
                    }else{
                        System.out.print("  ");
                    }
                }

            }
            System.out.println();
        }
    }
}
