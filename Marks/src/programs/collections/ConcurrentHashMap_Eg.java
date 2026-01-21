package programs.collections;

import java.util.HashMap;
import java.util.Hashtable;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

public class ConcurrentHashMap_Eg {
    public static void main(String[] args) {
        ConcurrentHashMap<String, Integer> map = new ConcurrentHashMap<>();

        map.put("A", 1);
        map.putIfAbsent("B", 2);

        map.compute("A", (key, val) -> val + 10);

        System.out.println(map.get("A")); // Output: 11
        System.out.println(map.get("B"));

        // HashMap
        Map<String, String> map1 = new HashMap<>();
        map1.put("A", "Apple");
        map1.put(null, "NullKey"); // Allowed

        // Hashtable
        Map<String, String> map2 = new Hashtable<>();
        map2.put("B", "Banana");
        map2.put(null, "NullKey"); // Throws NullPointerException

    }
}
