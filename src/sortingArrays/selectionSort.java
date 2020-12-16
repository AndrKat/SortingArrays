package sortingArrays;

import java.util.Arrays;

public class selectionSort {

    public static void main(String[] args) {

        int[] array = {54, 18, 43, 29, 75, 91, 32, 87, 66, 10};

        for (int i = 0; i < array.length; i++) {
            int minIndex = i;
            for (int j = i; j < array.length; j++) {
                if (array[j] < array[minIndex]) {
                    minIndex = j;
                }
            }
            System.out.println(Arrays.toString(array));
            swap(array, i, minIndex);

        }
    }

    static void swap(int[] array, int x, int y) {
        int tmp = array[x];
        array[x] = array[y];
        array[y] = tmp;
    }

}


