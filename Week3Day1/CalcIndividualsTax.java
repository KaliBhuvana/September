package Week3Day1;

public class CalcIndividualsTax implements InterfacePrac {

	public double incomeAdd(String name, double amount1, double amount2, double HRA) {
		System.out.println("Name:" +name);
		System.out.println("Amount1;" +amount1);
		System.out.println("Amount2;" +amount2);
		System.out.println("HRA;" +HRA);
		return 0;
	}

	public double incomeReduce(String name, double amount1, double amount3) {
		System.out.println("Name:" +name);
		System.out.println("Amount1;" +amount1);
		System.out.println("Amount2;" +amount3);
		return 0;
	}

	public void publishValue() {
		

	}
	


	public static void main(String[] args) {

		CalcIndividualsTax obj=new CalcIndividualsTax();
		
		obj.incomeAdd("Bhuvana", 1000000, 1300000, 14.32000);
		obj.incomeReduce("Bhuvana", 10000, 30000);
		
	}
}