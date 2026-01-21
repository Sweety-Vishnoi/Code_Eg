package programs.collections;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class ArrayListExample1 {
    public static void main(String[] args) {

        List<String> stringList=new ArrayList<>();

        String str1="XXL";
        String str2="XL";
        String str3="M";
        String str4="S";

        stringList.add(str1);
        stringList.add(str2);
        stringList.add(str3);
        stringList.add(str4);
        System.out.println(stringList);

        stringList.remove(2);
        System.out.println(stringList);

        stringList.add(2,"MM");
        System.out.println(stringList);

        stringList.addFirst("SS");
        System.out.println(stringList);

//todo LinkedList
        LinkedList<Integer> ll=new LinkedList<>();
        ll.add(1);
        ll.add(10);
        System.out.println(ll);

        Iterator<Integer> iterator = ll.iterator();
        while(iterator.hasNext())
        {
            Integer next = iterator.next();
            if(next == 10)
                System.out.println(next);
        }


    }
}
