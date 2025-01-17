import java.util.*;

public class MultithreadingSingleRun {

	public static void main(String[] args) {
		Operations o1 = new Operations();
		o1.setName("add");
		Operations o2 = new Operations();
		o2.setName("mul");
		Operations o3 = new Operations();
		o3.setName("print1");
		Operations o4 = new Operations();
		o4.setName("print2");
		 o1.start();
		 o2.start();
		 o3.start();
		 o4.start();
	}
}
class Operations extends Thread{
	@Override
	public void run() {
		if(Thread.currentThread().getName().equals("add")) {
			add();
		}else if(Thread.currentThread().getName().equals("mul")) {
			mul();
		}else if(Thread.currentThread().getName().equals("print1")) {
			print1();
		}else if(Thread.currentThread().getName().equals("print2")) {
			print2();
		}
		
	}
	
public void add() {
	try {
		Scanner sc = new Scanner(System.in);
		System.out.println("give 1st number 111111: ");
		int num1 = sc.nextInt();
		System.out.println("give 2st number 222222: ");
		int num2 = sc.nextInt();
		int add = num1+num2;
		System.out.println(add);
	} catch(Exception e) {
		e.printStackTrace();
	}

}

public void mul() {
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
public void print1() {
	try {
		for(int i=1;i<=5;i++) {
			System.out.println("I love india");
			Thread.sleep(3000);
		}
	} catch(Exception e) { 
		e.printStackTrace();
	}

}
public void print2() {
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