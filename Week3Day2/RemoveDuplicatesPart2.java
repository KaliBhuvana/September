package Week3Day2;

import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

public class RemoveDuplicatesPart2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String text = "We learn java basics as part of java sessions in java week1";
		char[] s = text.toCharArray();
		Set<Character> str = new LinkedHashSet<Character>();
		Set<String> str2 = new LinkedHashSet<String>();
	for (int i = 0; i < s.length; i++) {
		str.add(s[i]);
		
	} {
		
		System.out.println(str);
	}
	
	}

}
