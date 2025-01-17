//
public class ThreadingConcept {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(Thread.currentThread()); //Thread[#1,main,5,main] 
		// [thread number,name,priority(1to10), method where thread is present]
		// default priority is 5
		//threadScheduler is used to manage multiple threads.
		
		Thread t1 = new Thread();
		System.out.println(t1);
		t1.setName("Sahil");// change name of the thread 
		t1.setPriority(3); // change priority of thread
	}
}
