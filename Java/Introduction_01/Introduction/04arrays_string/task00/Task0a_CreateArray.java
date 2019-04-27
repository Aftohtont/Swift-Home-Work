package homework.arrays_strings_04.task00;

public class Task0a_CreateArray {

    public static void main(String[] args) {

        // manual initialize array
        int [] array={5,9,11,6,4,7};
    // orint array whit loop iteration
        for (int i = 0; i <array.length ; i++) {
            // take value from cell whit index
            System.out.println("take from cell"+"["+(i)+"]"+"="+array[i]);
        }

    }
}
