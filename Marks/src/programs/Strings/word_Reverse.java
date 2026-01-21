package programs.Strings;

public class word_Reverse {
    public static void main(String[] args) {
        String str="  Hello world is here ";
        String[] words = str.split("\\s+"); //todo- - Splits the string into words using regular expression \\s+, which matches one or more whitespace characters.
                                                    // Result: ["Hello", "world", "is", "here"]
        StringBuilder reversed = new StringBuilder();

        for (String word : words) {
            reversed.append(new StringBuilder(word).reverse()).append(" ");
        }

        System.out.println("Reversed each word: " + reversed.toString());
        System.out.println("Reversed each word: " + reversed.toString().trim()); //trim removes extra blank spaces


    }
}
