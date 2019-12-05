
/*12. Define an interface QueueOperations which declares methods for a static queue.
Define a class MyQueue which contains an array and front and rear as data
members and implements the above interface. Initialize the queue using a constructor.
Write a menu driven program to perform operations on a queue object.*/
package pro12;

public class MyQueue implements QueueOperations {
	private static int[] queue;
	private static int front;
	private int rear;

	public MyQueue(int size) {
		this.queue = new int[size];
		rear = 0;
		front = 0;

	}

	private boolean isFull() {
		return rear == queue.length - 1;
	}

	private boolean isEmpty() {

		return front == rear;

	}
	@Override
	public int insertElements(int data) {
		if (!isFull()) {
			return queue[rear++] = data;
		} else {
			return 0;
		}
	}
	@Override
	public int deleteElements() {
		
		if(!isEmpty()) {
			return queue[rear--];
		}else {
			return 0;
		}
	}
	@Override
	public int[] desplayElements() {
		return queue;
	}

}
