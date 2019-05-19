package hmw10;

import javax.jnlp.IntegrationService;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;



105 <111 121 107 141 131-> 105  121 107 <141 131->105  121 107  131


public class Task5_ChildPlay {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

			
        List<Integer> childs = new ArrayList();
        int numberChilds = sc.nextInt();
        for (int i = 0; i < numberChilds; i++) {
            System.out.println("Enter height of child");
            childs.add(sc.nextInt());
        }

        int rounds = 0;

        for (int i = 0; i < childs.size(); i++) {
            List<Integer> exclude = new ArrayList<>();
            int removeChild = 0;
            for (int leftChild = 0; leftChild < childs.size() - 1; leftChild++) {
                int rightChild = leftChild + 1;
                if (childs.get(leftChild) < childs.get(rightChild)) {
                    exclude.add(rightChild);
                    removeChild++;
                }
            }

            // after round remove child
            while (removeChild > 0) {

                int indx = exclude.get(removeChild - 1);
                childs.remove(indx);
                removeChild--;
                // end one round
                if (removeChild == 0)
                    rounds++;
            }


        }
        System.out.println(rounds);
    }

}

