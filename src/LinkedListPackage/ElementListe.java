package LinkedListPackage;

public class ElementListe {

	private int value;
	private ElementListe next ;
	
	public ElementListe(int value ,ElementListe next) {
		this.value = value;
		this.next = next;
	}
	//sans successeur 
	public ElementListe(int value) {
		this.value = value;
	}
	
	public int getValue() {
		return value;
	}
	public void setValue(int value) {
		this.value = value;
	}
	public ElementListe getNext() {
		return next;
	}
	public void setNext(ElementListe next) {
		 this.next=next;
	}
	@Override
	public String toString() {
		return "ElementListe [value=" + value + ", next=" + next + "]";
	}
	
	
}
