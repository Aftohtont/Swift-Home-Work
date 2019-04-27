package homework.arrays_strings_04.task02;

public class Task2i_FindKInSorted {
    public static void main(String[] args) {


        int[] theArr = {1,2,3,4,5,6,7,8,9};

        int x = 11;

        int start = 0;
        int middle = theArr.length / 2;
        int end = 0;
        if (x == theArr[middle]) {
            System.out.println(x);
            return;
        }
        else if (x < theArr[middle]) {//in left part of array search from left to middle
            end = middle;
            for (int i = 0; i < end; i++) {
                if (x == theArr[i]) {
                    System.out.println(x);
                    return;
                }
            }

        } else {// in right part of array search from middle to the end
            start = middle;
            for (int i = start; i < theArr.length; i++) {
                if (x == theArr[i]) {
                    System.out.println(x);
                    return;
                }
            }
        }
        System.out.println("No");


    }
}
