package BasicCode;
class Animal{
    public void animalSound(){System.out.println("Animal: Noise");}
}

class Dog extends Animal{
    public void dogSound(){System.out.println("Dog: Woof");}
}
class Bigfoot extends Animal{
    public void bigfootSound(){System.out.println("Bigfoot: Whistle");}
}
public class JavaObjectPrograming {
    public static void main(String[] args) {
        Animal myAnimal = new Animal();
        Dog myDog = new Dog();
        Bigfoot myBig = new Bigfoot();
        myAnimal.animalSound();
        myDog.animalSound();
        myDog.dogSound();
        myBig.animalSound();
        myBig.bigfootSound();
    }
}
