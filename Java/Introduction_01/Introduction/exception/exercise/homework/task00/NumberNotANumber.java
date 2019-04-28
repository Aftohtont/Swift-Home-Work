package homework.exception_09.exercise.homewrork.task00;

import java.util.Scanner;

public class Task0_NumberNotANumber {

    public static void main(String[] args) {


        Scanner sc=new Scanner(System.in);


        while(true){

            System.out.println("enter integer number");
            String command=sc.nextLine().toLowerCase();
            boolean isNumber=true;

                try{
                    int number=Integer.parseInt(command);
                    System.out.println("Number");
                }catch (NumberFormatException ex){
                    System.out.println("Not a number");
                    isNumber=false;
                }
                if(command.equals("end")){
                   break;
                }

        }
    }
}
