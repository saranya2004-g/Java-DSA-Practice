package Arrays;
import java.util.*;


public class RotationArray {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5};
        int k = 2;
        int n = arr.length;


        reverse(arr, 0, n - 1);
        reverse(arr, 0, 1);
        reverse(arr, k, n - 1);
        System.out.print("After rotation " + k + ": ");
        for (int num : arr) {
            System.out.print(num + " ");
        }
    }

    static void reverse(int[] arr, int start, int end) {
        while (start < end) {
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }
    }
}