package stacke_Queue_DS;

public class testQueue_FIFO {

	public static void main(String[] args) {
		Queue_FIFO queue_fifo = new Queue_FIFO(5);
		
		queue_fifo.enqueue(1);
		System.out.println(queue_fifo.isEmpty());
		queue_fifo.enqueue(6);
		queue_fifo.enqueue(3);
		queue_fifo.enqueue(2);
		queue_fifo.enqueue(5);
		
		queue_fifo.dequeue();
		
		System.out.println(queue_fifo.toString());
		System.out.println(queue_fifo.peek());
		System.out.println(queue_fifo.getSize());
		
		
	}

}
