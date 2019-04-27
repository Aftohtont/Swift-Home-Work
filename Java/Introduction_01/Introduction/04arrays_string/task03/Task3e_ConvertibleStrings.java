package homework.arrays_strings_04.task03;

import java.util.Arrays;
import java.util.Scanner;

public class Task3e_ConvertibleStrings {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter two sentence to check to check if can made new from each other");
        System.out.println("Enter first String");
        String inpFirst = sc.nextLine();
        System.out.println("Enter second String");
        String inpSeconcd = sc.nextLine();
            // split use to differential the words by blink
        String[] fSplit = inpFirst.split(" ");// take in cells only words
        String[] sSplit = inpSeconcd.split(" ");

        boolean isConvertible = true;// gives idea is the word is bigger than current to know can we add letters

        for (int i = 0; i < sSplit.length; i++) {
            if (fSplit[i].equalsIgnoreCase(sSplit[i])) {
                continue;
            } else if (!fSplit[i].equalsIgnoreCase(sSplit[i])) {
                isConvertible = false;
                break;
            }
        }
        String addWord = "";//storage longest sequence from letters from two words
        if (isConvertible) {
            if (fSplit[fSplit.length-1].length() <= sSplit[sSplit.length - 1].length()) {
                System.out.println(false);
                return;
            } else {

                String lastWord=fSplit[fSplit.length-1];
                int countLetter=0;// storage length of sequence
                for (int i = 0; i <lastWord.length(); i++) {
                        if (Character.isDigit(lastWord.charAt(i))){//scratch the letters
                            continue;
                        }else{//add letters to add to our word and make new convertible strings
                            countLetter++;
                            if (countLetter>fSplit[fSplit.length-1].length()-1){
                                addWord+=lastWord.charAt(i);
                            }
                        }
                }
            }
            System.out.println(isConvertible);
        }else{
            System.out.println(!isConvertible);
        }
        System.out.println();
       // System.out.println(Arrays.toString(sSplit) + addWord);

    }
}
