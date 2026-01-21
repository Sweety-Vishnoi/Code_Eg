package programs.oops;

 class Circle1{
    int radius;
    Circle1(){
        System.out.println("non parameterised default constructor");
    }
    Circle1(int r)
    {
        System.out.println("Circle radius being used");
        this.radius=r;
    }
    public void area(){
        System.out.println(Math.PI*radius*radius);
    }
}
  class Cylinder extends Circle1{
    int height;
    Cylinder( int r,int h){
        super(r); //takes from parent class and executes non by default constructor
        this.height=h;
    }
      public void Volume(){

          System.out.println("Volume of Cylinder is: "+Math.PI*radius*radius*height+" and radius used is "+ radius);
      }
}

public class inheritance_Circle {
    public static void main(String[] args) {

        Circle1 c1=new Circle1(20);
        c1.area();
        Cylinder c=new Cylinder(10,11);
        c.Volume();
    }

}
