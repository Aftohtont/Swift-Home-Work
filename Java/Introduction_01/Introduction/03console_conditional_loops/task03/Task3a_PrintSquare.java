package homework.console_conditional_loops_03;

import java.util.Scanner;

public class Task3a_PrintSquare {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("enter number to draw square:");
        int n=sc.nextInt();


        for (int i = 0; i <n ; i++) {
            if (i==0||i==n-1){
                for (int j = 0; j <n ; j++) {
                    System.out.print("* ");
                }
                System.out.println();
            }else{
                System.out.print('*');
                for (int j = 0; j <n*2-3 ; j++) {
                    System.out.print(" ");
                }
                System.out.print('*');
                System.out.println();
            }
        }

    }
}
