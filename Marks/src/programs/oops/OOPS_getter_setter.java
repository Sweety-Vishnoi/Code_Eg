package programs.oops;
class Circle
{
    //implements data hiding from get and set methods
    private double rad;
    public  void set_area(double r)
    {
        this.rad=r;
    }
    public double get_area()
    {
        return (3.14*rad*rad);
    }
}

public class OOPS_getter_setter {
    public static void main(String[] args) {
        Circle c=new Circle();
        c.set_area(10);
        System.out.println("Area is:" + c.get_area());
    }
}
