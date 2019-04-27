package homework.arrays_strings_04.task02;

import java.util.Scanner;

public class Task2a_PrintLargestNumber {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        System.out.println("Enter number of item which stored in array");

        int nItems=sc.nextInt();
        int[] arr=new int[nItems];
        int max=arr[0];

        for (int i = 0; i <arr.length ; i++) {
            System.out.print("Enter number");
            arr[i]=sc.nextInt();
            if (max<arr[i]){
                max=arr[i];
            }
        }

        System.out.println("Max number from input is "+max);
    }


}
