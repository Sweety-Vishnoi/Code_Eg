package programs.Strings;

import java.util.SortedMap;
import java.util.stream.IntStream;

public class StringLiteralClass {
    public static void main(String[] args) {
        //TODO  --String immutable (cant change)
        String str="Sweety";
        System.out.println(str);
        System.out.println(str.length());
        String str1=new String("Sweety");
        str1.concat("hello");
        System.out.println(str1);

        //TODO  --String mutable
        StringBuilder str2=new StringBuilder("GIYA");
        StringBuffer str3=new StringBuffer("SIYA");
        str2.append(" RIYA");
        System.out.println(str2);

        System.out.println(str3.append(" test"));

        //TODO print t from sweety
        System.out.println(str.charAt(str.length()-2));

        //TODO: reverse String
        String rev="";
        for(int i=str.length()-1;i>=0;i--)
        {
            rev=rev+str.charAt(i);
        }
        System.out.println(rev);
    }
}
