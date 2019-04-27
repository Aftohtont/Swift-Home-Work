package homework.console_conditional_loops_03;

import java.util.Scanner;

public class Task4b_SecondVariant {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter sentence");
        String sentence = sc.nextLine();
        boolean isWord = true;
        int countWord = 0;

        //outer loop iterate all words in sentence
        for (String word : sentence.split("[().?! ]")) {//separate words by this symbol
            //inner loop iterate in word lenght
            isWord = !word.isEmpty(); // save us from recognising empty strings as words
            for (int i = 0; i < word.length(); i++) {
                if ((word.charAt(i) < 'A' || word.charAt(i) > 'Z') && (word.charAt(i) < 'a' || word.charAt(i) > 'z')||word.charAt(i)=='’') {//last check is type doesn't not d'oesnt
                    if (i == word.length() - 2) {//mean word has "’" in properly place exmamle doesn't not d'oesnt
                        continue;
                    }
                    isWord = false;
                    break;
                }
            }//end word loop
            if (isWord) {
                countWord++;
            }
        }//end sentence loop
        System.out.println(countWord);
    }


}
