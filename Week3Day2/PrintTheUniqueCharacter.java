package Week3Day2;

import java.util.Set;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.List;

public class PrintTheUniqueCharacter {

	public static void main(String[] args) {
		String str = "PayPal India";

		char[] s = str.toCharArray();
		int length = s.length;
		Set<Character> charSet = new LinkedHashSet<Character>();
		Set<Character> dupCharSet = new LinkedHashSet<Character>();
		for (int i = 0; i < length; i++) {
			charSet.add(s[i]);
			for (int j = 1; j < length; j++) {
				dupCharSet.add(s[j]);
		if(charSet.equals(dupCharSet)) 
				continue;			
			
			}			
		}
		System.out.println(dupCharSet);
		
		
		}
		
	}


