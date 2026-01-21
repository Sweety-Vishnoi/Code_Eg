package programs.collections;

import java.util.HashMap;
import java.util.HashSet;

public class HashMapExample {
    @Override
    public int hashCode() {
        return super.hashCode();
    }

    @Override
    public boolean equals(Object obj) {
        return super.equals(obj);
    }

    public static void main(String[] args) {

        HashMap<String, String> hashMap=new HashMap<>();
        hashMap.put("ABES","RAMESH");
        hashMap.put("ABES","AMESH");
        hashMap.put("BES","MESH");
        hashMap.put("ABES","ESH");
        hashMap.put("ABES","SH");
        System.out.println(hashMap);

        //TODO: HashSet Example
        HashSet<String> hashSet=new HashSet<>();
        hashSet.add("Mango");
        hashSet.add("Mango");
        hashSet.add("BA");
        hashSet.add("BA");
        hashSet.add("GUAVA");
        hashSet.add("BEETROOT");
        System.out.println(hashSet);


        HashSet<Integer> hashSet1=new HashSet<>();
        hashSet1.add(5);
        hashSet1.add(6);
        hashSet1.add(5);
        hashSet1.add(7);hashSet1.add(7);
        System.out.println(hashSet1);

    }

}
