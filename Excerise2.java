package ArrayQuestion;

import java.util.Arrays;

public class Excerise2 {
    public static void main(String[] args) {
        int [][] myArray = new int[3][3];
        System.out.println(Arrays.deepToString(myArray));



        populateArray(myArray);
        int [] [] sumValue = sumArray(myArray);
        System.out.println(Arrays.deepToString(sumValue));
        int maximumNumber = maximumNumber(myArray);
        int minimumNumber = minimumNumber(myArray);
        totalForEachCourse(myArray);
        System.out.println("the minimum number " + minimumNumber);
        System.out.println("this is the maximum " + maximumNumber);

    }

    private static void populateArray(int[][] myArray) {
        for(int i = 0; i < myArray.length; i++){
            for(int j = 0; j < myArray[i].length; j++){
                myArray[i][j] = 1 +(int)(Math.random()*10);
            }
        }
    }

    public static int[][] sumArray(int [][] arrays){
        for(int i = 0 ; i < arrays.length; i++){
            for(int j = 0; j < arrays[i].length; j++){
                arrays[i][j] += arrays[i][j];
            }
        }
        return arrays;
    }
    public static void totalForEachCourse(int [][] arrays){

        for(int i = 0 ; i < arrays.length; i++){
            int total = 0;
            for(int j = 0; j < arrays[i].length; j++){
                total += arrays[i][j];
            }
            System.out.println("the total grade for " + " student" + i + " " + total);
        }


    }
    public static int maximumNumber(int [][] arrays){
        int maximum = 0;
        for(int i = 0; i < arrays.length; i++){
            for(int j = 0; j < arrays[i].length; j++){
                if(arrays[i][j] > maximum)
                    maximum = arrays[i][j];
            }
        }
        return maximum;
    }
    public static int minimumNumber(int [][] arrays){
        int minimum = arrays[0][0];
        for(int i = 0; i < arrays.length; i++){
            for(int j = 0; j < arrays[i].length; j++){
                if(arrays[i][j] < minimum)
                    minimum = arrays[i][j];
            }
        }
        return minimum;
    }

}
