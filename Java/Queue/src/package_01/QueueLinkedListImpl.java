package package_01;

//Java program for linked-list implementation of queue
//code origin -> https://www.geeksforgeeks.org/queue-linked-list-implementation/

//A class to represent a queue
//The queue, front stores the front node of LL and rear
//stores the last node of LinkedList
public class QueueLinkedListImpl {

	QNode front, rear;
	
	public QueueLinkedListImpl() {
		this.front = this.rear = null;
	}
	
	//Method to add an key to the queue
	void enqueue(int key) {
		QNode temp = new QNode(key);
		
		//If queue is empty, then new node is front and rear both
		if(this.rear == null) {
			this.front = this.rear = temp;
			return;
		}
		
		this.rear.next = temp;
		this.rear = temp;//now the new QNode is the last element 
		
	}
	
	 // Method to remove an key from queue.
	void dequeue() {
		if(this.front == null) return; //if queue is empty , return null
		
		//move front one node ahead,
		this.front = this.front.next; // now the previous front is lost, is dequeue, remember FIFO
		
		//If front becomes NULL, then change rear also as NULL
		if(this.front == null) this.rear = null;
		
	}
	
	// A linked list (LL) node to store a queue entry
	static class QNode{
		int key;
		QNode next;// works as link to the next element in the linked list
		
		// constructor to create a new linked list node
		public QNode(int key) {
			this.key = key;
			this.next = null;
		}
	}
	
	public static void main(String[] args) {
		QueueLinkedListImpl q = new QueueLinkedListImpl();
		q.enqueue(10);
		q.enqueue(20);
		q.dequeue();
		q.dequeue();
		q.enqueue(30);
		q.enqueue(40);
		q.enqueue(50);
		q.dequeue();
		System.out.println("Queue Front : " + ((q.front != null) ? (q.front).key : -1));
		System.out.println("Queue Rear : " + ((q.rear != null) ? (q.rear).key : -1));
		
	}
	
}
