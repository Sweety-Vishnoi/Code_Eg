package programs.Number_programs;

import java.util.Scanner;

public class Reverse_Number {
    public static void main(String[] args) {
        int num;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number ");
        num = sc.nextInt();
        int rev=0;
        while(num != 0){
            int last_num=num%10;        // Get last digit
            rev=rev*10 + last_num;      // Append digit
            num =num/ 10;               // Remove last digit
        }
        System.out.println("Reversed Number: " + rev);

    }
}
