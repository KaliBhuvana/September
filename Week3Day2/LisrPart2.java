package Week3Day2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class LisrPart2 {

	public static void main(String[] args) {
		List<String> str = new ArrayList<String>();
		// add the value

		str.add("Apple");
		str.add("Mango");
		str.add("Jackfruit");
		str.add("Strawberry");
		System.out.println("******Fruit List*******");
		System.out.println(str);
		List<String> str1 = new ArrayList<String>();
		// add the value

		str1.add("DragonFruit");
		str1.add("Pineapple");
		str1.add("Jackfruit");
		str1.add("Strawberry");
		str1.add("Watermelon");
		str1.add("Blueberry");
		System.out.println("******New Fruit List*******");
		System.out.println(str1);
		Collections.sort(str1);
		System.out.println("******sorted Fruit List*******");
		System.out.println(str1);

		Collections.reverse(str1);
		System.out.println("******reverse Fruit List*******");
		System.out.println(str1);
		
	//To remove duplicates from the 1st mentioned value(Str)-removeall	
		//str.removeAll(str1);
	//To find common elements:retainall	
str.retainAll(str1);	
System.out.println("******Retain common Fruit List*******");	
System.out.println(str);
	
		}

}
