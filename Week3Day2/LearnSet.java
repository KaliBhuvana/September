package Week3Day2;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class LearnSet {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("****UsingHashSet*****");	
		//Set<String> animals=new HashSet<String>();
	//	Set<String> animals=new LinkedHashSet<String>();
		Set<String> animals=new TreeSet<String>();
		animals.add("Tiger");
		animals.add("Monkey");
		animals.add("Lion");
		boolean add = animals.add("Leopard");
		System.out.println(add);
		
	for (String eachAnimals : animals) {
		System.out.println(eachAnimals);
		
	}
	animals.add("Leopard");
	System.out.println("***Add Dupicates-It does not allow the dupicates***");
	for (String eachAnimals : animals) {
		System.out.println(eachAnimals);
		boolean add1 = animals.add("Leopard");
		System.out.println(add1);
		
		
	}
	}

}
