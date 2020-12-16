package sortingArrays;

import java.util.Arrays;

public class shuttleSort {

    public static void main(String[] args) {

        int[] array = {54, 18, 43, 29, 75, 91, 32, 87, 66, 10};

        for (int i = 1; i < array.length; i++) {
            if (array[i] < array[i - 1]) {
                swap(array, i, i - 1);
                for (int j = i - 1; (j - 1) >= 0; j--) {
                    if (array[j] < array[j - 1]) {
                        swap(array, j, j - 1);
                    } else {
                        break;
                    }
                }
            }
            System.out.println(Arrays.toString(array));
        }
    }

    static void swap(int[] array, int x, int y) {
        int tmp = array[x];
        array[x] = array[y];
        array[y] = tmp;
    }

}
