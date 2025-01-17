import java.util.*;
public class MultiThreading {

	public static void main(String[] args) {
		Addition ad= new Addition();
		Multiply ml = new Multiply();
		Print1 p1= new Print1();
		Print2 p2= new Print2();
		
		System.out.println(ad);
		System.out.println(ml);
		System.out.println(p1);
		System.out.println(p2);

		ad.start();
		ml.start();
		p1.start();
		p2.start();
		
	

	}

}
class Addition extends Thread{
	@Override
	public void run() {
		try {
			Scanner sc = new Scanner(System.in);
			System.out.println("give 1st number: ");
			int num1 = sc.nextInt();
			System.out.println("give 2st number: ");
			int num2 = sc.nextInt();
			int add = num1+num2;
			System.out.println(add);
		} catch(Exception e) {
			e.printStackTrace();
		}

	}
}
class Multiply extends Thread{
	@Override
	public void run() {
		try {
			Scanner sc = new Scanner(System.in);
			System.out.println("give 1st number: ");
			int num1 = sc.nextInt();
			System.out.println("give 2st number: ");
			int num2 = sc.nextInt();
			int add = num1*num2;
			System.out.println(add);
		} catch(Exception e) {
			e.printStackTrace();
		}

	}
}
class Print1 extends Thread{
	@Override
	public void run() {
		try {
			for(int i=1;i<=5;i++) {
				System.out.println("I love india");
				Thread.sleep(3000);
			}
		} catch(Exception e) {
			e.printStackTrace();
		}

	}
}
class Print2 extends Thread{
	@Override
	public void run() {
		try {
			for(int i=1;i<=5;i++) {
				System.out.println("I love Football");
				Thread.sleep(3000);
			}
		} catch(Exception e) {
			e.printStackTrace();
		}

	}
}
