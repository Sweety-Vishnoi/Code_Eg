package programs;

import java.util.Scanner;

public class even_while {
    public static void main(String[] args) {
        //sum first n even nos
        int sum=0;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter no for sum");
        int n=sc.nextInt();
        for(int i=0;i<=n;i++)
        {
            if(i%2==0)
                sum=sum+i;
        }
        System.out.println("Sum of even nos till "+n+ " is " +sum);

        //factorial
        System.out.println("Enter no for factorial");
        int num= sc.nextInt();
        int fact=1;
        for(int k=num;k>=1;k--) {
            fact=fact*k;
        }
        System.out.println("Factorial for "+num+ " is " +fact);

    }

    }

