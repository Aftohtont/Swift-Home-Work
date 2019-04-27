package homework.arrays_strings_04.task02;

public class Task2g_LargestSumSubsequence {
    public static void main(String[] args) {
        int[] arr = {4, 7, -3, -11, 2, 9, -4, 5, 6, -8, 0, 5};

        int currentSum=0;
        int value=Integer.MIN_VALUE;
        int maxSum=value;
        int currentStart=0;
        int maxStart=0;
        int maxEnd=0;

        for (int i = 0; i < arr.length; i++) {
            currentSum+=arr[i];

            if (currentSum>0) {
                if (currentSum > maxSum) {
                    maxSum = currentSum;
                    maxStart = currentStart;
                    maxEnd=i;
                }
            }else{
                currentSum=0;
                currentStart=i+1;
            }
        }

        for (int i = maxStart; i <=maxEnd ; i++) {
            System.out.print(arr[i]+" ");
        }
    }
}
