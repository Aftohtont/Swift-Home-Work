package homework.console_conditional_loops_03;

import java.util.Scanner;

public class Task4c_PrintEverySentence {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Write you're story here and i print for you(give sentence)");
        String inputSentence = sc.nextLine();
                if (inputSentence.isEmpty()){
                    System.out.println("enter sentences can't be empty");
                    return;
                }
        // iterate in all input to take every sentence
        for (String sentence : inputSentence.split("[.?!]")) {//split to take separate sentence
            System.out.println(sentence);
        }


    }
}

