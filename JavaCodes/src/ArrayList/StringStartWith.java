package ArrayList;

import java.util.ArrayList;

public class StringStartWith {

    public static void main(String[] args) {
        ArrayList<String> name = new ArrayList<>();

        name.add("Shubham");
        name.add("Jack");
        name.add("Kath");
        name.add("Jaya");

        ArrayList<String> result = new ArrayList<>();
        for (String str : name
        ) {
            if (str.startsWith("S")) {
                result.add(str);
            }
        }
        System.out.println(result);
    }
}
