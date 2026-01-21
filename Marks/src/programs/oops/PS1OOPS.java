package programs.oops;
class Employee1
{
    String Name;
    int Salary;
    public int get_salary()
    {
        return  Salary;
    }
    public String get_Name()
    {
        return Name;
    }
    public void set_Name(String n){
        Name=n;
        //or this.Name=n;
    }
}

class  Cellphone{
    public  void ringing(){
        System.out.println("Ringing..");
    }
    public  void vibrating(){
        System.out.println("Vibrating...");
    }
}
class  Square{
    int side;
    public void area()
    {
        System.out.println("Area of square is:" +side*side);
    }
    public void perimeter()
    {
        System.out.println("Perimeter of square is:" +4*side);
    }

}
class  Rectangle{
    int l, b;
    public int area_rect()
    {
        return l*b;
    }
    public int perimeter_rect()
    {
        return (2*(l+b));
    }
}

public class PS1OOPS {

    public static void main(String[] args) {
    Employee1 e1= new Employee1();
    e1.set_Name("Priya");
    e1.Salary=100000;

        System.out.println(e1.get_Name());
        System.out.println(e1.get_salary());
    Cellphone c1=new Cellphone();
    c1.ringing();
    c1.vibrating();

    Square s=new Square();
    s.side=40;
    s.area();
    s.perimeter();

    Rectangle r=new Rectangle();
    r.l=30;
    r.b=80;
        System.out.println("Area of rectangle is:" +r.area_rect());
        System.out.println("Perimeter of rectangle is:" +r.perimeter_rect());
    }
}
