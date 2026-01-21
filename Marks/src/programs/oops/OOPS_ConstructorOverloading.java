package programs.oops;
class  Calci
{
    private int x,y;
    public Calci()
    {
        x=4;
        y=5;
    }
    public int get_sum()
    {
        return x+y;
    }
    //another constructor
    public Calci(int x1, int y1)
    {
        x=x1;
        y=y1;
    }
    public int get_mult()
    {
        return x*y;
    }
    public Calci(int x1)
    {
        y=10;
        x=x1;
    }
    public int get_mult1()
    {
        return x*y;
    }


}

public class OOPS_ConstructorOverloading {
    public static void main(String[] args) {
        Calci c1=new Calci();
        Calci c2=new Calci(5,6);
        Calci c3=new Calci(6);

        System.out.println(c1.get_sum());
        System.out.println(c2.get_mult());

        System.out.println(c3.get_mult1());
    }
}
