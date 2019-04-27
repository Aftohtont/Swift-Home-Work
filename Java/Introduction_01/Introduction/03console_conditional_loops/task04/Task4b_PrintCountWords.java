package homework.console_conditional_loops_03;

import javax.print.DocFlavor;
import java.util.Scanner;

public class Task4b_PrintCountWords {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter Sentec to count words");
        String str = sc.nextLine();

        String word = "";// to storage the sentence input
        boolean hasCheck = false;//to see is make check if in the edn of sentence user don't use pucntuation (then end of sentence no punctuation symbol i make chek to count the word
                                    // this check i use when has only one word

        //check for begin word- we understand is new word when is surrounded from white spaces
        int countWord = 0;
        for (int i = 0; i < str.length(); i++) {// outer loop iterate all sentence
            //extract word
            char ch = str.charAt(i); // take symbols from sentence
            boolean isLetter = (ch >= 'A' && ch <= 'Z') || (ch >= 'a' && ch <= 'z');// check for alphabet

            //check is begin word: we understand is begin  whne is not blank and must start whit letter to be sure we found alphabet
            if (ch != ' ' && isLetter) {//chek start of word is letter
                word += ch;
            } else if (ch == '’' || ch >= '0' && ch <= '9' || ch == '\'') {//check ch=='’' to see is word not of type doesn't and take digit because i won't to take all word and finally to check(If has digit not count)
                word += ch;
            } else {//check we at the end of word example rod,  rod: rod; rod! rod. rod? etc
                if (ch == ' ' || ch == ',' || ch == '.' || ch == '!' || ch == '?' || ch == ')' || ch == ']' || ch == ';' || ch == ':') {

                    hasCheck = true;
                    if (ch == ' ' && word.length() < 1) {//when word is just one char of empty space is not a word
                        continue;
                    }
                    boolean isWord = true;//represent word only whit aplhabet
                        //whit inner loop iterate word to see what has in her
                    for (int j = 0; j < word.length(); j++) {//check all word  is content only aplhabet
                        ch = word.charAt(j);
                        isLetter = (ch >= 'A' && ch <= 'Z') || (ch >= 'a' && ch <= 'z');

                        if (!isLetter) {//end of word maybe white space,punctuation
                            if ((ch == '’' && j == word.length() - 2)) {//check is word of type dosn't if d'oesnt we don't need
                                continue;
                            } else {//has something else in word is not a letter
                                isWord = false;
                                break;
                            }
                        }
                    }//end inner loop
                    if (isWord) {
                        countWord++;
                    }
                } else {// inside the word we have something strange example pic4ure
                    continue;//take word to the end
                }

                word = "";//when finish clear to take anothe word
            }//end else
        }//end of outer loop

            if (!hasCheck) {//here is to see at the end if user is forgotten to put punctuation
            boolean isAword = true;
            for (int j = 0; j < str.length(); j++) {//check all word  is content only aplhabet
                char ch = word.charAt(j);
                boolean isLetter = (ch >= 'A' && ch <= 'Z') || (ch >= 'a' && ch <= 'z');

                if (!isLetter) {//end of word maybe white space,punctuation
                    if ((ch == '’' && j == word.length() - 2)) {//check is word of type dosn't if d'oesnt we don't need
                        continue;
                    } else {//has something else in word is not a letter
                        isAword = false;
                        break;
                    }
                }

            }

            if (isAword) {
                countWord++;
            }
            // here when has word which is not separete from white space or punctuation sign example "the" it works only for single word
        }else if(word.length()>0){
            boolean isAword=true;
            for (int j = 0; j < word.length(); j++) {//check all word  is content only aplhabet
                char ch = word.charAt(j);
                boolean isLetter = (ch >= 'A' && ch <= 'Z') || (ch >= 'a' && ch <= 'z');

                if (!isLetter) {//end of word maybe white space,punctuation
                    if ((ch == '’' && j == word.length() - 2)) {//check is word of type dosn't if d'oesnt we don't need
                        continue;
                    } else {//has something else in word is not a letter
                        isAword = false;
                        break;
                    }
                }

            }
            if (isAword) {
                countWord++;
            }
        }
            System.out.println(countWord);
            System.out.println();

    }
}

