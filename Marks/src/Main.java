import  java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        double m1,m2,m3,m4,m5;
        System.out.println("Enter marks of Subject 1: ");
        m1=sc.nextFloat();

        System.out.println("Enter marks of Subject 2: ");
        m2=sc.nextFloat();
        System.out.println("Enter marks of Subject 3: ");
        m3=sc.nextFloat();
        System.out.println("Enter marks of Subject 4: ");
        m4=sc.nextFloat();
        System.out.println("Enter marks of Subject 5: ");
        m5=sc.nextFloat();

        System.out.println("Enter total marks(100 or 80) : ");
        int total_marks=sc.nextInt();//500
        double total= (m1+m2+m3+m4+m5)/(total_marks*5)*100;
        System.out.println("Percentage is: " +total) ;

    }
}