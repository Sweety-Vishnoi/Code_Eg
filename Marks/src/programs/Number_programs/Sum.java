package programs.Number_programs;
import java.util.Scanner;

public class Sum
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Simple sum prg");
        System.out.println("Enter no 1:");
        int num1 = sc.nextInt();
        System.out.println("Enter no 2:");
        int num2 = sc.nextInt();
        System.out.println("Enter no 3:");
        int num3 = sc.nextInt();
        int sum_total = num1 + num2 + num3;
        System.out.println("Sum of num1, num2, num3 is:" + sum_total);
    }

}
