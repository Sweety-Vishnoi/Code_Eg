package programs;

public class Animal {
    
    public void Sound()
    {
        System.out.println("Sound is Different");

    }
}
 class Dog extends Animal
{
    @Override
    public void Sound()
    {
        System.out.println("Dog barks");

    }
}
 class Cat extends Animal{
    @Override
    public void Sound()
    {
        System.out.println("Cat meows");
    }
}
class Main_Animal{
    public static void main(String[] args) {
        Animal a1=new Dog();
        a1.Sound();
        Animal a2=new Cat();
        a2.Sound();
    }
}


