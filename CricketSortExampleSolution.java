import java.util.ArrayList;
import java.util.Collections;

class Cricketer1 implements Comparable<Cricketer1>{
	String name;
	int runs;
	int matches;
	int catches;
	String country;
	public Cricketer1 (String name,int runs,int matches,int catches,String country) {
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
	public int compareTo(Cricketer1 o) {
		if(this.runs<o.runs) {
			return 1;
		}
		else {
			return -1;
		}
	}
}

public class CricketSortExampleSolution {

	public static void main(String[] args) {
		Cricketer1 c1 = new Cricketer1("sachin",15000,300,200,"India");
		Cricketer1 c2 = new Cricketer1("ABD",8000,200,300,"SA");
		Cricketer1 c3 = new Cricketer1("Inzamam",12000,280,100,"pakistan");
		Cricketer1 c4 = new Cricketer1("malinga",2000,290,70,"SL");
		System.out.println(c1);
		System.out.println(c2);
		System.out.println(c3);
		System.out.println(c4);
		ArrayList<Cricketer1> al = new ArrayList<Cricketer1>();
		al.add(c1);
		al.add(c2);
		al.add(c3);
		al.add(c4);
		System.out.println(al);
		Collections.sort(al);
		System.out.println(al);
	}

}