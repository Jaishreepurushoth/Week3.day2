package week3.day2;

import java.util.LinkedHashMap;
import java.util.Map;

public class FindIntersection {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] firstArray= {3,2,11,4,6,7};
		int[] secondArray= {1,2,8,4,9,7};
		int lengthOfFirstArray =firstArray.length;
		int lengthOfSecondArray =secondArray.length;
        Map <Integer,Integer> map1 = new LinkedHashMap<Integer,Integer>();
        
        //for loop to iterate through first array
		for(int i=0;i<lengthOfFirstArray;i++) {
			//for loop to iterate through second array{
			for(int j=0;j<lengthOfSecondArray;j++) {
				if(firstArray[i]==secondArray[j]) {
					map1.put(i+1, firstArray[i]);      //storing the (Index,value at index) key value pair of array - matching elements	
				}
			}
		}
		System.out.println("The numbers that match in both arrays: ");
		System.out.println("(position=value at index)");
		System.out.println(map1);
	}

}
