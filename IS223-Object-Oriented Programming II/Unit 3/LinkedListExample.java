import java.util.*;
 
// Main class
public class LinkedListExample{
    public static void main(String args[])
    {
        // Creating object a linked list
        LinkedList<Integer> myLinkedList = new LinkedList<Integer>();
 
        // Adding elements to the linked list
        myLinkedList.add(10);
        myLinkedList.add(4);
        myLinkedList.addLast(2582);
        myLinkedList.addFirst(104982);
        //Print the linked list
        System.out.println(myLinkedList);
 
        // You can use the built in management to remove and delete elements
        myLinkedList.remove(2);
        System.out.println(myLinkedList);
        myLinkedList.removeFirst();
        System.out.println(myLinkedList);
        myLinkedList.removeLast();
        System.out.println(myLinkedList);
    }
}