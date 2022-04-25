package Week3Day2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class SortingUsingCollection {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
String[] str= {"HCL", "Wipro", "Aspire Systems","CTS"};
//Create empty List
List<String> StrList=new ArrayList<String>();	
//array to list
StrList.addAll(Arrays.asList(str));
System.out.println(StrList);
Collections.sort(StrList);
System.out.println("Sorted order:" +StrList);
Collections.reverse(StrList);
System.out.println("Sorted in reverse order" +StrList);


	}

}
