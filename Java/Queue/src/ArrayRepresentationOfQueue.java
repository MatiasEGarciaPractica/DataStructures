
//the origin of this code -> https://www.geeksforgeeks.org/introduction-to-queue-data-structure-and-algorithm-tutorials/
public class ArrayRepresentationOfQueue {

	// A structure to represent a queue
	static class Queue{
		/*
		 * front = first entry in the Queue(old entry), 
		 * rear = last entry in the Queue(new entry)
		*/
		int front, rear, size;
		int cap;
		int arr[];
	}
	
	// Function to create a queue of given capacity
    // It initializes size of queue as 0
	Queue createQueue(int cap) {
		
		Queue queue = new Queue(); 
		queue.cap = cap;
		queue.front = 0;
		queue.size = 0;
		
		queue.rear = cap -1;
		queue.arr = new int[queue.cap];
		return queue;
		
	}
	
	public static void main(String[] args) {
		
	}
	
	
}
