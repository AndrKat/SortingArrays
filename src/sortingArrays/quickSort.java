package sortingArrays;

import java.util.Arrays;

public class quickSort {

    public static void main(String[] args) {
        int[] array = {54, 18, 43, 29, 75, 91, 32, 87, 66, 10};

        int low = 0;
        int high = array.length - 1;

        quick(array, low, high);
        System.out.println(Arrays.toString(array));
    }

    public static void quick(int[] array, int low, int high) {
        if (array.length == 0)
            return;
        if (low >= high)
            return;

        int middle = low + (high - low) / 2;
        int opora = array[middle];

        int i = low, j = high;
        while (i <= j) {
            while (array[i] < opora) {
                i++;
            }

            while (array[j] > opora) {
                j--;
            }

            if (i <= j) {
                int temp = array[i];
                array[i] = array[j];
                array[j] = temp;
                i++;
                j--;
            }
        }

        if (low < j)
            quick(array, low, j);

        if (high > i)
            quick(array, i, high);
    }
}

