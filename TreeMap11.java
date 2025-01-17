package Maps;
import java.util.*;
public class TreeMap11 {

	public static void main(String[] args) {
		TreeMap<Integer,String> tm= new TreeMap<Integer,String>();
		tm.put(1,"z");
		tm.put(2,"a");
		tm.put(3,"q");
		tm.put(4,"p");
		tm.put(6,"t");
		tm.put(5,"m");
		System.out.println(tm); // automatically sorted by index in tree map
		TreeMap<String,Integer> tm2 = new TreeMap<String,Integer>();
		tm2.put( "Rohan",1);
		tm2.put( "Bheem",2);
		tm2.put( "Sachin",3);
		tm2.put( "Abhinav",6);
		tm2.put( "Sahil",5);
		tm2.put("Dhruva",4);
		System.out.println(tm2);
		
		TreeMap<Integer,String> tm_copy = (TreeMap<Integer,String>)tm.clone();
		System.out.println(tm.clone());

		boolean res1= tm.containsKey(6);
		System.out.println(res1);

		boolean res2= tm.containsKey(60);
		System.out.println(res2);

		boolean res3= tm.containsValue("Sahil");
		System.out.println(res3);
		boolean res4= tm.containsValue("t");
		System.out.println(res4);

		String str1=tm.get(10);
		System.out.println(str1);
		String str11=tm.get(4);
		System.out.println(str11);
		
		Class cls = tm.getClass();
		System.out.println(cls);

		String str2= tm.getOrDefault(1,"no data found");
		System.out.println(str2);
		String str3= tm.getOrDefault(10,"no data found");
		System.out.println(str3);

		int hashCode= tm.hashCode();
		System.out.println(hashCode);

		boolean empty = tm.isEmpty();
		System.out.println(empty);
//					tm.clear();
//					boolean empty2 = tm.isEmpty();
//					System.out.println(empty2);

		Set<Integer> KeySet = tm.keySet();
		Iterator<Integer> itr = KeySet.iterator();
		while(itr.hasNext()==true) {
			System.out.println(itr.next());
		}
		TreeMap<Integer,String> tm3 = new TreeMap<Integer,String>();
		tm3.put(11, "1son");
		tm3.put(12, "2son");
		tm3.put(13, "3son");
		tm3.put(14, "4son");
		tm3.put(15, "5son");
		tm3.put(16, "6son");
		System.out.println(tm3);

		tm.putAll(tm3);
		System.out.println(tm);

		for (Object o:tm.values()) {
			System.out.println(o);
	}

}
}
