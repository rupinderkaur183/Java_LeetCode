package examples;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

class Twice {
	public Boolean twiceArray(int[] nums) {
		Set<Integer> s = new HashSet<Integer>();
		
		for(int i = 0; i<nums.length; i++) {
			 if(s.contains(nums[i])) {
				 return true;
			 }
			 else {
				 s.add(nums[i]);
			 }
			
		}
		return false;
		
	}
}
public class IntegerTwiceInArray {

	public static void main(String[] args) {
		/*
		 * Given an integer array nums, return true if any value appears at least twice
		 * in the array, and return false if every element is distinct.
		 * 
		 * Example 1:
		 * 
		 * Input: nums = [1,2,3,1] Output: true
		 */
		int[] arr = new int[] {1,2,3,1};
		Twice tw = new Twice();
		Boolean flag = tw.twiceArray(arr);
		System.out.println(flag);

	}

}
