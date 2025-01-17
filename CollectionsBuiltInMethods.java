package Collectionframeworks;

import java.util.ArrayList;
import java.util.Collections;

public class CollectionsBuiltInMethods {

	public static void main(String[] args) {
		ArrayList<Integer> al = new ArrayList<Integer>();
		al.add(100);
		al.add(150);
		al.add(25);
		al.add(75);
		al.add(125);
		al.add(175);
		al.add(50);
		System.out.println(al);
		Collections.sort(al); // collection is interface and Collections is class
		System.out.println(al);
		int pos = Collections.binarySearch(al,75);
		System.out.println(pos);
		ArrayList<Integer> al1 = new ArrayList<Integer>();
		al1.add(1100);
		al1.add(1150);
		al1.add(125);
		al1.add(175);
		al1.add(1125);
		al1.add(1175);
		al1.add(150);
		al1.add(175);
		al1.add(1125);
		al1.add(1175);
		al1.add(150);
		al1.add(175);
		al1.add(1125);
		al1.add(1175);
		al1.add(150);
		Collections.copy(al1, al);
		System.out.println(al1);
		Integer max = Collections.max(al1);
		System.out.println(max);
		Integer min = Collections.min(al1);
		System.out.println(min);
		int frequencie = Collections.frequency(al1,1125);
		System.out.println(frequencie);
		System.out.println(al1);
		Collections.replaceAll(al1, 1175, 2275);
		System.out.println(al1);
		Collections.reverse(al1);
		System.out.println(al1);
		ArrayList<Integer> al2 = new ArrayList<Integer>();
		al2.add(1);
		al2.add(2);
		al2.add(3);
		al2.add(4);
		al2.add(5);
		System.out.println(al2);
		Collections.rotate(al2, 3);
		System.out.println(al2);
		Collections.shuffle(al2);
		System.out.println(al2);
		Collections.swap(al2, 2, 4);
		System.out.println(al2);
	}

}