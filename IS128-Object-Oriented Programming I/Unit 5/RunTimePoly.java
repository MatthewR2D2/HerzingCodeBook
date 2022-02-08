class AlertA {  
    void Alert(){System.out.println("Alert A");}  
}  
class AlertB extends AlertA {  
    void Alert() { System.out.println("Alert B"); }  
}  
class AlertC extends AlertA {  
    void Alert(){System.out.println("Alert Cclear");}  
}  
public class RunTimePoly {  
    public static void main(String[] args){  
        AlertA a = new AlertA();  
        a.Alert();  
        a = new AlertB();  
        a.Alert();  
        a = new AlertC();  
        a.Alert();  
    }   
}  

 
