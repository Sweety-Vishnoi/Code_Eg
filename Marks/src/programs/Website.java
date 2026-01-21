package programs;

import java.util.Scanner;

public class Website {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter Website name  ");
        String web_name=sc.next();
        if(web_name.endsWith(".org"))
        {
            System.out.println("This is organisational website");
        }
        else if (web_name.endsWith(".com")) {
            System.out.println("This is commercial website");
        }
        else if(web_name.endsWith(".in")) {
            System.out.println("This is Indian website");
        }
        else System.out.println("Invalid Input");
    }
}
