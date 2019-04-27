package homework.arrays_strings_04.task00;

public class Task0d_Print2dArray {

    public static void main(String[] args) {

        final int oneDimenssion = 4;
        final int secDimenssion = 4;


        int[][] twoDimenssionalArr = new int[oneDimenssion][secDimenssion];


        //fill aray
        // outer loop iterate rows
        for (int row = 0; row < twoDimenssionalArr.length; row++) {
            //inner iterate cols
            for (int col = 0; col < twoDimenssionalArr[row].length; col++) {
                int cellCount=(row*oneDimenssion)+1+col;//this exspression ride numeration in cells
                twoDimenssionalArr[row][col] =cellCount ;
            }
        }

        System.out.println("__ __ __ __ __ __ __");
        for (int row = 0; row < twoDimenssionalArr.length; row++) {

            //inner iterate cols
            for (int col = 0; col < twoDimenssionalArr[row].length; col++) {
                System.out.print("| ");
                if (twoDimenssionalArr[row][col] < 9) {

                        if (col==twoDimenssionalArr[row].length-1){
                            System.out.println(twoDimenssionalArr[row][col] + " |" );

                            System.out.println("__ __ __ __ __ __ __");
                            continue;
                        }
                    System.out.print(twoDimenssionalArr[row][col] + " |");

                } else {
                    if (col==twoDimenssionalArr[row].length-1){
                        System.out.println(twoDimenssionalArr[row][col] + "|");
                        System.out.println("__ __ __ __ __ __ __");
                        continue;
                    }
                    System.out.print(twoDimenssionalArr[row][col] + "|");
                }

            }
        }
    }
}
