package ArrayQuestion;

import java.lang.reflect.Array;
import java.util.Arrays;

public class Excerise1 {
    public static void main(String[] args) {

        double [] array_size = new double [10];

        array_size[4] = 23.5;
        array_size[9] = 63.5;
        array_size[6] = 65.4;
        array_size[2] = 73.4;
        int value = sumAllElement(array_size);
        System.out.println(value);

    }
    public static int sumAllElement(double [] arr){
        int total = 0;
        for(int i = 0; i < arr.length; i++){
            total += (int)arr[i];
        }
        return total;
    }
}
