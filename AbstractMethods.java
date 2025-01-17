// 27/11/24

package Practice11;
	abstract class Plane{
		void TakeOff() {
			System.out.println("Plane took off in took off method");
		}
		abstract void fly();
		abstract void land();
	}
	class CargoPlane extends Plane{
		@Override
		void fly() {
			System.out.println("Cargo plane takes long runway");
		}
		void land() {
			System.out.println("Cargo plane takes long runway");
		}
	}
	class PassengerPlane extends Plane{
		@Override
		void fly() {
			System.out.println("PassengerPlane takes medium runway");
		}
		void land() {
			System.out.println("PassengerPlane takes medium runway");
		}
	}
	class fighterPlane extends Plane{
		@Override
		void fly() {
			System.out.println("fighterPlane plane takes short runway");
		}
		void land() {
			System.out.println("fighterPlane plane takes short runway");
		}
	}
	
	class Airport{
		void permit(Plane ref) {
			ref.TakeOff();
			ref.fly();
			ref.land();
			
		}
	}
	public class AbstractMethods{
	public static void main(String[] args) {
		 CargoPlane cp = new CargoPlane();
	        PassengerPlane pp = new PassengerPlane();
	        fighterPlane fp = new fighterPlane();

	        Airport a = new Airport();

	        a.permit(fp);
	        a.permit(pp);
	        a.permit(cp);

	
	}
}

