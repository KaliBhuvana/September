package Week7Day1;

public class Employee {
	
	int empId;
	String empName;
	String companyName;
	
	Employee(){
		System.out.println("Child-Default Constructor");
		
	}
	Employee(int empId, String empName,String companyName){
		this.empId=empId;
		this.empName=empName;
		this.companyName=companyName;
		
	}

	public static void main(String[] args) {
		//create the object for employee
		Employee emp= new Employee(100, "Hari", "TestLeaf");
		/*System.out.println(emp.empId);
		System.out.println(emp.empId);
		System.out.println(emp.companyName);*/
	}

}
