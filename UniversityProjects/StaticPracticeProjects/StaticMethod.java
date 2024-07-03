package staticmethod;

public class StaticMethod {
    
    public static void main(String[] args) {
        // Static Method: belong class itself.
        sayHi();

        // Non-Static Method: Instance of Class.
        StaticMethod object = new StaticMethod(); // creates a StaticMethod object from the StaticMethod class.
        object.sayPancakes();
    }
    static void sayHello() {
        System.out.println("Hello!");
    }
    void sayPancakes() {
        System.out.println("Pancakes!")
    }

}