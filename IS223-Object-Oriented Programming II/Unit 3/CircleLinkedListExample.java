public class CircleLinkedListExample {  
    //node of list.
    //Nested node class inside the linked list
    public class Node{  
        String data;  
        Node next;  
        public Node(String data) {  
            this.data = data;  
        }  
    }  
    //head and tail pointer as null for place holders  
    public Node head = null;  
    public Node tail = null;  
  
    //Node addition method 
    public void add(String info){  
        Node newNode = new Node(info);  
        //If the list is empty then have the head and tail point to the new
        //node which is the only node now
        if(head == null) {  
            head = newNode;  
            tail = newNode;  
            newNode.next = head;  
        }  
        else {  
            //tail will point to new node.  
            tail.next = newNode;  
            //New node will become new tail.  
            tail = newNode;  
            //Set the new node (new tail) to point to the head 
            tail.next = head;  
        }  
    }  
  
    //Print all elements in the list
    public void printList() {  
        Node c = head;
        System.out.print(" "+ c.data);  
        c = c.next; 
        while(c != head){
            System.out.print(", "+ c.data);  
            c = c.next;
        }
    }  
  
    //Main mehtod that will run the code
    public static void main(String[] args) {  
        CircleLinkedListExample circleList = new CircleLinkedListExample();  
        //Adds data to the list  
        circleList.add("Gus");  
        circleList.add("Jeffery");  
        circleList.add("Sayuri");  
        circleList.add("Disney");  
        //Displays all the nodes present in the list  
        circleList.printList();  
    }  
}  