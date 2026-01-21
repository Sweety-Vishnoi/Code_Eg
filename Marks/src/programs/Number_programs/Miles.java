package programs.Number_programs;

import java.util.Scanner;

public class Miles {
    public static void main(String[] args) {
        double miles = 0.62137119 ;
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter Km: ");
        float km=sc.nextFloat();
        double total_miles= km*miles;
        System.out.println(km+ " Km in miles is: " +total_miles);
    }
}
