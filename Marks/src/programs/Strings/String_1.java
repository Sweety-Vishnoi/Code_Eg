package programs.Strings;

import java.util.Scanner;

public class String_1 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        //to Lowercase
        System.out.print("Enter your name:");
        String name= sc.nextLine();
        System.out.print("Name in lowercase is:");
        System.out.println(name.toLowerCase());

        //-----Replace function

        //replace space with underscore
        System.out.println("Enter any line:");
        String text= sc.nextLine();
        String text1= text.replace(' ','_');
        System.out.println("Replaced the line: "+text1);

        //Difference of single and double quotes
        //replace the string  with name
        String letter="Dear, <|Name|>, Welcome to Java";
        System.out.print("Enter your name:");
        String name1= sc.nextLine();
        letter=letter.replace("<|Name|>",name1); // main line
        System.out.println(letter);
    }
}
