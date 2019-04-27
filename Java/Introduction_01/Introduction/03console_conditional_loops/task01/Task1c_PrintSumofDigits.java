package homework.console_conditional_loops_03;

import java.util.Scanner;

public class Task1c_PrintSumofDigits {
    public static void main(String[] args) {

        Scanner sc =new Scanner(System.in);

        System.out.println("enter integer number");

        int n=sc.nextInt();
        int sum=0;

        while(n!=0){
            sum+=n%10;
            n/=10;
        }
        System.out.println(sum);
    }
}
