package Collectionframeworks;
import java.util.*;

public class LinkedListMethods {

	public static void main(String[] args) {
		LinkedList ll = new LinkedList();
		ll.add(200);
		ll.add(300);
		ll.add(400);
		ll.add(500);
		ll.add(600);
		System.out.println(ll); // linked list created
		
		ll.add(2,350); // add in a specific index location
		ll.add(0,150);
		System.out.println(ll);
		
		ll.addFirst(100);// add as first element
		ll.addLast(650);// add as last element
		System.out.println(ll);
		
		ll.addAll(ll);
		System.out.println(ll);
		
		LinkedList ll2 = new LinkedList(); // creating new linked list to add in the first LL.
		ll2.add(20);
		ll2.add(30);
		ll2.add(40);
		ll2.add(50);
		ll2.add(60);
		System.out.println(ll2);
		ll.add(ll2);//adds elements as the new list inside the linked list.
		System.out.println(ll);
		ll.addAll(ll2); // adds elements as the  other elements of the linked list
		System.out.println(ll);
	}

}
