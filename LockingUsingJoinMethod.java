//14/12/24 
public class LockingUsingJoinMethod {

	public static void main(String[] args) throws InterruptedException {
		Human2 h1 = new Human2();
		h1.setName("Boy");
		Human2 h2 = new Human2();
		h2.setName("Girl");
		Human2 h3 = new Human2();
		h3.setName("Other");
		
		h1.start();
		h1.join();
		h2.start();
		h2.join();
		h3.start();
		h3.join();
	}
}
class Human2 extends Thread{
	public void run() {
		try {
			System.out.println(Thread.currentThread().getName()+ " has entered the bathroom") ;
			Thread.sleep(2000);
			System.out.println(Thread.currentThread().getName()+ " is using bathroom") ;
			Thread.sleep(2000);
			System.out.println(Thread.currentThread().getName()+ " has left the bathroom") ;
			Thread.sleep(2000);
			}catch (Exception e) {
				e.printStackTrace();
			}
		}
	}