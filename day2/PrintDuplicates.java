package week3.day2;

import java.util.Arrays;
import java.util.LinkedHashSet;
import java.util.Set;

public class PrintDuplicates {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		 int[] numbers =  {4,3,6,8,29,1,2,4,7,8};
		  boolean boolAdded;
		  Set <Integer> intHashSet = new LinkedHashSet<Integer>();
		  Set <Integer> intDuplicates=new LinkedHashSet<Integer>();
		  for(int i=0;i<numbers.length;i++) {
			  boolAdded = intHashSet.add(numbers[i]);
			  if (boolAdded==false) { //if the current value is duplicate, add to duplicate list based on boolean return val of add method
				  intDuplicates.add(numbers[i]);			  
			  }
		  }
		  System.out.println("The original Array is: "+Arrays.toString(numbers));
		  System.out.println("The duplicates in the Array are: "+intDuplicates);
	}

}
