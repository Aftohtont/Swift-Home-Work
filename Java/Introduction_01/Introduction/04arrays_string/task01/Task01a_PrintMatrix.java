package homework.arrays_strings_04.task01;

public class Task01a_PrintMatrix {

    public static void main(String[] args) {
        final int dimmension = 4;

        int[][] twoDimenssional = new int[dimmension][dimmension];

        for (int row = 0; row < dimmension; row++) {
            int initializeCell = 0;// generate number of cells

            //inner iterate cols
            for (int col = 0; col < twoDimenssional[row].length; col++) {

                if (row == 0) {//calc number of cells
                    initializeCell = col * dimmension + 1;//calc and fill first line
                } else {
                    initializeCell = twoDimenssional[row - 1][col]+1;// fill rest line as take from upper filled line
                }

                twoDimenssional[row][col] = initializeCell;

            }
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
