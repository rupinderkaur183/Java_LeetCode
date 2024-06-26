package examples;

import java.util.*;

class Sol {
	public int[] twoSum(int[] nums, int target) {
		
		 Map<Integer,Integer> mp = new HashMap<Integer,Integer>();
	        for(int i = 0; i<nums.length; i++){
	            int diff = target - nums[i];
	            	if(mp.containsKey(diff)) {
	            		return new int[] {mp.get(diff),i};
	            	}
	            	mp.put(nums[i],i);
		}
		
		
		return null;
		
	}
}

public class TwoSumProblem {

	public static void main(String[] args) {
		// Given an array nums = [2,7,11,15] and Integer Target
		// Output should be return indices of two NUmbers add upto Target Number
		// output = [0,1]
		
		Sol s = new Sol(); 
		int[] nums = new int[] {2,11,7,15};
		int target = 9; 
		int[] a = s.twoSum(nums, target);
		System.out.println(Arrays.toString(a));
		

	}

}
