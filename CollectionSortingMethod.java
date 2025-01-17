import java.util.*;
public class CollectionSortingMethod {
	public static void main(String[] args) {
		ArrayList<Integer> al = new ArrayList<Integer>();
		al.add(20);
		al.add(23);
		al.add(22);
		al.add(21);
		al.add(24);
		System.out.println(al);
		
//		Approach 1 using treeset
//		TreeSet<Integer> ts = new TreeSet<Integer>();
//		ts.addAll(al);
//		al.clear();
//		al.addAll(ts);
		
//		Approach 2 using collection sort
		Collections.sort(al);
		System.out.println(al);
		
		ArrayDeque<Integer> ad = new ArrayDeque<Integer>();
		ad.add(40);
		ad.add(43);
		ad.add(41);
		ad.add(42);
		ad.add(44);
		System.out.println(ad);
//		now to sort using collection sort we must convert arrayDeque to arrayList
		ArrayList<Integer> al2 = new ArrayList<Integer>();
		al2.addAll(ad); // add all the elements of ad to al2
		ad.clear();// clears ad
		Collections.sort(al2); // sorts
		ad.addAll(al2); // adds back data to ad from al2
		
		System.out.println(ad);
	}
}
