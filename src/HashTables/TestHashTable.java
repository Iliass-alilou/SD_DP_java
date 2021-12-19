package HashTables;

public class TestHashTable {

	public static void main(String[] args) {
		
		HashTableArray<String> hashTable = new HashTableArray<String>(10);
		hashTable.put(10, "iliass");
		hashTable.put(10, "zohir");
		hashTable.put(11, "Mohammed");
		hashTable.put(5, "Hamid");
		System.out.println(hashTable.toString());
		System.out.println(hashTable.get(11));
	}

}
