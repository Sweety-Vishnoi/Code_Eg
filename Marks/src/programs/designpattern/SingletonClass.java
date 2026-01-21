package programs.designpattern;

class Singleton{
    //TODO Lazy Singleton
  private static Singleton instance;

  // Private constructor to prevent instantiation
    private Singleton(){}

    // Public method to provide access to the instance
    public static Singleton getInstance() {
        if (instance == null) {
            instance = new Singleton();
        }
        return instance;

    }

}
public class SingletonClass {
    public static void main(String[] args) {
        Singleton s= Singleton.getInstance();
        Singleton s1= Singleton.getInstance();
        Singleton s2=Singleton.getInstance();
        System.out.println(s);
        System.out.println(s1);
        System.out.println(s2);

    }


}