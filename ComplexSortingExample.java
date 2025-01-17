import java.util.*;

public class ComplexSortingExample {

	public static void main(String[] args) {
		Cricketer c1 = new Cricketer("Sachin",20000,300,200,"India");
		Cricketer c2 = new Cricketer("Sachin",20000,300,200,"India");
		Cricketer c3 = new Cricketer("Sachin",20000,300,200,"India");
		Cricketer c4 = new Cricketer("Sachin",20000,300,200,"India");
		
		System.out.println(c1);
		System.out.println(c2);
		System.out.println(c3);
		System.out.println(c4);
		
		ArrayList<Cricketer> al
	}
}


class Cricketer{
	String name;
	int runs;
	int matches;
	int catches;
	String country;
	
	public Cricketer(String name, int runs, int matches, int catches, String country) { // creating constructor
		super();
		this.name = name;
		this.runs = runs;
		this.matches = matches;
		this.catches = catches;
		this.country = country;
	}

	public String getName() { // only use get methods and use toString instead of Set method
		return name;
	}

	public int getRuns() {
		return runs;
	}

	public int getMatches() {
		return matches;
	}

	public int getCatches() {
		return catches;
	}

	public String getCountry() {
		return country;
	}

	@Override
	public String toString() {
		return "Cricketer [name=" + name + ", runs=" + runs + ", matches=" + matches + ", catches=" + catches
				+ ", country=" + country + "]";
	}
}