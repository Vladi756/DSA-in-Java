public class Doubly_Linked_List {    
    class Node {  
        int data;  
        Node previous;  
        Node next;  						// Every node in a doubly linked list has a pointer to the node before it, and to the one after it.			
        
        public Node(int data) {  
            this.data = data;  
        }  
    }  										
  
    Node head, tail = null;  				// Same as singly linked list, head and tail are null.
  
    public void addNode(int data) {  		// Function adds a node to the list.
        Node newNode = new Node(data);  	// First, the new node is created.
  
        if(head == null) {					// If list is empty.  
            head = tail = newNode;			// Both head and tail will point to newNode.    
            head.previous = null;           // Head's previous will point to null.  
            tail.next = null;  				// Tail's next will point to null - casue new node is the last node in the list.
        }  
        else {  
            tail.next = newNode;  			// newNode will be added after tail such that tail's next will point to newNode.  
            newNode.previous = tail;  		// newNode's previous will point to tail, which is in fact the new node.  
            tail = newNode;  				// newNode becomes the new tail.  
            tail.next = null;  				// As it is last node, tail's next will point to null.
        }  
    }  
  
    public void display() {  				// Method to output the doubly linked list. 
        Node current = head; 				// Node current points to head.  
        if(head == null) {  
            System.out.println("List is empty");  
            return;  
        }  
        System.out.println("Nodes of doubly linked list: ");  
        
        while(current != null) {   			// If it is NOT null, it is a node within the list.
            System.out.print(current.data + " ");  
            current = current.next;		    // Prints each node by incrementing the pointer.   
        }  
    }  
  
    public static void main(String[] args) {  
  
        Doubly_Linked_List dList = new Doubly_Linked_List();  
        dList.addNode(1);  
        dList.addNode(2);  
        dList.addNode(3);  
        dList.addNode(4);  
        dList.addNode(5);  					  // Adds nodes to the list.  

        dList.display();  					  // Displays the list. 
    }  
}  
