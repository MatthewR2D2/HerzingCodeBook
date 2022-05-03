import java.util.*;
 
public class StackExample{
    public static void main(String args[])
    {
        Stack<String> stk= new Stack<>();  
    
        // Adding or pushing elements into stack  
        stk.push("Gus");  
        stk.push("Jeffery");  
        stk.push("Java");  
        stk.push("Programming");
        stk.push("DoD");
        //prints elements of the stack  
        System.out.println("Current Stack: " + stk);  
        stk.pop();  
        System.out.println("Current Stack: " + stk);  
        stk.pop();  
        System.out.println("Current Stack: " + stk); 
        stk.pop();  
        System.out.println("Current Stack: " + stk); 
    }
}