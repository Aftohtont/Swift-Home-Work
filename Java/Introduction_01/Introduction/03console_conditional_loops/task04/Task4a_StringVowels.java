package homework.console_conditional_loops_03;

import java.util.Scanner;

public class Task4a_StringVowels {

    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
            System.out.println("input Sentence to remove vowels");

            String str=sc.nextLine();
            String whioutVowels="";

        for (int i = 0; i <str.length() ; i++) {
                char ch=str.charAt(i);
                //check it contain only alphabet
            if (ch>'@'&&ch<'['||ch>96&&ch<'{'||ch==' '){
                boolean isNotVowels=(ch!='A'&&ch!='a'&&ch!='O'&&ch!='o'&&ch!='E'&&ch!='e'&&ch!='e'&&ch!='A'&&ch!='a'&&ch!='O'&&ch!='o'&&ch!='E'&&ch!='e'&&ch!='U'&&ch!='A'&&ch!='a'&&ch!='O'&&ch!='o'&&ch!='E'&&ch!='e'&&ch!='u'&&ch!='A'&&ch!='a'&&ch!='O'&&ch!='o'&&ch!='E'&&ch!='e'&&ch!='I'&&ch!='A'&&ch!='a'&&ch!='O'&&ch!='o'&&ch!='E'&&ch!='e'&&ch!='I'&&ch!='A'&&ch!='a'&&ch!='O'&&ch!='o'&&ch!='E'&&ch!='e'&&ch!='i');
                    if (isNotVowels||ch==' '){// when has no vowels is true we add to string
                        whioutVowels+=String.valueOf(ch);
                    }

            }
        }
        System.out.println(whioutVowels);


    }
}
