package oct23;
class Producer1 extends Thread{
	Queue1 a;
	public Producer1(Queue1 q) {
		a=q;
	}
	@Override
	public void run() {
		int i=1;
		while(true) {
			a.produce(i++);
		}
	}
}
class Consumer1 extends Thread{
	Queue1 b;
	public Consumer1(Queue1 q) {
		b=q;
	}
	@Override
	public void run() {
		while(true) {
			b.consume();
		}
	}
}
class Queue1{
	int x;
	boolean value_of_x=false;
	synchronized public void produce(int i) {
		try {
			if(value_of_x==false) {
		x=i;
		System.out.println("producer has produced the data "+i+"from x");
		value_of_x=true;
		notify();
			}
			else {
				wait();
			}
		}catch(Exception e) {
			e.printStackTrace();
		}
	}
	synchronized public void consume() {
		try {
			if(value_of_x==true) {
		System.out.println("consumer has consumed the data "+x+"into x");
		value_of_x=false;
		notify();
			}
			else {
				wait();
			}
		}catch(Exception e) {
			e.printStackTrace();
		}
	}
}
public class producerconsumersolution {

	public static void main(String[] args) {
		Queue1 q = new Queue1();
		Producer1 p1 = new Producer1(q);
		Consumer1 c1 = new Consumer1(q);
		p1.start();
		c1.start();
	}

}