package programs;

public class pattern {
    public static void main(String[] args) {
        for(int i=5;i>0;i--)
        {
            for(int j=0;j<i;j++) {
                System.out.print("*");
            }
            System.out.print("\n");
        }
//both give same output
        for(int i=0;i<5;i++)
        {
            for(int j=5;j>i;j--) {
                System.out.print("*");
            }
            System.out.print("\n");
        }

    }
}
