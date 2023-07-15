package ArrayQuestion;

import java.util.Arrays;

public class Excercise3 {
    public static void main(String[] args) {
/*
(Pixel Quantization) Use a one-dimensional array to solve the following problem: You want
to eventually perform some basic compression on an image. Assume that you will only be operating
on a single row of the image, and that pixel colors are represented as simple numbers in the array. You
are required to quantize the values of the pixels in the row. In other words, any pixel values appearing
in a range will assume a value in that range as indicated below. This creates redundancy that can lead
to better compression. Overwrite the original values in the array.
a) For 0–20: 10
b) For 21–40: 30
c) For 41–60: 50
d) For 61–80: 70
e) For 81–100: 90
f) For 101–120: 110
g) For 121–140: 130
h) For 141–160: 150
i) For 161–180: 170, and for all other pixel values, assumed a quantized value of 190
Print the array with the new, quantized values.
 */
        int [] arr = {32, 67, 87, 23, 80,150, 120, 50, 12, 140, 19, 189, 200};

        pixelValue(arr);
        System.out.println(Arrays.toString(arr));
    }

    public static  void pixelValue(int [] arrays){

        for (int index = 0; index < arrays.length ; index++) {
            if(arrays[index] <= 20){
                arrays[index] = 10;
            }
            if(arrays[index] > 20 && arrays[index] <= 40){
                arrays[index] = 30;
            }
            if(arrays[index] > 40 && arrays[index] <= 60){
                arrays[index] = 50;
            }
            if(arrays[index] > 60 && arrays[index] <= 80){
                arrays[index] = 70;
            }
            if(arrays[index] > 80 && arrays[index] <= 100){
                arrays[index] = 90;
            }
            if(arrays[index] > 100 && arrays[index] <= 120){
                arrays[index] = 110;
            }
            if(arrays[index] > 120 && arrays[index] <= 140){
                arrays[index] = 130;
            }
            if(arrays[index] > 140 && arrays[index] <= 160){
                arrays[index] = 150;
            }
            if(arrays[index] > 160 && arrays[index] <= 180){
                arrays[index] = 170;
            }else if(arrays[index] > 180){
                arrays[index] = 190;
            }


        }
    }

}
