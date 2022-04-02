class AlertA2 {
    void Alert(){System.out.println("Alert A");} 
} 
class A 
{ 
} 
class AlertB2 extends AlertA2 {
    void Alert() { System.out.println("Alert B"); } 
} 
class AlertC2 extends AlertA2 {
    void Alert(){System.out.println("Alert C");} 
} 
public class RunTimePoly2 { 
    public static void main(String[] args){ 
        A a = new A();
        a = null; 
    }  
} 
