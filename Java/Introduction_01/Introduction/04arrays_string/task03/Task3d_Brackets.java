package homework.arrays_strings_04.task03;

import java.util.Scanner;

public class Task3d_Brackets {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter messege only from this type parenthesis \"(,),{,},[ & ]\" to check is properly close   /" );

        String inputBrackets = sc.nextLine();

        while (true) {
            int lenght=inputBrackets.length();
            inputBrackets = inputBrackets.replace("[]", "");
            inputBrackets = inputBrackets.replace("()", "");
            inputBrackets = inputBrackets.replace("{}", "");
            if (inputBrackets.length() != lenght){//from line 12 take first length and storage at the end of line 17 check current length if no different it mean no found properly close bracket and must stop
                continue;
            }else {
                break;
            }

        }


        if (inputBrackets.length()==0)
            System.out.println(true);
         else
            System.out.println(false);

    }
}






