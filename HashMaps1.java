package Maps;
import java.util.*;
public class HashMaps1 {

	public static void main(String[] args) {
		HashMap<Integer,String> hm = new HashMap<Integer,String>();
		hm.put(1, "Rohan");
		hm.put(2, "Bheem");
		hm.put(3, "Sachin");
		hm.put(4, "Abhinav");
		hm.put(6, "Sahil");
		hm.put(5, "Dhruva");
		System.out.println(hm);

		HashMap<String,Integer> hm2 = new HashMap<String,Integer>();
		hm2.put( "Rohan",1);
		hm2.put( "Bheem",2);
		hm2.put( "Sachin",3);
		hm2.put( "Abhinav",6);
		hm2.put( "Sahil",5);
		hm2.put("Dhruva",4);
		System.out.println(hm2);

		HashMap<Integer,String> hm_copy = (HashMap<Integer,String>)hm.clone();
		System.out.println(hm.clone());

		boolean res1= hm.containsKey(6);
		System.out.println(res1);

		boolean res2= hm.containsKey(60);
		System.out.println(res2);

		boolean res3= hm.containsValue("Sahil");
		System.out.println(res3);
		boolean res4= hm.containsValue("Ashvin");
		System.out.println(res4);

		String str1=hm.get(10);
		System.out.println(str1);

		Class cls = hm.getClass();
		System.out.println(cls);

		String str2= hm.getOrDefault(1,"no data found");
		System.out.println(str2);
		String str3= hm.getOrDefault(10,"no data found");
		System.out.println(str3);

		int hashCode= hm.hashCode();
		System.out.println(hashCode);

		boolean empty = hm.isEmpty();
		System.out.println(empty);
		//			hm.clear();
		//			boolean empty2 = hm.isEmpty();
		//			System.out.println(empty2);

		Set<Integer> KeySet = hm.keySet();
		Iterator<Integer> itr = KeySet.iterator();
		while(itr.hasNext()==true) {
			System.out.println(itr.next());
		}
		HashMap<Integer,String> hm3 = new HashMap<Integer,String>();
		hm3.put(11, "1son");
		hm3.put(12, "2son");
		hm3.put(13, "3son");
		hm3.put(14, "4son");
		hm3.put(15, "5son");
		hm3.put(16, "6son");
		System.out.println(hm3);

		hm.putAll(hm3);
		System.out.println(hm);

		for (Object o:hm.values()) {
			System.out.println(o);
		}
	}

}
