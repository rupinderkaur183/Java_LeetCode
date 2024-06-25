package examples;

import java.util.Arrays;

class Solution {
	public int[] duplicateZero(int[] arr) {
		
		for(int i = 0; i<arr.length; i++) {
			if(arr[i]== 0 && i+1<arr.length) {
				for(int j = arr.length-1; j>i+1; j--) {
					arr[j]= arr[j-1];
				}
				arr[i+1] = 0;
				i = i+1;
			}
		}
		
		
		return arr;
		
	}
}

public class DuplicateZeroOccurrence{

	public static void main(String[] args) {
		/*
		 * Given a fixed-length integer array arr, duplicate each occurrence of zero,
		 * shifting the remaining elements to the right.
		 * Input: arr = [1,0,2,3,0,4,5,0] Output: [1,0,0,2,3,0,0,4]
		 */
		Solution s = new Solution(); 
		int[] input = new int[] {1,0,2,3,0,4,5,0};
		int[] a = s.duplicateZero(input);
		System.out.println(Arrays.toString(a));
	}
}
