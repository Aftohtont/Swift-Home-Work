package homework.console_conditional_loops_03;

import java.util.Scanner;

public class Task0a_ReadInt {
    public static void main(String[] args) {
        // read make with helper class scanner
        Scanner sc=new Scanner(System.in);// (System.in) is stream flow in read from console

        System.out.println("enter integer number");

        int num=sc.nextInt();
        System.out.println("Input number is "+ ++num);//prefix(increment) num and give result

    }



}
