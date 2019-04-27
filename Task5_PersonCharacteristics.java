package homework.console_conditional_loops_03;

import java.util.Scanner;
import java.util.SortedMap;

public class Task5_PersonCharacteristics {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String fName;
        String lName;
        short age;
        short year;
        double weight;
        float tall;
        String proffesia;

        boolean isCorrect=false ;

        // add conditional statment to make the sam logic for many people
        System.out.println("Enter number of people for which you will input personal data");
            byte numOfPeople=sc.nextByte();
            if (numOfPeople<0){
                System.out.println("enter postive number of people");
                return;
            }
        while (!isCorrect&&numOfPeople>0) {// isCorrect= true will stop to ask to input
            isCorrect=true;
            System.out.println("Enter First name");
            String fn = sc.next();

            System.out.println("Enter Last name");
            String ln = sc.next();


            System.out.println("Enter age");
            short a=sc.nextShort();

            System.out.println("Enter Year of birth");
            short yb=sc.nextShort();


            System.out.println("Enter weight");
            double w=sc.nextDouble();


            System.out.println("Enter height");
            float h=sc.nextFloat();

            System.out.println("Enter occupation");
            String oc = sc.next();

            if (fn.isEmpty() || ln.isEmpty()) {//check for name
                isCorrect = false;
                System.out.println("Names can't be empty");
            }


            if (a<0||a>200){
                isCorrect=false;
                System.out.println("Years must be gretar than by 0 and smaller by 200");
            }

            if (yb<1930){
                isCorrect=false;
                System.out.println("Years must be gretar than by 1930");
            }

            if (w<0||w>300){
                isCorrect=false;
                System.out.println("Weight must be gretar than by 0 and smaller by 300");
            }


            if (h<50||h>300){
                isCorrect=false;
                System.out.println("Weight must be gretar than by 50 and smaller by 300");
            }

            if (oc.isEmpty()) {
                isCorrect = false;
                System.out.println("Proffesia can't be empty");
            }
            if (isCorrect){
                fName=fn;
                lName=ln;
                age=a;
                year=yb;
                weight=w;
                tall=h;
                proffesia=oc;
                if (numOfPeople==0){
                    isCorrect=true;
                }else {
                    isCorrect=false;
                }
                numOfPeople--;
                //print personal data
                System.out.println(fn+" "+ln+" is "+age+" years old. "+"He was born in "+year+
                      ". His weight is "+weight+" adn he is "+tall+" cm tall. "+"He is a "+proffesia
                );

            }else{
                System.out.println("Incorrect data input! Again input pls!");
            }
        }
    }



}
