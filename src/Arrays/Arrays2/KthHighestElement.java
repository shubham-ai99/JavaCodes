package Arrays.Arrays2;

import java.util.Arrays;
import java.util.Collections;

public class KthHighestElement {
    public static void main(String[] args) {
         Integer[] arr = {1, 5, 3, 9, 7, 2, 8, 3, 6};
        int k = 2;// Change this value to find different Kth highest elements

        System.out.println("The " + k + "th highest element is " + findKthHighestElement(arr, k));
    }

    public static int findKthHighestElement(Integer[] arr, int k) {
        // Sort the array in descending order
        Arrays.sort(arr, Collections.reverseOrder());

        // Return the Kth highest element
        return arr[k - 1];
    }
}
