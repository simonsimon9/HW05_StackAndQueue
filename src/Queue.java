public class Queue<V> {
	private V[] data;
	private int size;
	private int firstElement;
	private int lastElement;
	
	/**
	 * Constructor that initializes the array for the queue.
	 * The size  is 0. The first element and last element
	 * is set to -1 since the queue is empty at the start. 
	 * 
	 * @param maxSize  the number of elements the queue can hold.
	 */
    @SuppressWarnings("unchecked")
    public Queue(int maxSize) {
    	data = (V[]) new Object[maxSize];
    	size = 0;
    	firstElement = 0;
    	lastElement = 0;
    }

    /**
     * Method returns the max size of the queue
     * 
     * @return the amount of elements the queue can hold
     */
    public int getMaxSize() {
    	return data.length;
    }
    /**
     * Method returns the current number of elements in the queue.
     * @return The amount of elements the queue contains. 
     */
    public int getCurrentSize() {
    	return size;
    }

    /**
     * Method checks if the queue is empty
     * @return Boolean value representing whether the queue is empty.
     */
    public boolean isEmpty() {
    	if(getCurrentSize() == 0) {
    		return true;
    	}
    	return false;
    }
	/**
	 * Method checks if the queue is full
	 * @return Boolean value representation whether the queue is full. 
	 */
    public boolean isFull() {
    	if(getCurrentSize() == getMaxSize()) {
    		return true;
    	}
    	return false;
    }

    /**
     * Method returns the first element in the queue. 
     * @return the element that is first in line. 
     */
    public V top() {
    	if(!isEmpty()) {
    		return this.data[firstElement];
    	}
    	return null;
    }

    /**
     * Method adds element into the queue.
     * If the queue is full, the method cannot add anymore elements.
     * If the queue is empty, point the location of the first element
     * to index 0. 
     * Else add the element into the queue.
     * 
     * @param value
     */
    public void enqueue(V value) {
    	
    	if(isFull()) {
    		System.out.println("The queue is full. Cannot add "+ value);
    	}else if(isEmpty()) {
    		firstElement = 0;
    		lastElement = 0;
    		data[firstElement] = value;
    		size++;
    	}
    	else{
    		lastElement++;
    		size++;
    		if(lastElement >= getMaxSize()) {
    			lastElement = 0;
    		}
    		this.data[lastElement] = value;
    	}
    	
    }
    
    /**
     * Method removes an element from the queue.
     * If queue is empty , it returns null.
     * Else remove the first element. 
     * 
     * @return the removed element
     */
    public V dequeue() {
    	if(isEmpty()) {
    		return null;
    	}
    	
    	V elementRemove = data[firstElement];
    	firstElement++;
    	size--;
    	
    	if(firstElement >= getMaxSize()) {
    		firstElement = 0;
    	}
    	
    	return elementRemove;
    	
    }
    
}