//16Dec2024
import java.util.* ;

public class ProducerConsumerProblem {

	public static void main(String[] args) {
		Queue q= new Queue();
		Producer p = new Producer(q);
		Consumer c = new Consumer(q);
		p.start();
		c.start();
	}

}
class Producer extends Thread{
	Queue a;
	public Producer (Queue q) {
		a=q;
	}
	@Override
	public void run() {
		int i =1;
		while(true) {
			a.produce(i++);
		}
	}
}
class Consumer extends Thread{
	Queue b;
	public Consumer (Queue q) {
		b=q;
	}
	@Override
	public void run() {
		while(true) {
			b.consume();
		}
	}
}
class Queue{
	int x;
	public void produce(int i) {
		x=i;
		System.out.println("Producer has produced data "+i+" into x.");
	}
	public void consume() {
		System.out.println("Consumer has consumed data "+x+" from x.");
	}
}

