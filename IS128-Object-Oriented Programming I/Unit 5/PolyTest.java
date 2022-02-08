class ExamplePoly{
    public static int Addition(int a, int b){return a + b;}
    public static float Addition(float a, float b){return a + b;}
    public static double Addition (double a, double b){return a + b;}
}

public class PolyTest {
    public static void main(String args[])
    {
        ExamplePoly ep = new ExamplePoly();
        int one = ep.Addition(2, 2);
        float two = ep.Addition(3, 5);
        double three = ep.Addition(2.2, 3.3);

        System.out.println("Addition of Ints =" + one);
        System.out.println("Addition of floats =" + two);
        System.out.println("Addition of Doubles =" + three);

    }    
    
}
