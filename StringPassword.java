package Practice11;
import java.util.Scanner;
class logic{
	static int cond1;
	static int cond2;
	static int cond3;
	static int cond4;
	static int cond5;
	void validation(String s) {
		if(s.length()>=6) {
			cond1=1;
			for(int i=0;i<s.length();i++) {
				if((s.charAt(i)>='a' && s.charAt(i)<='z')) {
					cond2=1;
				}
				else if((s.charAt(i)>='A' && s.charAt(i)<='z')) {
					cond3=1;
			}
				else if((s.charAt(i)>='0' && s.charAt(i)<='9')) {
					cond4=1;
				}
				else if((s.charAt(i)>='!' || s.charAt(i)<='@' || s.charAt(i)>='#' || s.charAt(i)<='$' || s.charAt(i)>='%' || s.charAt(i)<='^' || s.charAt(i)>='&' || s.charAt(i)<='*'|| s.charAt(i)>='(' || s.charAt(i)<=')' || s.charAt(i)>='-' || s.charAt(i)<='+')) {
					cond5=1;
			
				}
		}
	}
		else {
			return;
		}
	}
	
	
	
}
public class StringPassword {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String str = sc.nextLine();
		logic l = new logic();
		l.validation(str);
		if(logic.cond1==1 && logic.cond2==1 && logic.cond3==1 && logic.cond4==1 && logic.cond5==1 ) {
			System.out.println("valid and strong password");
		}
		else {
			System.out.println("invalid password");
		}

	}

}
