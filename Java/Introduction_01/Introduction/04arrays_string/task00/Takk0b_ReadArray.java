package homework.arrays_strings_04.task00;

import java.util.Arrays;
import java.util.Scanner;

public class Takk0b_ReadArray {

    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.print("enter lenght of array:");
        int size=sc.nextInt();// storage lenght of array
        // initialize array: []- that is symbol for stack of elemnths
        // 1)type 2)[] 3)name 4)= 5)new 6)type 7[here put size]
              int   []  array   =   new   int  [size];

        System.out.print("enter numbers like pattern:1 4 5 6:");
        for (int i = 0; i <size ; i++) {

            array[i]=sc.nextInt();
        }
        System.out.println(Arrays.toString(array));



    }
}
