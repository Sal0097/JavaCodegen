
public class DisadvantageMultithread {

	public static void main(String[] args) {
		Human h1 = new Human();
		h1.setName("Boy");
		Human h2 = new Human();
		h2.setName("Girl");
		Human h3 = new Human();
		h3.setName("Other");
		
		h1.start();
		h2.start();
		h3.start();
	}
}
class Human extends Thread{
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
	