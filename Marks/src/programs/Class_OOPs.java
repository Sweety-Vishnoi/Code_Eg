package programs;
//in java we can have only 1 public class
    class  Employee{
    int id;
    String Name;
    int Salary;
    public  void  printDetails()
    {
        System.out.println("My id is "+id);
        System.out.println("My name is "+Name);
        System.out.println(Name+" salary is "+Salary);
    }

}
public class Class_OOPs {
    public static void main(String[] args) {
        System.out.println("this is a simple class");
        Employee e=new Employee(); //Instantiate
        Employee e1=new Employee();
        //setting properties/ attributes
        e.id=12;
        e.Name="I am Sweety";
        e.Salary=500000;

        e1.id=15;
        e1.Name="I am Harry";
        e1.Salary=800000;

        e.printDetails();
        e1.printDetails();
        //System.out.println(e.id);
        //System.out.println(e.Name);
    }
}
