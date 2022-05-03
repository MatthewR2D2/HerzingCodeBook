import java.util.*;
 
public class QueueExample{
    public static void main(String args[])
    {
        // Declar a queue and priority queue for use 
        PriorityQueue<String> priorityQueue = new PriorityQueue<String>();
        priorityQueue.add("Gus");  
        priorityQueue.add("Jeffery");  
        priorityQueue.add("Jennifer");  
        priorityQueue.add("Test");  

        //Get the first in the line 
        System.out.println("First in the Queue (head):"+priorityQueue.peek());  
        
        System.out.println("Current Queue now:");  
        Iterator itr=priorityQueue.iterator();  
        while(itr.hasNext()){  
            System.out.println(itr.next());  
        }  
        
        //Remove the head or first in the queue 
        priorityQueue.remove();  

        
        System.out.println("Current Queue now:");  
        Iterator<String> itr2=priorityQueue.iterator();  
        while(itr2.hasNext()){  
            System.out.println(itr2.next()); 
            
        } 
    }
}