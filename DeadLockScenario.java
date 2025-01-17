
public class DeadLockScenario {

	public static void main(String[] args) {
		Warrior2 w1= new Warrior2();
		w1.setName("Rama");
		Warrior2 w2= new Warrior2();
		w2.setName("Ravana");
		w1.start();
		w2.start();
	}

}
class Warrior2 extends Thread{
	String res1 ="AK 47";
	String res2 ="Sniper";
	String res3 ="Pistol";
	@Override
	public void run() {
		if(Thread.currentThread().getName().equals("Rama")) {
			ramaAcquire();
		}else {
			ravanaAcquire();
		}
	}
	public void ramaAcquire() {
		try {
			synchronized(res1){
				System.out.println("Rama has acquired "+res1);
				Thread.sleep(3000);
				synchronized (res2){
					System.out.println("Rama has acquired "+res2);
					Thread.sleep(3000);
					synchronized (res3){
						System.out.println("Rama has acquired "+res3);
						Thread.sleep(3000);
					}
				}
			}
		}catch(Exception e) {
			e.printStackTrace();
		}
	}
	public void ravanaAcquire() {
		try {
			synchronized (res3){
				System.out.println("Ravana has acquired "+res3);
				Thread.sleep(3000);
				synchronized (res2){
					System.out.println("Ravana has acquired "+res2);
					Thread.sleep(3000);
					synchronized (res1){
						System.out.println("Ravana has acquired "+res1);
						Thread.sleep(3000);
					}
				}
			}
		}catch(Exception e) {
			e.printStackTrace();
		}
	}
}

//Thread Rama acquires resources in the order: res1 → res2 → res3.
//Thread Ravana acquires resources in the reverse order: res3 → res2 → res1.
//Suppose the following occurs:(it is random Rama or Ravana can start in begining)
//Rama acquires res1 and starts sleeping.
//Simultaneously, Ravana acquires res3 and starts sleeping.
//Now:
//Rama is waiting for res2 (held by no one yet).
//Ravana is waiting for res1 (held by Rama).
//Both threads are blocked because they are waiting on each other to release the resource, resulting in a deadlock.
