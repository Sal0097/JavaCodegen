import java.util.*;
public class IteratorsExample {

	public static void main(String[] args) {
		ArrayList<Integer> al = new ArrayList<Integer>();
			al.add(100);
			al.add(50);
			al.add(150);
			al.add(25);
			al.add(75);
			al.add(125);
			al.add(175);
			System.out.println(al);
			
			System.out.println("===============================================================");
			System.out.println("using for loop");
			for(int i=0;i<al.size();i++) {
				System.out.println(al.get(i));
			}
			System.out.println("===============================================================");
			System.out.println("using for each loop");
			for(Integer o :al) {
				System.out.println(o);
			}
			System.out.println("===============================================================");
			System.out.println("using iterators");
			Iterator<Integer> iterator = al.iterator();
			while(iterator.hasNext()==true) {
				System.out.println(iterator.next());
			}
			System.out.println("===============================================================");
			System.out.println("using list iterators");
			ListIterator<Integer> listIterator = al.listIterator();
			while(listIterator.hasNext()==true) {
				System.out.println(listIterator.next());
			}
	}

}
