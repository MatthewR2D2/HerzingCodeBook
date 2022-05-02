class DoublyLinkedListExample {    
    //A node class for doubly linked list
    class Node{  
        String data;  
        Node previous;  
        Node next;  
   
        public Node(String data) {  
            this.data = data;  
        }  
    }  
    //head and tail pointer as null for place holders  
    public Node head = null;  
    public Node tail = null;
   
    //Method for adding a new node to the list
    public void addNode(String data) {  
        //Create a new node  
        Node newNode = new Node(data);  
   
        //Both the head and tail needs to point to the new node if list is empty  
        if(head == null) {  
            head = tail = newNode;  
            //head's previous will be null  
            head.previous = null;  
            //tail's next will be null  
            tail.next = null;  
        }  
        else {  
            //Add the node to the end of the tail  
            tail.next = newNode;  
            //Set new node previous node as the original tail 
            newNode.previous = tail;  
            //new node becomes new tail  
            tail = newNode;  
            //tail's next point to null  
            tail.next = null;  
        }  
    }  
   
//print all the nodes of doubly linked list  
    public void printList() {  
        Node c = head;
        System.out.print(" "+ c.data);  
        c = c.next; 
        //NOTE it is not head now it is null value
        while(c != null){
            System.out.print(", "+ c.data);  
            c = c.next;
        }
    }  
}
class Main{
    public static void main(String[] args) {  
        //create a DoublyLinkedList object
        DoublyLinkedListExample doubleList = new DoublyLinkedListExample();  
        //Add nodes to the list  
        doubleList.addNode("Gus");  
        doubleList.addNode("Test");  
        doubleList.addNode("Double List");  
        doubleList.addNode("Jeffery");  
   
        //print the nodes of DoublyLinkedList  
        doubleList.printList();  
    }  
}  