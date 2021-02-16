public class Singly_Linked_List {  
	Node head;  										// Creates start of list (head)  
 
 	static class Node {  
 		int data;  
        Node next;  
        Node(int d) { 
        	data = d;  
        	next = null;								// Node contains data and pointer to next node  
        }  
     }  
 	
    /*--- This function prints contents of the linked list starting from head ---*/  
 	
 	public void display() {  
         Node n = head;  
         while (n != null) { 							// Because only the head and tail contain null 
        	 System.out.print(n.data + " \n");  
             n = n.next;  
         }  
     }  
 	
 	/*---This function creates a simple linked list with 3 nodes ---*/
 	
 public static void main(String[] args) {  
	 Singly_Linked_List list = new Singly_Linked_List();  
	 /* Start with the empty list. */  
	 list.head = new Node(100);  
     Node second = new Node(200);  
     Node third = new Node(300);						// Assigning each node with data 
     
     list.head.next = second; 					
     second.next = third; 								// Linking nodes one to the other  
     list.display();  
     }  
}  
