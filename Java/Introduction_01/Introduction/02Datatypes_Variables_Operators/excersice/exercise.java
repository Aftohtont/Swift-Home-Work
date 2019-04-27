package homework.dataTypes_Variables_02;

public class Excercise {

    public static void main(String[] args) {
        // 1) delaration varaible- is only type of variable and name and semicolon(;)
                        int a; // 1)declaration
        // 2)initialisation- type variable name variable = value variable
                     int number = 5;//make initialisation
                     a = 10;
            /*  type of variables *1)primitive and *2)refernce

                    *1) primitive content value in stack memory
                            - type variables of primitive type: Integer(byte,short,int,long),char;boolean,Floating-point(doublefloat)

                    *2) refernce content value in heap memory
                            - type variables of refernce type: Strings,Arrays etc.
         */

        //exercise declaration and initialisation at the same time
                int i=5;
               // byte b=181;// out fo range and give error
                //char c="c";// error because litteral(" " ) is for string
            float f=//-1234.56789123;//make error we must add litteral "f"
            f=-1234.56789123f;// add float
                    int d='c';//literal' '- foe char work because they have encoding represantation which mean they has number represantation in ascii table

        // initialize constant whit keyword- final(it mean immutable)
            // convection to write constant ALL_WHIT_UPPER_CASE and every different word separate whit under line(_)
            // Declaration constant
            final double Constan_PI=3.14;

            // CONVERTION DIFFERENT TYPE OF PRIMITIVE VARIABLE- use termin cast
            // cast can be 1) implicity and 2) explicity

                // 1) implicit- when we don't need to told on compilator to convert variable of certain type to anotother(compiler make for us automaticaly)

                        // exmaple implicity:
                    // !!!!!!!!! => here no dangerous of loose accuracy
                                int integer=999;
                                float fl=integer;// here float comvert automatical to float number]

        // 2) explicit- we must to say on compiler to convert to another primitive type

        // !!!!!!!!! => here has dangerous of loose accuracy

        // exmaple implicity:
                            byte b=(byte)integer;// (byte) statment in brackets is desire type of comvert( to byte from integer)


    }
}








