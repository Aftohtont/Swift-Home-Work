package homework.dataTypes_Variables_02;

public class Task5SwapVariables {
    public static void main(String[] args) {

        byte a=5;
        byte b=9;
        System.out.println("First variant");
        System.out.println("Before swap a="+a+" b="+b);
                    // first variant whit temporary variable
        byte temp=a;// take old value of a
        a=b;// take value of b
        b=temp;// take old value of a
        System.out.println("After swap a="+a+" b="+b);
        System.out.println("=========================");
                    // second whit add
            b=9;
            a=5;
        System.out.println("Second variant");
        System.out.println("Before swap a="+a+" b="+b);

            a=(byte)(a+b);// we have a and b part a= a+b=14
            // in b mst take diff
            b=(byte)(a-b);// take diiff b=5;
            a=(byte)(a-b);// take a=9

        System.out.println("After swap a="+a+" b="+b);
        System.out.println("=========================");
                    // third variant
            b=9;
            a=5;
        System.out.println("Third variant");
        System.out.println("Before swap a="+a+" b="+b);
        a=(byte)(a*b);// a times b
        b=(byte)(a/b);// many a*b  inside in a
        a=(byte)(a/b);// many a*b inside in b
        System.out.println("After swap a="+a+" b="+b);
        System.out.println("=========================");

        // last variant whit bits operations
        b=9;
        a=5;

        System.out.println("Last variant");
        System.out.println("Before swap a="+a+" b="+b);
            a=(byte)(a^b);
            b=(byte)(a^b);
            a=(byte)(a^b);
        System.out.println("After swap a="+a+" b="+b);



    }


}
