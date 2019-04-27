package homework.dataTypes_Variables_02;

public class Task3_CalcualtionExpressions {

    public static void main(String[] args) {

        //( 3291 + 88581 ) / 14 + ( 1116 % 171 ) * 5 – 312 / ( 4 + 18 ) calculation
        double leftTerms=( 3291 + 88581 ) / 14;
        double secondTerms=( 1116 % 171 );
        double lastTerms=(5-312)/ ( 4 + 18 );


        double result=leftTerms+secondTerms  *lastTerms;
        System.out.println(result);
    }
}
