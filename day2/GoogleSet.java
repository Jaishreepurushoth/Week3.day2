package week3.day2;

import java.util.HashSet;
import java.util.Set;
public class GoogleSet {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String str= "google";
		char[] chars = str.toCharArray();
		
		Set<Character> unique = new HashSet<Character>();
		//	int Length = ,length();
		for ( int i=0; i<chars.length ; i++) {
			unique.add(chars[i]);
		}

		System.out.println(unique);
   }
	}


