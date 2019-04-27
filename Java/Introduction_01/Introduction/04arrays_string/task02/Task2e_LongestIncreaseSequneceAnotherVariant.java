package homework.arrays_strings_04.task02;

public class Task2e_LongestIncreaseSequneceAnotherVariant {
    public static void main(String[] args) {
        int[] arr = {9, 8, 1, 2, 6};

        int curentSubLenght = 1;
        int maxSublenght = 0;
        int currentIdx = 0;
        int maxSubIdx = 0;
        boolean inSequence = false;
        for (int i = 1; i < arr.length; i++) {

            if (arr[i - 1] < arr[i]) {
                curentSubLenght++;
                if (!inSequence) {
                    currentIdx = i - 1;
                    inSequence = true;
                }
            } else {

                if (curentSubLenght > maxSublenght) {
                    maxSublenght = curentSubLenght;
                    maxSubIdx = currentIdx;
                }

                curentSubLenght = 1;
                currentIdx = i;
            }
        }
        if (curentSubLenght > maxSublenght) {
            maxSublenght = curentSubLenght;
            maxSubIdx = currentIdx;
        }
        for (int j = maxSubIdx; j <maxSubIdx+ maxSublenght; j++) {
            System.out.print(arr[j] + " ");
        }
    }
}



