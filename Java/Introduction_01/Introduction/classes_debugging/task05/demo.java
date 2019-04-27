package homework.oop_principles_debugginf_06.task05;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.util.Date;
import java.util.Scanner;

public class demo {

    public static void main(String[] args) throws ParseException {

        Scanner sc =new Scanner(System.in);
        System.out.println("Enter characteristics like exmaple: First name;Last name;char for gender;height;Date of bird;education institution;enroll date education;date graduate;grade");
        String [] characteristics=sc.nextLine().split(";");
        PersonCharacterisitcs pc=null;
            if (characteristics.length==8){
               pc=new PersonCharacterisitcs(characteristics[0],characteristics[1],characteristics[2].charAt(0),Integer.parseInt(characteristics[3].substring(characteristics[3].length()-1)),characteristics[4],characteristics[5],characteristics[6],characteristics[7],"");
            }else{
                pc=new PersonCharacterisitcs(characteristics[0],characteristics[1],characteristics[2].charAt(0),Integer.parseInt(characteristics[3].substring(characteristics[3].length()-1)),characteristics[4],characteristics[5],characteristics[6],characteristics[7], characteristics[8]);
            }

    //first part of task
//             pc.printInfo();
        //second part
   System.out.println(pc.toString());

    }
}
