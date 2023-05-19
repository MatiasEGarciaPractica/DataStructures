package package_01;

public class LinkedListRepresentationOfQueue {
	
	// A structure to represent a queue
    static class QNode{
    	int data;
    	QNode next; // works as link to the next element in the linked list
    	
    	QNode(int data){
    		this.data = data;
    		next = null;
    	}
    }
 
    
    static class Queue{
    	QNode front, near;
    	Queue() {
			front = null;
			near = null;
		}
    }
    
}
