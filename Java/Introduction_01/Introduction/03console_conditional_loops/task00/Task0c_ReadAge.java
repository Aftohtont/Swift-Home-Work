package homework.console_conditional_loops_03;

import java.util.Scanner;

public class Task0c_ReadAge {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter you are  age");
        int age=sc.nextInt();
        if (age>17){
            System.out.println("Yuo are adult");
        }else{
            System.out.println("You are child!");
        }
    }
}
