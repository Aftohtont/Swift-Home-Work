package homework.arrays_strings_04.task02;

public class Task2e_LongestIncreasingSubsequence {
    public static void main(String[] args) {

        int[] arr = {9, 8, 1, 2, 6, 11, 4, 8, 9, 3};

        int maxLenght = 1;
        int endIncrease = 0;

        int currentLenght = 1;
        for (int i = 1; i < arr.length; i++) {

            if (arr[i - 1] < arr[i]) {
                currentLenght++;
            } else {// end increase
                if (currentLenght > maxLenght) {
                    maxLenght = currentLenght;
                    endIncrease = i - 1;
                }
                currentLenght = 1;
            }
        }
        if (currentLenght > maxLenght) {
            maxLenght = currentLenght;
            endIncrease = arr.length - 1;
        }


        for (int i = endIncrease; i >= 0; i--) {
            System.out.print(arr[endIncrease- -- maxLenght] + " ");
            if (maxLenght == 0) {
                break;
            }
        }
    }
}
