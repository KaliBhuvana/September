package Week3Day1;

public class LearnOverload {
	
	public void add(int a, int b) {
		int c=a+b;
		System.out.println("add2;" +c);
		
		}
	public void add(int a, int b, int c) {
		
		int d=a+b+c;
		System.out.println("add3;" +d);
		
	}
	
	public void multi(int a, int b) {
		
		int c=a*b;
		
		System.out.println("multi1;" +c);
		}
	
public void multi(int a, double b) {
		
		double c=a*b;
		
		System.out.println("multi2;" +c);
}

public void subs(int a, int b) {
	
	int c=a-b;
	
	System.out.println("subs;" +c);
	}
public void subs(double a, double b) {
	
	double c=a-b;
	
	System.out.println("subs2;" +c);
}

public void div(int a, double b) {
	
	double c=a/b;
	System.out.println("subs;" +c);
}
	public static void main(String[] args) {

		LearnOverload ol=new LearnOverload();
		ol.add(5, 6);
		ol.add(7, 8, 9);
		ol.multi(7, 8);
		ol.multi(4, 4.33);
		ol.subs(10.5, 5.5);
	ol.div(5, 10.5);
	}
}