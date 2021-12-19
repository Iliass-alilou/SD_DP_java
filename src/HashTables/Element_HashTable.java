package HashTables;

public class Element_HashTable<T> {

	private int key;
	private T value;
	private Element_HashTable<T> next;
	
	public Element_HashTable (int key, T value){
		this.key = key;
		this.value = value;
		next = null;
	}
	
	public Element_HashTable() {
		next = null;
	}
	
	public int getKey() {
		return this.key;
	}
	public void setKey(int key) {
		this.key = key;
	}
	public T getValue() {
		return this.value;
	}
	public void setValue(T value) {
		this.value = value;
	}
	public Element_HashTable<T> getNext(){
		return this.next;
	}
	public void setNext(Element_HashTable<T> next) {
		this.next = next;
	}

	@Override
	public String toString() {
		return "Element_HashTable [key=" + key + ", value=" + value + ", next=" + next + "]";
	}
	
	
	
}
