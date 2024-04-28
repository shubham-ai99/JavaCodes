import java.util.Arrays;
public class ArrayUtils {

    public static void main(String[] args) {
        int[] arr = {2, 4,3, 3, 1, 7, 3};

        Arrays.sort(arr);

        for (int i = 0; i < arr.length + 1; i++) {
            System.out.print(" " + arr[i]);
        }
    }
}

/*
    Exception in thread "main" java.lang.ArrayIndexOutOfBoundsException: Index 5 out of bounds for length 5
	at ArrayUtils.main
 */