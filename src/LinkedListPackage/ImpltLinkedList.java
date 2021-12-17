package LinkedListPackage;

import java.util.List;

public class ImpltLinkedList {
	
	
	static ElementListe node;
	//static ElementListe temp = node;
	
	
	//afficher le premier element 
	public static ElementListe getFirstNode() {
		return node;
	}
	
	
	//verifier si elle est vide
	public static boolean isVide() {
		return node == null;
	}
	
	
	//ajouter au debut
	public static void addFirst(int value) {
		if (node == null) {
			node = new ElementListe(value);
		}
		ElementListe ancienPremier = node;
		node = new ElementListe(value,ancienPremier);
		
	}
	
	
	// get longueur 
	public static int getLongueur() {
		int longeur = 0;
		if(isVide()) {
			return -1;
		}
		ElementListe nodeActuelle = getFirstNode();
		while(nodeActuelle != null) {
			longeur ++;
			nodeActuelle = nodeActuelle.getNext();
		}
		return longeur;
	}
	
	// appartenance d'un element au liste
	public static boolean contient(int value) {
		boolean founded = false;
		ElementListe ref = getFirstNode();
		if(node == null) {
			return false;
		}
		while(!founded && ref != null) {
			if(ref.getValue() == value) {
				founded = true;
			}else {
				ref = ref.getNext();
			}
		}
		return founded;
		
	}
	
	//concatiner list
	
	public static void concatinate(ElementListe l) {
		if(isVide()) {
			node = l.getNext();
		}else {
			ElementListe dernier = getFirstNode();
			while(dernier.getNext()!=null) {
				dernier = dernier.getNext();
			}
		   dernier.setNext(l.getNext());
		}
	}
	
	//get the last element 
	public static ElementListe getDernierElement () {
		ElementListe dernier = getFirstNode();
		while(dernier.getNext()!=null) {
			dernier =dernier.getNext();
		}
		return dernier;
	}
	
	// Ajouter a la fin de la liste chainees
	public  static void AddEnd(int value) {
		if(isVide()) {
			node = new ElementListe(value);
		}else {
			ElementListe dernier = getDernierElement();
			dernier.setNext(new ElementListe(value));
		}
		
	}
	
	
	// supprimer la premier apparution d'un element dans la liste
	
	public static void retirerPremiereOccurrence(int value) {
		if(isVide()) {
			return;
		}
		
		ElementListe deleteNode = getFirstNode();
		if (value == deleteNode.getValue()) {
			node = deleteNode.getNext();
					
		}else {
			ElementListe precedent = getFirstNode();
			deleteNode = deleteNode.getNext();
			while(deleteNode.getValue() != value && deleteNode!=null  ) {
				precedent = deleteNode;
				deleteNode = deleteNode.getNext();
			}
			if(deleteNode!=null) {
				precedent.setNext(deleteNode.getNext());
			}
			
		}
		
	}
	
	/*************   Recursivite    *****************/
	
	// get Longeur avec Recursivite 
	
	public static int getLongueurRec (ElementListe elt) {
		
		int l =1;
		if(elt == null) {
			return 0;
		}
		l = l + getLongueurRec(elt.getNext());
		return l;
		
	}
	
	
	// contien Recurence
	public static boolean contientRec(ElementListe elet,int value) {
		if(elet == null) {
			return false;
		}else if(elet.getValue() == value) {
			return true;
		}else {
			return contientRec(elet.getNext(),value);
		}
		
	}
	// suppression du premier occurence d'une maniere recursive
	public static ElementListe retirerPremiereOccurrenceRec(ElementListe elet , int value) {
		if(elet == null) {
			return elet;
		}else if(elet.getValue() == value){
			node = elet.getNext();
			return node;
		}else {
//			ElementListe deletedNode = retirerPremiereOccurrenceRec(elet.getNext(),value);
//			node = new ElementListe(elet.getValue(),deletedNode);
			elet.setNext(retirerPremiereOccurrenceRec(elet.getNext(),value));
			node = elet;                                                                                                                                      
			return node ;
		}
		
	}
	
	
	
	
	
	// main function
	public static void main(String[] args) {
		
		node = new ElementListe(10);
		System.out.println(getFirstNode().toString());
		System.out.println(isVide());
		addFirst(2);
		System.out.println(getFirstNode().toString());
		System.out.println(contient(1));
		System.out.println(getLongueur());
		System.out.println("test last");
		System.out.println(getDernierElement().toString());
		AddEnd(20);
		AddEnd(30);
		AddEnd(40);
		System.out.println(getDernierElement().toString());
		System.out.println();
		System.out.println();
		System.out.println("test suppression");
		System.out.println(getFirstNode().toString());
		retirerPremiereOccurrence(10);
		System.out.println();
		System.out.println();
		System.out.println(getFirstNode().toString());
		System.out.println();
		System.out.println();
		/*test recurence*/
		System.out.println("Longeur "+ getLongueurRec(node));
		System.out.println(contientRec(node, 20));
		System.out.println(contientRec(node, 0));
		System.out.println();
		System.out.println();
		retirerPremiereOccurrenceRec(node,20);
		System.out.println(getFirstNode().toString());
	}

}
