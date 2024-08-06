package String;
import java.util.*;
public class OccurrenceCount {

    public HashMap findOccurence(String str) {
        char[] strArr = str.toCharArray();
        HashMap map = new HashMap();
        for (int i = 0; i < strArr.length; i++) {
            int count = 1;
            if (map.containsKey(strArr[i])) {
                int value = (int) map.get(strArr[i]) + 1;
                map.put(strArr[i], value);
            } else {
                map.put(strArr[i], count);
            }
        }
        return map;
    }

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        OccurrenceCount n1 = new OccurrenceCount();
        String str = "abccbaade";
        System.out.println(n1.findOccurence(str));

    }
}
