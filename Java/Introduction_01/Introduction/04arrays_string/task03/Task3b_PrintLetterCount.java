package homework.arrays_strings_04.task03;

import java.util.Scanner;

public class Task3b_PrintLetterCount {
    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);
        System.out.print("Enter Word to count letters:");
        String word=sc.nextLine();

         String convertLowerCase=word.toLowerCase();

            //iterate from a - z when check letters to be ordered alphabetic
        for (int i = 'a'; i <'z' ; i++) {
            int count=0;//used for count times occurs
            boolean isMatch=false;//use to print when we has min one letter available skip to print letter which are not include in word
            for (int j = 0; j <convertLowerCase.length() ; j++) {
                    if (i==convertLowerCase.charAt(j)) {
                        count++;
                        isMatch = true;
                    }
            }
              if (isMatch)
                System.out.println(((char) i) + "(" + count + ")");
        }


    }
}
