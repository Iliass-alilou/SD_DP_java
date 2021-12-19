package LinkedListPackage;

public class LinkedListDoubleImptl {

	//static LinkedListDouble node;
	
	// get the first element 
	   public static LinkedListDouble getFirstElement(LinkedListDouble elet) {   
		   return elet;
	   }
	
	// get the last element 
	   
	   public static LinkedListDouble getLastElement (LinkedListDouble elet) {
		   if(getFirstElement(elet).getPrevious() == null && getFirstElement(elet).getNext() == null) {
			   return elet;
		   }else if(getFirstElement(elet).getNext()==null) {
			   return elet;
		   }else {
			   return getLastElement(elet.getNext());
		   }
	   }
	   
	   public static int size_double(LinkedListDouble elet) {
		   int size = 1;
			if(elet == null) {
				return size;
			}else {
				size = size + size_double(elet.getNext());
				return size;
			}
		}
	
	/* add element 
	 * 1. in the first
	 * 2. in the end 
	 * 3. add in the given  index
	 * */
	
	//1. add in the first 
	
	public static LinkedListDouble addInFirst(LinkedListDouble elet , int value) {
		if(elet == null) {
			return new LinkedListDouble(value);
		}else {
			LinkedListDouble temp = new LinkedListDouble(value);
			elet = new LinkedListDouble(value,temp.getPrevious() , elet);
			return elet;
		}
		
	}
	
	// 2. Add in The end
	
	public static LinkedListDouble addInTheEnd(LinkedListDouble elet , int value) {
		if(elet == null) {
			return new LinkedListDouble(value);
		}else {
			System.out.println("test   "+ elet);
			LinkedListDouble temp = new LinkedListDouble(value);
			return new LinkedListDouble(value , temp , elet);
		}
	}
	
	// 3.  add in the given  index 
	
	public static LinkedListDouble addByIndex (LinkedListDouble elet , int value , int index) {
		
		if(index == 0) {
			return addInFirst(elet,value);
		}
		if(index == size_double(elet)) {
			return addInTheEnd(elet,value);
		}
		int tempIndex = 0;
		while(tempIndex != index) {
			tempIndex ++;
			elet = elet.getNext();
		}
		System.out.println(elet);
		LinkedListDouble temp = new LinkedListDouble(value);
		elet.setNext(temp);
		temp.setNext(elet.getNext());
		elet.getNext().setPrevious(temp);
		temp.setPrevious(elet);
		return elet;
	}
	
	
	
	// get the element by gevin index
	

	
	//update the element by given index
	
	//remove elet by given index
	
	
	
	public static void main(String[] args) {
		
		LinkedListDouble node = new LinkedListDouble(10);
		System.out.println(node.toString());
		System.out.println(size_double(node));
		System.out.println();
		System.out.println();
		System.out.println(getFirstElement(node).toString());
		node = addInFirst(node,20);
		System.out.println(node.toString());
		node = addInFirst(node,30);
		System.out.println(node.toString());
		System.out.println(getLastElement(node).toString());
		node = addInTheEnd(node,11);
		System.out.println(node.toString());
		System.out.println(getFirstElement(node).toString());
		System.out.println(size_double(node));
//		System.out.println("test add by index");
//		System.out.println(addByIndex(node,100,3).toString());
		
	}

}
