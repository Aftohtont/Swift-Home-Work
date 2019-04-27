package homework.arrays_strings_04.task03;

import java.util.Arrays;
import java.util.Scanner;

public class Task3c_CaesarCipher {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("enter messege");

        String messege =sc.nextLine();
        System.out.println("Enter \"encode\" to encode messege or \"decode\" to decode");
        //encode logic
        String encode = sc.nextLine();
                // if encode is true take +1 end use to encode the messege, else false use -1 to decode messege
        int cipher = encode.equalsIgnoreCase("encode") ? 1 : -1;

        for (int i = 0; i < messege.length(); i++) {
            boolean hasCheck = false;
            char ch = messege.charAt(i);
                //search for char in word
            if (ch  >= 'A' && ch <= 'Z') {//if found replace whit the value of cipher
                if (ch + cipher > 'Z') {//if is last letter put A(from begin)
                    ch = 'A';
                } else if (ch + cipher < 'A') {//if letter is smaller of A put Z
                    ch = 'Z';
                } else {
                    ch = (char) (ch + cipher);//just replace current char whit the next in asci table
                }
                hasCheck = true;
                //take next char of ascii table
            }
            if (ch  >= 'a' && ch  <= 'z') {
                if (ch + cipher > 'z') {
                    ch = 'a';
                } else if (ch + cipher < 'a') {
                    ch = 'z';
                } else {
                    ch = (char) (ch + cipher);
                }
                hasCheck = true;
            }
            if (ch == ' ' || hasCheck == true)// print new messege after modify
                System.out.print(ch);
        }
    }
}
