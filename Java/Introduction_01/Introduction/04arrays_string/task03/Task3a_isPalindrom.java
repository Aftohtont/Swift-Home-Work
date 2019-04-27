package homework.arrays_strings_04.task03;

import java.util.Scanner;

public class Task3a_isPalindrom
{


    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter word");
            String word=sc.nextLine();
            boolean isPalindrom=true;

        for (int i = 0; i <word.length()/2 ; i++) {
            //check if we found different character we stop because we don't has a palindrome
                if (word.charAt(i)!= word.charAt((word.length()-1)-i)){
                            isPalindrom=false;
                            break;
                }
        }

        System.out.println(isPalindrom);
    }
}
