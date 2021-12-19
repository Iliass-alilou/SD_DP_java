package HashTables;

public class HashTableArray<T> {
	
	private Element_HashTable<T>[] arrayHashTable;
	int size ;
	
	public HashTableArray(int size ) {
		this.size = size;
		arrayHashTable = new Element_HashTable[this.size];
		for(int i=0 ; i<arrayHashTable.length;i++) {
			arrayHashTable[i] = new Element_HashTable<T>();
		}
	}
	
	// getHash
	public int GetHash(int key) {
		return key%size;
	}
	
	// add element in the array
	//idee Linked List
	public void put(int key , T value) {
		int index = GetHash(key);
		Element_HashTable<T> arrayValue = arrayHashTable[index];
		Element_HashTable<T> newItem = new Element_HashTable<T>(key, value);
		arrayValue.setNext(newItem); 
	}
	
	// get elemt
	//Linked List
	public T get(int key) {
		T value = null;
		int index = GetHash(key);
		Element_HashTable<T> arrayValue = arrayHashTable[index];
		while(arrayValue!=null) {
			if(arrayValue.getKey() == key) {
				value = arrayValue.getValue();
				break;
			}
			arrayValue = arrayValue.getNext();
		}
		return value;
		
	}
	
	
	
}
