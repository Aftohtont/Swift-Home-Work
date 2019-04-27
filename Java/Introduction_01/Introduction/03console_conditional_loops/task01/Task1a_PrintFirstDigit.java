package homework.console_conditional_loops_03;

import java.util.Scanner;

public class Task1a_PrintFirstDigit {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter number");
        int a = sc.nextInt();
        int firstDigit=0;
        while (a!=0){
            firstDigit=a%10;//take digit
            a/=10;// remove last digit
        }

        System.out.println(firstDigit);


    }
}
