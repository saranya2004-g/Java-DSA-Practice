package Arrays;

import java.util.*;

public class MinMax {
    public static void main(String[] args) {
        int[] arr = {3, 5, 1, 8, 2};

        int min = arr[0], max = arr[0];

        for (int i = 1; i < arr.length; i++) {
            if (arr[i] < min) min = arr[i];
            if (arr[i] > max) max = arr[i];
        }

        System.out.println("Min: " + min);
        System.out.println("Max: " + max);
    }
}