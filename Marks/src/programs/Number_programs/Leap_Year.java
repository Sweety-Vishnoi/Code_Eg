package programs.Number_programs;

import java.util.Scanner;

public class Leap_Year {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter year:");
        int year= sc.nextInt();
        if ((year % 400 == 0) || ((year % 4 == 0) && (year % 100 != 0))) {
            System.out.println(year + " : Leap Year");
        }

        else {
            System.out.println(year + " : Non - Leap Year");
        }
    }
}
