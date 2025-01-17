package Pkg1;

class baji {
	static int a,b,c;
	int p,q,r;
	
	static {
		a=300; 
		b=500;
		c=600;
	}
	{
		p=4000;
		q=8000;
		r=2311;
	}
	static void display() {
		System.out.println(a);
		System.out.println(b);
		System.out.println(c);
	}
	void display2() {
		System.out.println(a);
		System.out.println(b);
		System.out.println(c);
		System.out.println(p);
		System.out.println(q);
		System.out.println(r);
	}
}
public class bujji{
	public static void main(String[] args) {
		System.out.println(a);
		System.out.println(b);
		System.out.println(c);
	}
}
