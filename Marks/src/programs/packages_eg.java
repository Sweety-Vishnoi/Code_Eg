package programs;

import myownPackage.MyService; // self created package

import java.util.Scanner;

public class packages_eg {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("this is scanner");

        MyService service = new MyService();
        service.greet();

    }
}
