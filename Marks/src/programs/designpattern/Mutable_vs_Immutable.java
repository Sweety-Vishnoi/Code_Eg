package programs.designpattern;

public class Mutable_vs_Immutable {
    public static void main(String[] args) {
        //Mutable
        StringBuilder sb = new StringBuilder("Hello");
        sb.append(" World"); // modifies original object
        System.out.println(sb); // Output: Hello World

        //Immutable
        String s = "Hello";
        s.concat(" World"); // returns a new String
        System.out.println(s); // Output: Hello (original remains unchanged)
    }
}
