package stacke_Queue_DS;

import java.util.Arrays;

import javax.sound.midi.Soundbank;

public class Stacke_LIFO {

	private int[] stack;
	private int top;
	private int size;
	
	public Stacke_LIFO(int sizeOfArray) {
		this.stack = new int[sizeOfArray];
		this.top = -1;
		this.size = 0;
	}
	
	// isEmpty function
	public boolean isEmpty() {
		return top == -1;
	}
	
	// check if the stack is full
	
	public boolean isFull() {
		return top == stack.length-1;
	}
	
	// add to stack : adding in the end 
	
	public void push(int value) {
		top++;
		size++;
		stack[top] = value;
	}
	
	// remove element from the stacke (pop()):
	
	public int  pop() {
		if(isEmpty()) {
			System.out.println("the stack alredy clean");
		}
		stack[top] = 0; 
		top--;
		size--;
		return stack[top+1];
	}
	
	// return the top element : peek()
	
	public int peek() {
		return stack[top] ;
	}
	
	// return the size
	
	public int get_Size() {
		return size;
	}

	@Override
	public String toString() {
		return "Stacke_LIFO [stack=" + Arrays.toString(stack) + ", top=" + top + ", size=" + size + "]";
	}
	
}
