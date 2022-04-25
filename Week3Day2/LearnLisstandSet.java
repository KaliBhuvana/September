package Week3Day2;

import java.util.ArrayList;
import java.util.List;

public class LearnLisstandSet {
	public static void main(String[] args) {

		// List<Integer> num= new ArrayList<Integer>();
		// Create the empty list
		List<String> str = new ArrayList<String>();
		// add the value

		str.add("Apple");
		str.add("Mango");
		str.add("Jackfruit");
		str.add("Strawberry");
		// To find size
		int size = str.size();
		System.out.println(size);
//getting an eement
		System.out.println("One of the List element:" + str.get(1));

//Print the list
		System.out.println(str);
		for (int i = 0; i < size; i++) {

			System.out.println(str.get(i));

		}

		// foreach method-We cannot use get method here bcz for each loop does not have
		// an index

//	for (String string : str) {

		System.out.println("*******Using foreach loop:******");
		for (String fruitsName : str) {

			System.out.println(fruitsName);

		}
		
		//insert based on the position
		str.add(2, "Guava");
		str.add("Guava");
		System.out.println("*******Using foreach loop: Duplicate ellement add******");
		for (String fruitsName : str) {

			System.out.println(fruitsName);

		}
		
		//remove an entry
		
		str.remove(2);
		System.out.println("*******remove particular index******");
		for (String fruitsName : str) {

			System.out.println(fruitsName);

		}
		
str.clear();
System.out.println("*******Completely clear:******");
for (String fruitsName : str) {

	System.out.println(fruitsName);

	}
//No exception thrown when we try to access the empty list
}
}