package programs.Strings;

public class Letter_Count {
    public static void main(String[] args) {
        String s ="aabbbcddbb";
        StringBuilder sb=new StringBuilder();
        int count=1;
        for(int i=1;i<s.length();i++)
        {
            if(s.charAt(i)==s.charAt(i-1))
            {
                count++;
            }
            else{
                sb.append(s.charAt(i-1)).append(count);
                count=1;
            }
        }
        // Append last character and count
        sb.append(s.charAt(s.length() - 1)).append(count);

        System.out.println("Output: " + sb.toString() );

    }
}



/*
 * A Few Notes
 * - This algorithm assumes characters are grouped consecutively.
 * - It uses a StringBuilder for efficient string concatenation.
 * - You can adapt it to handle edge cases (like empty strings or non-letter characters) if needed.
 */

