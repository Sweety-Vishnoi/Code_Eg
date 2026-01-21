package programs.oops;

class Employee2
{
    private int id;
    private String name;
    public Employee2()
    {
        id=45;
        name= "Tweety";
    }
   /* public void setId(int i) NO NEED of SET as CONSTRUCTOR Called
    {
        this.id=i;
    }*/
    public int getId()
    {
        return id;
    }
  /*  public void setName(String n)
    {
        this.name=n;
    }*/
    public String getName()
    {
        return name;
    }
}
class Employee3{
    private int id3;
    private String name3;
    public Employee3(int i,String myname3)
    {
        id3=i;
        name3=myname3;
    }

    public int getId3() {
        return id3;
    }

    public String getName3() {
        return name3;
    }
}
public class OOPS_Constructor {
    public static void main(String[] args) {

    Employee2 e2=new Employee2();
    //constructor invoked
        System.out.println(e2.getName());
        System.out.println(e2.getId());

        Employee3 e3=new Employee3(12,"Sweety"); //pass value
        System.out.println( "Parametrize constructor eg: "+e3.getId3());
        System.out.println(e3.getName3());
    }
}
