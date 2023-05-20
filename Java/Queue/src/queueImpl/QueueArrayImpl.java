package queueImpl;

//the code origin -> https://www.geeksforgeeks.org/introduction-to-queue-data-structure-and-algorithm-tutorials/
//Java program for array implementation of queue
//A class to represent a queue
public class QueueArrayImpl {

	/*
	 * front = first entry in the Queue(old entry), 
	 * rear = last entry in the Queue(new entry),
	*/
	int front, rear, size;
	int capacity;
	int array[];
	
	public QueueArrayImpl(int capacity) {
		this.capacity = capacity;
		front = this.size = 0;
		rear = capacity - 1; // arrays start with 0, so the last element has as index the length -1 
		array = new int[this.capacity]; //we create an int array
	}
	
	// Queue is full when size becomes
    // equal to the capacity
	boolean isFull(QueueArrayImpl queue) {
		return (queue.size == queue.capacity);
	}
	
    // Queue is empty when size is 0
	boolean isEmpty(QueueArrayImpl queue) {
		return (queue.size == 0);
	}
	
    // Method to add an item to the queue.
    // It changes rear and size
	void enqueue(int item) {
		if(isFull(this)) return;
		this.rear = (this.rear + 1) % this.capacity;//for example , for the first element, we will get index 0, then 1, and then 2
		this.array[this.rear] = item;
		this.size = this.size + 1;
		System.out.println(item + " enqueued to queue");
	}
	
	// Method to remove an item from queue. The oldest in the queue
    // It changes front and size
	int dequeue() {
		if(isEmpty(this)) return Integer.MIN_VALUE;
		
		int item = this.array[this.front];
		this.front = (this.front + 1) % this.capacity;
		this.size = this.size - 1;
		return item;
	}
	
	// Method to get front of queue, the oldest item
	int front() {
		if(isEmpty(this)) return Integer.MIN_VALUE;
		return this.array[this.front];
	}
	
	// Method to get rear of queue, the newest item
	int rear() {
		if(isEmpty(this)) return Integer.MIN_VALUE;
		return this.array[this.rear];
	}
	
	public static void main(String[] args) {
		QueueArrayImpl queue = new QueueArrayImpl(100);
		queue.enqueue(10);
		queue.enqueue(20);
		queue.enqueue(30);
		queue.enqueue(40);
		
		System.out.println(queue.dequeue()
                + " dequeued from queue");
		
		System.out.println("Front item is "
                + queue.front());

		System.out.println("Rear item is " + queue.rear());
	}
	
	
}
