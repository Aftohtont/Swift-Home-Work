package homework.arrays_strings_04.task01;

public class Task01b_PrintMatrix {


    public static void main(String[] args) {
        final int dimmension = 4;

        int[][] twoDimenssional = new int[dimmension][dimmension];
        int initializeCell = 0;// generate number of cells
        for (int col = 0; col < dimmension; col++) {

            //inner iterate cols


            for (int row = 0; row < twoDimenssional[col].length; row++) {
                if (col == 0 &&row==0) {
                    initializeCell = col * dimmension + 1;
                }
                if (col % 2 == 0) {
                    twoDimenssional[row][col] = initializeCell++;
                } else {
                    twoDimenssional[row][col] = --initializeCell;
                }


            }
            //update initializeCell
            initializeCell += dimmension;
        }

        System.out.println("__ __ __ __ __ __ __");
        for (int row = 0; row < twoDimenssional.length; row++) {

            //inner iterate cols
            for (int col = 0; col < twoDimenssional[row].length; col++) {
                System.out.print("| ");
                if (twoDimenssional[row][col] < 9) {

                    if (col == twoDimenssional[row].length - 1) {
                        System.out.println(twoDimenssional[row][col] + " |");

                        System.out.println("__ __ __ __ __ __ __");
                        continue;
                    }
                    System.out.print(twoDimenssional[row][col] + " |");

                } else {
                    if (col == twoDimenssional[row].length - 1) {
                        System.out.println(twoDimenssional[row][col] + "|");
                        System.out.println("__ __ __ __ __ __ __");
                        continue;
                    }
                    System.out.print(twoDimenssional[row][col] + "|");
                }

            }

        }

    }
}



