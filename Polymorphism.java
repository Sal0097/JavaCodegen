package PolymorphismExamples;
//package oct23;
class Plane1 {
	void takeoff() {
		System.out.println("plane took off");
		}
	void fly() {
		System.out.println("plane is flying");
	}
	void land() {
		System.out.println("plane has landed");
	}
}

class CargoPlane1 extends Plane1{
	@Override   
	// Override method where the child class can access the method of 
	//	parent class and override data in the method(new data) Own implementation.
	void fly() {
		System.out.println("Cargo plane at low heights ");
	}
	void carrygoods() {
		System.out.println("Cargo plane carry goods ");
	}
}
class PassengerPlane1 extends Plane1{
	@Override
	void fly() {
		System.out.println("Passenger plane at medium heights ");
	}
	void carryhumans() {
		System.out.println("Passenger plane carry humans ");
	}
}
class FighterPlane1 extends Plane1{
	@Override
	void fly() {
		System.out.println("Fighter plane at high heights ");
	}
	void carryweapons() {
		System.out.println("Fighter plane carry weapons ");
	}
}


public class Polymorphism {

	public static void main(String[] args) {
		CargoPlane1 cp = new CargoPlane1();
		PassengerPlane1 pp = new PassengerPlane1();
		FighterPlane1 fp = new FighterPlane1();
		Plane1 ref; //parent handle
		System.out.println("Cargo plane data is : ");
		ref=cp;
		ref.takeoff();
		ref.fly();
		ref.land();
		cp.carrygoods();
		System.out.println("===============");
		System.out.println("passenger plane data is : ");
		ref=pp;
		ref.takeoff();
		ref.fly();
		ref.land();
		pp.carryhumans();
		System.out.println("===============");
		System.out.println("Fighter plane data is : ");
		ref=fp;
		ref.takeoff(); 
		ref.fly();
		ref.land();
		fp.carryweapons();
		System.out.println("===============");

	}

}
