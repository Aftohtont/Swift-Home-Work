package homework.dataTypes_Variables_02;

public class Task2_LeapYear {

    // leap years when is devide on4
        //if year devide on 100 is not leap
        // if is devide on 400 is leap year

    public static void main(String[] args) {
        int year=1500; // input 2016, 1992,2001,1900,2400
        boolean isLeap=false;
        if (year%4==0){ // maybe leap year
                // check is real leap year
                if (year%100==0&&year%400==0){//we has leap year
                    isLeap=true;
                    System.out.println("Leap year->" +isLeap);
                }else if(year%100==0){// not leap year
                    System.out.println("Leap year->" +isLeap);
                }else {// leap year
                    isLeap=true;
                    System.out.println("Leap year->" +isLeap);
                }
        }else {// not leap year
            System.out.println("Leap year->" +isLeap);
        }
    }

}
