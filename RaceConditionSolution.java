
public class RaceConditionSolution {

	public static void main(String[] args) {
		MsOffice2 ms1 = new MsOffice2();
		ms1.setName("typing");
		MsOffice2 ms2 = new MsOffice2();
		ms2.setName("saving");
		MsOffice2 ms3 = new MsOffice2();
		ms3.setName("spellCheck");
		
		ms2.setPriority(8);
		ms3.setPriority(9);
		
		ms2.setDaemon(true);
		ms3.setDaemon(true);
		
		ms1.start();
		ms2.start();
		ms3.start();
		
		
	}

}
class MsOffice2 extends Thread{
@Override
public void run() {
	if(Thread.currentThread().getName().equals("typing")) {
		spellCheck();
	}else if(Thread.currentThread().getName().equals("spellCheck")) {
		typing();
	}else if(Thread.currentThread().getName().equals("saving")) {
		saving();
		}
	}
public void typing() {
	try {
		for(int i=0;i<=5;i++) {
			System.out.println("typing........");
			Thread.sleep(3000);
		}
	}catch(Exception e) {
		e.printStackTrace();
		}
	}
public void saving() {
	try {
		for(int i=0;i<=5;i++) {
			System.out.println("saving........");
			Thread.sleep(3000);
		}
	}catch(Exception e) {
		e.printStackTrace();
		}
	}
public void spellCheck() {
	try {
		for(int i=0;i<=5;i++) {
			System.out.println("spell Checking........");
			Thread.sleep(3000);
		}
	}catch(Exception e) {
		e.printStackTrace();
		}
	}
}


