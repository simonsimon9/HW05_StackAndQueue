public class Stack<V>
{
	private V[] data;
	private int size;
	private int topElement;
	
	/**
	 * Constructor creates the array with size from parameter.
	 * Size is 0 and top element is -1 since there's no element
	 * 
	 * @param size  used to initialize the size of array
	 */
    // Constructor to initialize the stack
    @SuppressWarnings("unchecked")
    public Stack(int size)
    {
    	this.data = (V[]) new Object[size];
    	this.size = 0;
    	this.topElement = -1;  
    }
    
    /**
     * When element is pushed into array,
     * the size of stack is increased by one, 
     * and the top element index
     * is increased by one. 
     * 
     * @param element the element to be pushed into stack
     */
    // Utility function to add an element to the stack
    public void push(V element) {
    	if(!this.isFull()) {
    		this.topElement++;
        	this.data[topElement]= element;
        	this.size++;
    	}
    }
    
    /**
     * When the stack is not empty, this method
     * pops the stack by decreasing the size by one,
     * and returning the top element. The top element 
     * index is then decreased by one. 
     * 
     * @return the element that is popped from stack
     */
    // Utility function to pop a top element from the stack
    public V pop()
    {
    	if(!this.isEmpty()) {
    		int popElement = this.topElement;
    		this.topElement--;
        	this.size--;	
        	return data[popElement];
    	}
    	return null;
    	
    }
 
    /**
     * Method returns the top element on that stack. 
     * If there is no elements in the stack, an exception
     * is thrown since top element is -1. 
     * 
     * @return the top element on stack
     * @throws ArrayIndexOutOfBoundsException
     */
    // Utility function to return the top element of the stack
    public V peek() throws ArrayIndexOutOfBoundsException
    {	
    	try {
    		
    		return this.data[topElement];
    		
    	}catch(ArrayIndexOutOfBoundsException e){
    		
    		System.out.println("Stack is empty, cannot peek.");
    		return null;
    	}
    	
    }
    
    /**
     * Method returns the size of stack. 
     * 
     * @return the size of the stack
     */
    // Utility function to return the size of the stack
    public int size() {
    	return this.size;
    }
    /**
     * Method returns boolean whether or not the stack is empty
     * @return  state of stack if it is empty
     */
    // Utility function to check if the stack is empty or not
    public boolean isEmpty() {
    	if(size == 0) {
    		return true;
    	}
    	return false;
    }
    
    /**
     * Method returns boolean whether or not the stack is full. 
     * @return state of stack if it is full
     */
    // Utility function to check if the stack is full or not
    public boolean isFull() {
    	if(size == data.length) {
    		return true;
    	}
    	return false;
    }
}