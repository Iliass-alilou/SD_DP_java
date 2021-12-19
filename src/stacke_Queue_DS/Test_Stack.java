package stacke_Queue_DS;

public class Test_Stack {

	public static void main(String[] args) {
		Stacke_LIFO stack = new Stacke_LIFO(5);
		System.out.println(stack.toString());
		System.out.println();
		System.out.println();
		
		stack.push(10);
		stack.push(20);
		stack.push(30);
		System.out.println(stack.toString());
		
		System.out.println();
		System.out.println();
		
		stack.pop();
		System.out.println(stack.toString());
		System.out.println(stack.peek());
		System.out.println(stack.get_Size());

	}

}
