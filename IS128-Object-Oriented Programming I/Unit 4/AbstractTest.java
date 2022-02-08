abstract class Animal 
{
    abstract void noise();
}

class Dog extends Animal
{
    void noise(){System.out.println("Woof");}
}
class Cat extends Animal
{
    void noise(){System.out.println("Meow");}
}

public class AbstractTest {
    public static void main(String args[])
    {
        Dog dog = new Dog();
        Cat cat = new Cat();
        dog.noise();
        cat.noise();
    }
    
}
