package stacke_Queue_DS;

import java.util.Arrays;

public class Queue_FIFO {

	private int[] queue;
	private int rear;
	private int front;
	private int size;

	public Queue_FIFO(int sizeOfArray) {
		this.queue = new int[sizeOfArray];
		this.rear = -1;
		this.front = 0;
		this.size = 0;
	}

	// verrefy if the queue isEmpty

	public boolean isEmpty() {
		boolean response = false;
		if (size == 0) {
			response = true;
			return response;
		}
		return response;
	}

	// enqueue : add in the rear of queue

	public boolean enqueue(int value) {
		boolean response = false;
		if (size == 0) {
			queue[0] = value;
		}
		if (rear != queue.length - 1) {
			rear++;
			size++;
			queue[rear] = value;
		}
		return response;
	}
	// dequeue: delete from the front of the queue

	public int dequeue() {
		int response = 0;
		if (size != 0) {
			front++;
			response = queue[front];
			size--;

		}
		return response;

	}

	// Utility function to return the front element of the queue

	public int peek() {
		if (isEmpty()) {
			System.out.println("Underflow\nProgram Terminated");
			System.exit(-1);
		}
		return queue[front-1];

	}
	//get size of the queue
	
	public int getSize() {
		return size;
	}

	
	
	@Override
	public String toString() {
		return "Queue_FIFO [queue=" + Arrays.toString(queue) + ", rear=" + rear + ", front=" + front + ", size=" + size
				+ "]";
	}
	
}
