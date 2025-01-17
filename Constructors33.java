///19/11/2024

class AnimalClass{ // this is an orphan class cause no parent class(orphan class) # class AnimalClass extends Object{  }
	private String name;
	private String breed;
	private String color;
	private int  cost;

//	One parameterized constructor
	public AnimalClass(String name) { // method has same name as class without any return type
		this("Jack","GR");
		this.name=name;
		System.out.println("this is 1 parameter constuctor");
	}
//	two parameterized constructor
	public AnimalClass(String name,String breed ) {
		this("Rocky","Bulldog", "yellow");
		this.name=name;
		this.breed=breed;
		System.out.println("content after execution of 2 parameterized constructor");
		System.out.println(this.name);
		System.out.println(this.breed);
		System.out.println("========================================================");
	}
//	three parameterized constructor
	public AnimalClass(String name,String breed, String color ) {
		this("Oggy","Shitzu","Cream",5000);
		this.name=name;
		this.color=color;
		this.breed=breed;
		System.out.println("content after execution of 3 parameterized constructor");
		System.out.println(this.name);
		System.out.println(this.breed);
		System.out.println(this.color);
		System.out.println("========================================================");

	}
//	four parameterized constructor
	public AnimalClass(String name,String breed, String color,int cost ) {
		this();
		this.name=name;
		this.breed=breed;
		this.color=color;
		this.cost=cost;
		System.out.println("content after execution of 4 parameterized constructor");
		System.out.println(this.name);
		System.out.println(this.breed);
		System.out.println(this.color);
		System.out.println(this.cost);
		System.out.println("========================================================");
	}
//	Zero parameterized constructor
	public AnimalClass() { // this is actually a specialized getter method (constructor) with same name as its class name.
		super(); // it promotes taking control from child class constructor to parent class constructor.
		this.name= "Sachin";
		this.breed= "GermanShepherd";
		this.color= "Brown";
		this.cost= 3000;
		System.out.println("content after execution of 0 parameterized constructor");
		System.out.println(this.name);
		System.out.println(this.breed);
		System.out.println(this.color);
		System.out.println(this.cost);
		System.out.println("========================================================");
	}
	void getData() {
		System.out.println("this is getData method");
		 System.out.println(name);
		 System.out.println(breed);
		 System.out.println(color);
		 System.out.println(cost);
		 
	 }
	
}
public class Constructors33 {
	public static void main(String[] args) {
		AnimalClass An= new AnimalClass(); // creating object where call of constructor takes place
		An.getData();
		AnimalClass An1= new AnimalClass("Doggy");
		An1.getData();
	}
}
