package homework.console_conditional_loops_03;

public class Task3c_PrintChrismtasTree {


    public static void main(String[] args) {
            int n=10;

            int midlle=(n+2)/2;
            if (n%2!=0){
                midlle++;
            }

        for (int i = 0; i <n ; i++) {
            for (int j = 0; j <n+3; j++) {
                if (midlle==j+i) {
                    System.out.print("*");
                }else{
                    System.out.print("-");
                }
            }
            System.out.println();
        }


    }
}
