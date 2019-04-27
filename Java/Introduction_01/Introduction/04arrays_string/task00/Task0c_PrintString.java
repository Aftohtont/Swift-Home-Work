package homework.arrays_strings_04.task00;

import java.util.Scanner;

public class Task0c_PrintString {
    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);

        System.out.println("enter sequence");
        String input=sc.nextLine();

        for(char c:input.toCharArray()){
            System.out.println(c);
        }
    }
}
