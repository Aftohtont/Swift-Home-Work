package homework.arrays_strings_04.task02;

public class Task2d_PrintSplitIndex {

    public static void main(String[] args) {

        int[] arr={1,2,3,4, 9,1};

        int leftSum=0;
        int rightSum=0;
        int balnceSum=-1;
        //make right sum
        for (int i = 1; i <arr.length ; i++) {
            rightSum+=arr[i];
        }
        //make left sum and remove from right sum
        for (int i = 0; i <arr.length-1 ; i++) {
                leftSum+=arr[i];
                if (leftSum==rightSum){//we found equal sums
                        balnceSum=i;
                        break;
                }
                rightSum-=arr[i+1];

        }
        if (balnceSum==-1){
            System.out.println("No");
            return;
        }
        System.out.println(balnceSum);
    }
}
