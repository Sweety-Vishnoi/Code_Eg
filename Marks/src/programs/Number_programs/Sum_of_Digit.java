package programs.Number_programs;

import java.util.Scanner;

public class Sum_of_Digit {
    public static void main(String[] args) {
        int number;
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter number:- ");
        number=sc.nextInt();
        int sum = 0;

        System.out.print("Sum of "+number+ " digits is: ");
      while(number !=0)
      {
          int digit=number%10;
          sum +=digit;
          number /=10;
      }
        System.out.print(sum);
    }
}
