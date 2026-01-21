package programs.oops;

class Animal {
    public void makeSound() {
        System.out.println("Animal makes a sound");
    }
}
class Dog extends Animal {
    @Override
    public void makeSound() {
        System.out.println("Dog barks");
    }
}
class Cat extends Animal
{
    @Override
    public void makeSound() {
        //super.makeSound();
        System.out.println("Cat meows");
    }
}
public class Override_eg {
    public static void main(String[] args) {
        Animal myAnimal = new Dog(); // Parent reference, child object
        myAnimal.makeSound(); // Calls overridden method in Dog class

        Animal a1=new Animal();
        a1.makeSound(); // Calls main Animal class

        Animal a2=new Cat();
        a2.makeSound(); // Calls overridden method in Cat class
    }
}
//-----------------------Overloading---------------------------------
class Adder{
    static int add(int a,int b){return a+b;}
    static int add(int a,int b,int c){return a+b+c;}
}
class TestOverloading1{
    public static void main(String[] args){
        System.out.println(Adder.add(11,11));
        System.out.println(Adder.add(11,11,11));
    }}