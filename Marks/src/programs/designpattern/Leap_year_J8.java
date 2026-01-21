package programs.designpattern;
import java.time.Year;
import java.util.Scanner;
/*class Leap{
    public void getYear(int year) {
       if ((year % 400 == 0) || (year % 4 == 0 && year % 100 != 0)){
            System.out.println(year + " is Leap year.");
        }
        else
            System.out.println(year + " is not Leap year.");
    }
}public class Leap_year_J8
{
    public static void main(String[] args) {
        /*System.out.println("Enter Year::::");
        Scanner sc=new Scanner(System.in);
        int y1=sc.nextInt();
        Leap l=new Leap();
        l.getYear(y1);
        sc.close(); */
public class Leap_year_J8
{
    public static void main(String[] args) {
        try {
            Scanner scanner = new Scanner(System.in);
            System.out.print("Enter a year: ");
            int year_to_check = scanner.nextInt();

            boolean isLeap = Year.of(year_to_check).isLeap();
                /* todo How it Works
✅ Uses Year.of(year).isLeap() to check if the year is a leap year.
Year is immutable date-time object of java 8 feature
✅ Eliminates manual calculations by leveraging Java 8's date and time API.
✅ Reads user input and determines whether the given year is a leap year. */


            if (isLeap) {
                System.out.println(year_to_check + " is a Leap Year.");
            } else {
                System.out.println(year_to_check + " is not a Leap Year.");
            }

            scanner.close();
        }
        catch (Exception e)
        {
            System.out.println("Incorrect input, please check " +e);
        }
        }

        }


