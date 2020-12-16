package sortingArrays;

import java.util.Arrays;

public class bubbleSort {

    public static void main(String[] args) {

        int[] array = {54, 18, 43, 29, 75, 91, 32, 87, 66, 10};

        boolean flag = true;
        while (flag) {
            flag = false;
            for (int i = 1; i < array.length; i++) {
                if (array[i] < array[i - 1]) {
                    swap(array, i, i - 1);
                    flag = true;
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
