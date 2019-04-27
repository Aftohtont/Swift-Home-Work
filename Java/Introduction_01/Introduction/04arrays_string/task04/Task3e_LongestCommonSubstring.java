package homework.arrays_strings_04.task03;

import jdk.nashorn.internal.ir.IfNode;

import java.util.Scanner;

public class Task3e_LongestCommonSubstring {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter Word");
        String strOne = sc.nextLine();
        System.out.println();
        System.out.print("Enter Word");
        System.out.println();
        String strTwo = sc.nextLine();

        String currSeq = "";
        String commonSeq = "";
        String maxSequence = "";
        int currLength = 0;
        int maxLength = 0;
        int startIdx = 0;

        if (strOne.length() > strTwo.length()) {//swap the words to make check
            String tmp = strOne;
            strOne = strTwo;
            strTwo = tmp;
        }

        for (int i = 0; i < strOne.length(); i++) {

            if (strTwo.contains(strOne.substring(startIdx, i + 1))) {// check if substring contain in second word if true continue to add letters to substring and check if exist in second words

                currSeq = strOne.substring(startIdx, i + 1);//add next letter and width the substring it gives the current length
                currLength = currSeq.length();// take lenght
                continue;

            } else {  // we don't have anymore common substring and check is the biggest at the moment
                if (currLength > maxLength) { // if this substring  is the biggest new  common substring
                    maxLength = currLength;//take his length for first word
                    maxSequence = currSeq;//take length in the second
                }
                startIdx = i;//update new value to check for new common substring
                currLength = 0;//start for begin
                currSeq = "";// clear sequnce to search new one
            }
        }
        //  if (strTwo.contains(strOne.substring(startIdx, strOne.length()))) {
        //    currSeq=strOne.substring(startIdx, strOne.length());

        //here check if sequence is not contninue to the end of word
        if (currLength > maxLength) {
            maxLength = currLength;
            maxSequence = currSeq;
        }
        //}
        if (maxSequence.length() > 0)
            System.out.println(maxSequence);
        else
            System.out.println("No common sequence");
    }
}


