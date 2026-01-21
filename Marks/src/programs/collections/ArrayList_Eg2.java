package programs.collections;

import java.util.ArrayList;

public class ArrayList_Eg2 {
    public static void main(String[] args) {
        int[] a=new int[3]; //todo static array, fixed size

        //todo Dynamic array, size varries, maintain insertion order
        //not Synchronized, random access to fetch any element, as array index.

        ArrayList<Integer> ar=new ArrayList<>();

        ar.add(20);
        ar.add(78);
        System.out.println(ar.size());

        ar.add(738);
        ar.add(783);
        ar.add(784);

        System.out.println(ar.size());



    }
}
