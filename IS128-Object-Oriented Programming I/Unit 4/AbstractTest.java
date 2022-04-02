abstract class AnimalABST
{
    abstract void noise();
}

class DogTest extends AnimalABST
{
    void noise(){System.out.println("Woof");}
}
class CatTest extends AnimalABST
{
    void noise(){System.out.println("Meow");}
}

public class AbstractTest {
    public static void main(String args[])
    {
        DogTest dog = new DogTest();
        CatTest cat = new CatTest();
        dog.noise();
        cat.noise();
    }
    
}
