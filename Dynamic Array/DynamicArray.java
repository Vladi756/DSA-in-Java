public class DynamicArray  {
	
	private int array[];   					  // Array itself
	private int count;   					  // Number of elements
	private int sizeofarray;   				  // Size of the array
									 
	public DynamicArray()   {   			  // Constructor to initialize Dynamic arrays 
			array = new int[1];   
			count = 0;   
			sizeofarray = 1;   				  // Set Initial values
	}   
		
	public void growSize() {				  // Method which creates an array of double size      
		int temp[] = null;					  // Creates a temprorary array   
		if (count == sizeofarray) { 		  // Check to see if number of elements is the same as the size of the array (if more memory is needed)    
			temp = new int[sizeofarray * 2];  // Initialize a double size array of the current array     
		for (int i = 0; i < sizeofarray; i++)    
				temp[i] = array[i]; 	  	  // Copies all the elements of the old array because for loop iterates through everything      
		}   
		array = temp;   
		sizeofarray= sizeofarray * 2;         // Changes the sizeofArray accordingly 
	}  
	
	// ------------------ METHODS TO ADD ELEMENTS TO THE ARRAY ---------------------------- //
	
	public void addElement(int a) {			  // Method appends element at end of the array      
		if (count == sizeofarray) {			  // Compares if the number of elements is equal to the size of the array or not           
				growSize();   				  // growSize() creates an array double the size of previous one
		}     
		array[count] = a;  					  // [count] is end of array - that's where the variable a is added 
		count++;   							  // incement the number of elements by one
	}   
 

	public void addElementAt(int index, int a) { // Method adds an element at specified index of array      
		if (count == sizeofarray)  { 		  // Compare the size with the number of elements; if not equal grows the array size   
			growSize();   
		}   
		for (int i = count - 1; i >= index; i--)   {   
			array[i + 1] = array[i];           // Shifts all the elements to the left from the specified index  
		}   
		array[index] = a;  					   // Inserts an element at the specified index    
		count++;   
	}
	
	// --------------------------MAIN FUNCTION --------------------------------------------- //
	
	public static void main(String[] args) {   	// Main function will call the methods coded above and test them
		DynamicArray da = new DynamicArray();   
		da.addElement(12);   
		da.addElement(22);   
		da.addElement(35);   
		da.addElement(47);   
		da.addElement(85);   
		da.addElement(26);   
		da.addElement(70);   
		da.addElement(81);   
		da.addElement(96);   
		da.addElement(54); 						// addElement adds an element at the end of the array 
		
		System.out.println("Elements of the array:");   

		for (int i = 0; i < da.sizeofarray; i++)  {   
			System.out.print(da.array[i] + " ");   
		}   									// For loop iterates through the array printing it all out
		System.out.println();   
													  
		System.out.println("Size of the array: " + da.sizeofarray);  		// Prints the size of the array.   
		System.out.println("No. of elements in the array: " + da.count); 	// Prints number of elements 
  
		da.addElementAt(5, 99);  				// adElementAt adds the element 99, at index 5 of the array
		System.out.println("\nElements of the array after adding an element at index 5:");   

		for (int i = 0; i < da.sizeofarray; i++)  {   
			System.out.print(da.array[i] + " ");   
		}   											// For loop again iterates through the array printing every element
		System.out.println();   

		System.out.println("Size of the array: " + da.sizeofarray);   	// Prints the size of the array and number of elements after 
		System.out.println("No. of elements in the array: " + da.count);  // all the operations have been done. 
	}  
}  