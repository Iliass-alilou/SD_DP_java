package LinkedListPackage;


public class LinkedListDouble {

	  private int value;
	  private LinkedListDouble previous;
	  private LinkedListDouble next;
	  
	  public LinkedListDouble() {
		 super();
	  }
	  public LinkedListDouble(int value) {
		  this.value = value;
		 //this.next = this.previous = null;
	  }
	  
	  public LinkedListDouble(LinkedListDouble previous,LinkedListDouble next) {
		  this.previous=previous;
		  this.next=next;
		  
	  }
	  
	  public LinkedListDouble(int value,LinkedListDouble previous,LinkedListDouble next) {
		  this.value = value;
		  this.previous=previous;
		  this.next=next;
		  
	  }
	public int getValue() {
		return value;
	}
	public void setValue(int value) {
		this.value = value;
	}
	public LinkedListDouble getNext() {
		return next;
	}
	public void setNext(LinkedListDouble next) {
		this.next = next;
	}
	public LinkedListDouble getPrevious() {
		return previous;
	}
	public void setPrevious(LinkedListDouble previous) {
		this.previous = previous;
	}

	@Override
	public String toString() {
		return "LinkedListDouble [value=" + value + ", previous=" + previous + ", next=" + next + "]";
	}

	
	   
	
}
