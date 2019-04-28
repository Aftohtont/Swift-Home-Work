
import java.util.InputMismatchException;
import java.util.Scanner;

public class EnterFloat {


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter floart number");
        boolean isFloat = true;
        do {

            try {
                isFloat = true;
                float f = sc.nextFloat();

            } catch (InputMismatchException ex) {
                System.out.println("You must enter only float numbers! Try again!");
                isFloat = false;
                sc.nextLine();
            }
        } while (!isFloat);

    }
}
