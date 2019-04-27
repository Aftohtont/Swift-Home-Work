package homework.console_conditional_loops_03;

import java.util.Scanner;

public class Task1e_IsPrime {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        boolean isPrime=true;
        System.out.println("enter integer number");
        int n=sc.nextInt();
        if (n<0||n==0){
            System.out.println(!isPrime);
            return;
        }
        if (n==2){
            System.out.println(isPrime);
        }else {
            for (int i = 3; i < n; i++) {
                if (n % i == 0) {
                    isPrime = false;
                    break;
                }
            }
            System.out.println(isPrime);
        }

    }
}
