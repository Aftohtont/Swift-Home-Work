package homework.arrays_strings_04.task01;

public class Task01c_PrintMatrix {
//TODO matrix condition c) and D)

    public static void main(String[] args) {
        int DIM = 4;

        int[][] matrixC = new int[DIM][DIM];
        int counter = 1;
        for (int i = 0; i < DIM; i++) {
            if (i % 2 == 0) {
                for (int j = 0; j <= i; j++) {
                    matrixC[i - j][j] = counter++;
                }
            } else {
                for (int j = i; j >= 0; j--) {
                    matrixC[i - j][j] = counter++;
                }
            }
        }

        for (int i = DIM - 1; i >= 0; i--) {
            if (i % 2 == 1) {
                int rowIdx = DIM - 1;
                for (int j = DIM - i; j < DIM; j++) {
                    matrixC[rowIdx][j] = counter++;
                    rowIdx--;
                }
            } else {
                int rowIdx = DIM - i;
                for (int j = DIM - 1; j >= DIM - i; j--) {
                    matrixC[rowIdx][j] = counter++;
                    rowIdx++;
                }
            }
        }


        for (int i = 0; i <DIM ; i++) {
            for (int j = 0; j <DIM ; j++) {
                System.out.print(matrixC[i][j]+" ");
            }
            System.out.println();
        }
    }

}
