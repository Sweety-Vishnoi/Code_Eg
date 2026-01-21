package programs.oops;

//todo Java does not support multiple inheritance with classes Java allows multiple inheritance using interfaces.
interface Interface1 {
    default void show() {
        System.out.println("Interface1 method");
    }
}

interface Interface2 {
   default   void show() {
        System.out.println("Interface2 method");
    }
}

// Implementing both interfaces
class Multiple_inheritance_interface implements Interface1, Interface2 {
    @Override
    public void show() {
        //todo So ambiguity can be resolved using super.
        Interface1.super.show(); // Resolving ambiguity
        Interface2.super.show();
    }

    public static void main(String[] args) {
        Multiple_inheritance_interface obj = new Multiple_inheritance_interface();
        obj.show(); // Calls Interface1's show() method
        obj.show();
    }
}

