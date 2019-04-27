package homework.console_conditional_loops_03;

import java.util.Scanner;

public class Task1f_TobinaryAndHexa {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter number to convert");

        int n=sc.nextInt();
        int hex=n;
        int binary=0;
        String convert="";

        if(n==0){
            System.out.println(0);
            System.out.println(0);
            return;
        }


        while(n!=0) {

            convert+=n%2;
            n/=2;
        }
        for (int i = convert.length()-1; i >=0 ; i--) {
            System.out.print(convert.charAt(i));
        }
        System.out.println();
        String converTohex="";
        int pos=0;
        while(hex!=0){

            int rem=hex%16;
            char ch=(char)rem;
            String hexConvert="";
            if (rem%16>9){

                switch (hex%16){
                    case 10:ch='A';break;
                    case 11:ch='B';break;
                    case 12:ch='C';break;
                    case 13:ch='D';break;
                    case 14:ch='E';break;
                    default:ch='F';break;
                }
            }else{
                ch+=48;
            }
            converTohex+=Character.valueOf(ch);
            hex/=16;
        }
        for (int i = converTohex.length()-1; i >=0 ; i--) {
            System.out.print(converTohex.charAt(i));
        }
    }

}
