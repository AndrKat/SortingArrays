package sortingArrays;

import java.util.Arrays;

public class insertionSort {

    public static void main(String[] args) {

        int[] array = {54, 18, 43, 29, 75, 91, 32, 87, 66, 10};

        for (int i = 0; i < array.length; i++) {
            int value = array[i];
            int j = i - 1;
            for (; j >= 0; j--) {
                if (value < array[j]) {
                    array[j + 1] = array[j];
                } else {
                    break;
                }
            }
            array[j + 1] = value;
            System.out.println(Arrays.toString(array));
        }
    }
}
