package programs.collections;

public class equals_Eg {
    public static void main(String[] args) {
        String a = "hello";
        String b = "hello";
        System.out.println(a == b); // true (because of string pool)

        String c = new String("hello");
        System.out.println(a == c); // false (different memory locations)


        String a1 = "hello";
        String c1 = new String("hello");
        System.out.println(a.equals(c1)); // true (same content)
    }
}
