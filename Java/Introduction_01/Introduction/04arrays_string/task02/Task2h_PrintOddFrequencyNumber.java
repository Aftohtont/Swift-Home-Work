package homework.arrays_strings_04.task02;

public class Task2h_PrintOddFrequencyNumber
{


    public static void main(String[] args) {
        int[] theArr = {4 ,6 ,4 ,-3 ,5, 2, 5, 4, 5, 6, -3 ,2, 5, 4, 6};


                int[] findOddNums=new int[theArr.length];
                int takenLength=0;

        for (int i = 0; i < theArr.length ; i++) {
            int countOccurs = 0;
            int selectNum = theArr[i];

            for (int j = 0; j < theArr.length; j++) {
                int searchNum = theArr[j];

                if (selectNum == searchNum) {
                    countOccurs++;
                }

            }
            if (countOccurs % 2 != 0) {
                boolean isExist=false;
                for (int j = 0; j < findOddNums.length; j++) {
                    if (selectNum == findOddNums[j]) {
                        isExist=true;
                        break;
                    }
                }
                if (!isExist){
                    findOddNums[takenLength++]=selectNum;
                }
            }
        }

        for (int i = 0; i < takenLength; i++) {
            System.out.print(findOddNums[i]+" ");
        }


    }

}
