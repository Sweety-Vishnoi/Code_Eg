package programs.Strings;

import java.util.Scanner;

public class string_reverse {
    public static void main(String[] args) {
        String str;
        String reversed = "";
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter String:  ");
        str =sc.next();

        for(int i=str.length()-1;i>=0;i--) //- str.length() returns 4 (total number of characters). //But the last valid index is 3 → which is str.length() - 1.

        {
            reversed=reversed + str.charAt(i); // or  reversed.append(str.charAt(i));
        }
        System.out.println("Reversed: " + reversed);// then System.out.println("Reversed: " + reversed.toString());

    }
}
