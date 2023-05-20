package queueInterface;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Queue;
import java.util.concurrent.PriorityBlockingQueue;

//code origin -> https://www.geeksforgeeks.org/queue-interface-java/
public class QueueExample {

	public static void main(String[] args) {
		//queueLinkedList();
		//queuePriorityQueue();
		queuePriorityBlockingQueue();
	}
	
	
	static void queueLinkedList() {
		Queue<String> q = new LinkedList<>();
		
		q.add("apple");
		q.add("banana");
		q.add("cherry");
		
		System.out.println("Queue : " + q);
		
		//remove the front element in the queue
		String front = q.remove();
		System.out.println("Removed front element : " + front);
		System.out.println("Queue after removal : " + q);
		
		q.add("date");
		
		String peeked = q.peek();
		System.out.println("Peeked element : " + peeked);
		System.out.println("Queue after peek : " + q);
		
		int size = q.size();
		System.out.println("Queue size : " + size);//should be 3
	}
	
	static void queuePriorityQueue() {
		Queue<String> pq = new PriorityQueue<>();
		
		pq.add("Geeks"); 
		pq.add("For");
		pq.add("Geeks");
		
		//in the alphabet f is before g, so "For" should be first in the queue
		System.out.println(pq);
		
		pq.remove("Geeks"); //just delete one Geeks
		System.out.println("After Remove " + pq);
		System.out.println("Poll Method " + pq.poll()); // remove the head and return it
		System.out.println("Final Queue " + pq);
		
		/*---------------*/
		
		pq.add("Geeks"); 
		pq.add("For");
		
		
		Iterator iterator = pq.iterator();
		System.out.println("Iteration with ITERATOR -> ");
		while(iterator.hasNext()) {
			System.out.println(iterator.next() + " ");
		}
		
		System.out.println("Iteration with FOREACH");
		pq.forEach(System.out::println);
	}
	
	//this option is thread safe
	static void queuePriorityBlockingQueue() {
		Queue<Integer> pbq = new PriorityBlockingQueue<Integer>();
		
		pbq.add(10);
		pbq.add(20);
		pbq.add(15);
		
		// Printing the top element of the PriorityBlockingQueue
		System.out.println(pbq.peek());
		
		//printing the top element and removing it from the queue
		System.out.println(pbq.poll());
		
		//printing the top element again
		System.out.println(pbq.peek());
		
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
}
