package day62_maps;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class DBExample {
    public static void main(String[] args) {
        /*
        person

        FIRST_NAME james
        LAST_NAME Bond
        AGE 40
         */

        Map<String, String > person1 = new HashMap<>();
        person1.put("FIRST_NAME", "James");
        person1.put("LAST_NAME", "Bond");
        person1.put("AGE", "40");

        ArrayList<Map<String, String>> allPeople = new ArrayList<>();
        allPeople.add(person1);

        // i want to know the first name
        System.out.println(allPeople.get(0).get("FIRST_NAME"));
        /*
        allPeople -> ArrayList
        allPeople.get(0) -> First Map Object
        allPeople.get(0).get("FIRST_NAME")) -> value of first name
         */

    }
}
