package homework.arrays_strings_04.task02;

import java.util.Arrays;
import java.util.Scanner;

public class task2b_PrintSortedNumbers {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        System.out.println("Enter number of item which stored in array");

        int nItems=sc.nextInt();
        int[] arr=new int[nItems];

        for (int i = 0; i <arr.length ; i++) {
            System.out.print("Enter number");
            arr[i]=sc.nextInt();
        }

        // sorted logic
        for (int i = 0; i <arr.length ; i++) {
            int min=i;
            for (int j = i+1; j <arr.length ; j++) {
                if (arr[min]>arr[j]){
                    min=j;
                }
            }
            //swap
                int tmp=arr[i];//save first min we choose
                    arr[i]=arr[min];//take new find min
                    arr[min]=tmp;//take first min we choose

        }
        System.out.println(Arrays.toString(arr));

    }
}
