package PolymorphismExamples;

class Plane {
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
class CargoPlane extends Plane{
	@Override
	void fly() {
		System.out.println("Cargo plane at low heights ");
	}
	void carrygoods() {
		System.out.println("Cargo plane carry goods ");
	}
}
class PassengerPlane extends Plane{
	@Override
	void fly() {
		System.out.println("Passenger plane at medium heights ");
	}
	void carryhumans() {
		System.out.println("Passenger plane carry humans ");
	}
}
class FighterPlane extends Plane{
	@Override
	void fly() {
		System.out.println("Fighter plane at high heights ");
	}
	void carryweapons() {
		System.out.println("Fighter plane carry weapons ");
	}
}
class Airport{ // to make code more efficient 
	void permit(Plane ref) {
		ref.takeoff();
		ref.land();
		ref.fly();
	}
}
public class CondensedPolymorphism {

	public static void main(String[] args) {
		CargoPlane cp = new CargoPlane();
		PassengerPlane pp = new PassengerPlane();
		FighterPlane fp = new FighterPlane();
		Airport a = new Airport(); // it helps in improving
		System.out.println("Cargo plane data is : ");
		a.permit(cp);
		cp.carrygoods();
		System.out.println("=============");
		System.out.println("Passenger plane data is : ");
		a.permit(pp);
		pp.carryhumans();
		System.out.println("=============");
		System.out.println("Fighter plane data is : ");
		a.permit(fp);
		fp.carryweapons();
		System.out.println("=============");
	}

}