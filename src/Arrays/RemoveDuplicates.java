package Arrays;
import java.util.*;
public class RemoveDuplicates {
	    public static void main(String[] args) {
	        int[] arr = {1,1,1,4,4,3,10,7,1};
	        int n = arr.length;

	        System.out.print( arr[0] + " "); 

	        for (int i = 1; i < n; i++) {
	            if (arr[i] != arr[i - 1]) {
	                System.out.print(arr[i] + " ");
	            }
	        }
	    }
}
