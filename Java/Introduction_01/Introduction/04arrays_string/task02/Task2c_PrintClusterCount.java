package homework.arrays_strings_04.task02;

import java.util.Scanner;

public class Task2c_PrintClusterCount {
    public static void main(String[] args) {

        int[] theArr = {1, 1, 2, 3, 3, 5, 6, 7, 9, 9, 9, 9, 10, 10};
        int lastClusterVal = theArr[0];
        int clusterCount = 0;
        int startCluster = 0;
        boolean isCluster=false;

        for (int i = 1; i < theArr.length; i++) {

            if (theArr[i - 1] == theArr[i]) {
                startCluster = i;
                isCluster=true;
            } else  if (theArr[startCluster]!=theArr[i]&&isCluster){{                    // new cluster maybe
                    clusterCount++;
                    isCluster=false;
                }
            }
        }
            if (isCluster){//check if cluster is not at edge of array
                clusterCount++;
            }
        System.out.println(clusterCount);

    }
}
