
public class RaceCondition {

	public static void main(String[] args) {
		MsOffice ms1 = new MsOffice();
		ms1.setName("typing");
		MsOffice ms2 = new MsOffice();
		ms2.setName("saving");
		MsOffice ms3 = new MsOffice();
		ms3.setName("spellCheck");
		
		ms1.start();
		ms2.start();
		ms3.start();
		
		
	}

}
class MsOffice extends Thread{
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


