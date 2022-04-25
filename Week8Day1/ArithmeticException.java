package Week8Day1;

public class ArithmeticException {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int x=5;
		int y=0;
		int [] num= {1,2,3};
		try {
		System.out.println(x/y);
		System.out.println(num[3]);
		}
		/*catch(ArithmeticException e) {
			
			//e.printStackTrace();
		System.out.println(e);
		}*/
		catch(ArrayIndexOutOfBoundsException e) {
			
			System.out.println(e);

		}
		
		System.out.println("End of the Program");

	}

}