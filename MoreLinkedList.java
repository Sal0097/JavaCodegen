
package Collectionframeworks;

import java.util.LinkedList;

public class MoreLinkedList {
	public static void main(String[] args) {
		LinkedList ll = new LinkedList();
		ll.add(100);
		ll.add(50);
		ll.add(150);
		ll.add(25);
		ll.add(75);
		ll.add(125);
		ll.add(175);
		System.out.println(ll);
//		ll.clear();
//		System.out.println(ll);
		
		LinkedList ll1 = (LinkedList)ll.clone(); // helps to clone the linked list in different memory element
		System.out.println(ll1);
		
		boolean res = ll.contains(175); // if the element is present in list or not
		System.out.println(res);
		
		res = ll.contains(1750);
		System.out.println(res);
		
		res = ll.containsAll(ll1); // checks if ll contains all the elements of ll1
		System.out.println(res);
		
		ll1.add(567);
		res = ll.containsAll(ll1);
		System.out.println(res);
		
		ll.push(222); // push element to index0
		System.out.println(ll);
		
		ll.pop();//pops element to index0
		System.out.println(ll);
	}

}