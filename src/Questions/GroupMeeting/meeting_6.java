package Questions.GroupMeeting;

import jdk.jfr.Frequency;

import javax.xml.stream.events.Characters;
import java.util.*;

public class meeting_6 {
    public static void main(String[] args) {

//  1) java.util.Map - Sort the map by values
//    Write a method that can sort the Map by values
        Map<Integer, String> map = new HashMap<>();
        map.put(1, "Chicago");
        map.put(2, "Ohio");
        map.put(3, "Iowa");
        map.put(4, "Houston");
        System.out.println(map);

        ArrayList<String> arr = new ArrayList<>(map.values());
        Collections.sort(arr);
        System.out.println(arr);
        //[Chicago, Houston, Iowa, Ohio]

        LinkedHashMap<Integer, String> afterSorted = new LinkedHashMap<>();
        for (String eachName : arr) {
            for(int keys : map.keySet()) {
                if (eachName.equals(map.get(keys))) {
                    afterSorted.put(keys, eachName);
                }
            }
        }
        System.out.println(afterSorted);
        System.out.println("==================");

//2) Map - Frequency of Characters
//    Write a method that prints the frequency of each character from a String
        Map<Integer, String> map1 = new HashMap<>();
        map1.put(1, "applleee");
        map1.put(2, "Oorangee");
        map1.put(3, "GrasS");
        map1.put(4, "Houston");
        System.out.println(map1);

        for (String each : map1.values()) {
            each = each.toLowerCase();
            String res ="";
            String checked = "";

            for (int i = 0; i < each.length(); i++) {
                int count = 0;

                if (checked.contains("" + each.charAt(i))) {
                    continue;
                }

                for (int j = 0; j < each.length(); j++) {
                    if (each.charAt(i) == each.charAt(j)) {
                        count++;
                    }
                    checked += "" + each.charAt(i);

                }
                res += " " + each.charAt(i) + " - " + count + "\n";

            }

            System.out.println(res);
        }
        System.out.println("===============");
//3) Map - Unique character from String

        Map<Integer, String> map2 = new HashMap<>();
        map2.put(1, "apple");
        map2.put(2, "Mom");
        map2.put(3, "Sister");
        map2.put(4, "General");
        System.out.println(map2);

        for (String each : map2.values()){
            each = each.toLowerCase();
            String res = "";
            String checked ="";

            for (int i = 0; i < each.length(); i++) {
                int count = 0;

                if (checked.contains("" + each.charAt(i))) {
                    continue;
                }

                for (int j = 0; j < each.length(); j++) {
                    if (each.charAt(i) == each.charAt(j)) {
                        count++;
                        if (count == 1) {
                            res += "" + each.charAt(i);
                        }
                    }
                    checked += each.charAt(i);
                }
            }

            System.out.println(res);
        }

//4) Map - Min value
//    Write a method that can return the minimum value from ta map (DO NOT use sort method)

        Map<String, Integer> map3 = new HashMap<>();
        map3.put("I", 50);
        map3.put("II", 35);
        map3.put("III", 68);
        map3.put("IV", 12);
        System.out.println(map3);

        int min = Integer.MAX_VALUE;

        for (int each : map3.values()) {
            if (each < min) {
                min = each;
            }

        }

        System.out.println("min number: " + min);
    }
}
