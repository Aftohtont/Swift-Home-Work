package homework.dataTypes_Variables_02;

public class Task6_SecondsINBiggerIntervals {
    public static void main(String[] args) {
        int seconds=1234567;

        // 1 day=24 hours but 1 hour=3600sec=> (24*3600)/
        int days=seconds/(24*3600);//give days
        // if we has1,6 days we take 0,6 which are hours of day
        int hours =(seconds%(24*3600))/3600;// take reaminder of days which is hours 1hour=3600sec we search total hours of day

        int minutes=((seconds%(24*3600))%3600)/60;//from hours(%3600) take reaminder and devide(/60) gives minutes

        int remaindeSeconds=((seconds%(24*3600))%3600)%60;
        System.out.println(days+" days "+hours+" hours "+minutes+" minutes "+remaindeSeconds+" seconds ");

    }
}
