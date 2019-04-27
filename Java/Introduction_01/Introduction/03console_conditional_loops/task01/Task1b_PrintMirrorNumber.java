package homework.console_conditional_loops_03;

import java.util.Scanner;

public class Task1b_PrintMirrorNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter number");
        int n = sc.nextInt();
        int mirrorNumber=0;
        int pos=1;
        int remainder=0;
        while (n!=0){
                remainder=n%10;
                mirrorNumber=mirrorNumber*10+remainder;
            n/=10;
        }

        System.out.println(mirrorNumber);


    }
}
