package homework.dataTypes_Variables_02;

public class Task1_ResultFromCodeFragment {

            public static void main(String[] args) {

                //a)  make calculation
                //   1) initialize:
                int a=5;
                int b=10;
                //   2)  initialize c and make exspression:
                int c=++a*b;    // here we has in variable a pre-increment(a=5=>new value of ++a=6) in varaible b we has post-increment(b=10=> new value of b=9 after muktiply)
                // 3) result in c=6*10=60; after this operation b will be b=b-1=10-1=9;
                System.out.println(c);
    // b) print in console
            System.out.println("1 + 2 = " + 1 + 2);// here result will be "12"  because has concat
            System.out.println("1 + 2 = " + (1 + 2));// here result is number 3 we has priority


    // c) print in console

            System.out.println(1 + 2 + "abc");// => 3abc, becaouse first take left part(integer) of statment
           System.out.println("abc" + 1 + 2); //=> abc12, take first leftpart(string)

    //d) mace calculation
            // initialize
                int x = 7;
                float y = 5.6f;
                float z = x * y;
                //System.out.println(z + “ “ + (x * y) );
                //retuslt wiil be compile error quotes must be " "
            }

}
