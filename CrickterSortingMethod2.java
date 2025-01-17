import java.util.*;

class Cricketer implements Comparable<Cricketer>{
	String name;
	int runs;
	int matches;
	int catches;
	String country;
	public Cricketer (String name,int runs,int matches,int catches,String country) {
		super();
		this.name=name;
		this.runs=runs;
		this.matches=matches;
		this.catches=catches;
		this.country=country;
		}
	public String getName() {
		return name;
	}
	public int getRuns() {
		return runs;
	}
	public int getmatches() {
		return matches;
	}
	public int getcatches() {
		return catches;
	}
	public String getcountry() {
		return country;
	}
	@Override
	public String toString() {
		return name+"----"+runs+"----"+matches+"----"+catches+"----"+country;
	}
	@Override
	public int compareTo(Cricketer o) {
		if(this.runs<o.runs) {
			return 1;
		}
		else {
			return -1;
		}
	}
}

public class CrickterSortingMethod2 {

	public static void main(String[] args) {
		Cricketer c1 = new Cricketer("sachin",15000,300,200,"India");
		Cricketer c2 = new Cricketer("ABD",8000,200,300,"SA");
		Cricketer c3 = new Cricketer("Inzamam",12000,280,100,"pakistan");
		Cricketer c4 = new Cricketer("malinga",2000,290,70,"SL");
		System.out.println(c1);
		System.out.println(c2);
		System.out.println(c3);
		System.out.println(c4);
		ArrayList<Cricketer> al = new ArrayList<Cricketer>();
		al.add(c1);
		al.add(c2);
		al.add(c3);
		al.add(c4);
		System.out.println(al);
		Collections.sort(al);
		System.out.println(al);
	}

}