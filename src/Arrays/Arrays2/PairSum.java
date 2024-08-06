package Arrays.Arrays2;

import java.util.HashMap;
import java.util.Map;

public class PairSum {
    public static void main(String[] args) {
        int[] array = {1, 2, 3, 4, 5, 6};
        int target = 7;
        Map<Integer, Integer> map = new HashMap<>();
        for (int num : array) {
            int complement = target - num;
            if (map.containsKey(complement)) {
                System.out.println("Pair: (" + num + ", " + complement + ")");
            }
            map.put(num, complement);
        }
    }
}
