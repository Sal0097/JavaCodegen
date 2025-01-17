package Practice11;

package PolymorphismExamples;
class Animal{
	void sleep() {
		System.out.println("Animal is Sleeping ");
	}
	void eat() {
		System.out.println("Animal is eating ");
	}
	void breathe() {
		System.out.println("Animal is Breathing ");
	}
}
class Tiger extends Animal{
	@Override
	void eat() {
		System.out.println("tiger is eating");
	}
	void eatanimals() {
		System.out.println("Tiger is eating another animals ");
	}
}
class Rabbit extends Animal{
	@Override
	void eat() {
		System.out.println("Rabbit is eating");
	}
	void eatgrass() {
		System.out.println("Rabbit is eating grass ");
	}
}
class Monkey extends Animal{
	@Override
	void eat() {
		System.out.println("Monkey is eating");
	}
	void eatbananas() {
		System.out.println("Monkey is eating bananas ");
	}
}
class Zoo{
	void cage(Animal ref) {
		ref.sleep();
		ref.breathe();
		ref.eat();
	}
}


public class AnimalPolyCondensed {

	public static void main(String[] args) {
		Tiger t = new Tiger();
		Rabbit r = new Rabbit();
		Monkey m = new Monkey();
		Zoo z=new Zoo();
		System.out.println("Tiger Data and its food : ");
		z.cage(t);
		t.eatanimals();
		System.out.println("==========");
		System.out.println("Rabbit Data and its food : ");
		z.cage(r);
		r.eatgrass();
		System.out.println("==========");
		System.out.println("Monkey Data and its food : ");
		z.cage(m );
		m.eatbananas();
		System.out.println("==========");
		

	}

}