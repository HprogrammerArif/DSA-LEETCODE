package linearSearch;

import java.util.Iterator;

public class LinearSearch {

	public static void main(String[] args) {
		
		int nums [] = {3, 5, 6, 9, 12, 17, 33, 66};
		int target = 66;
		
		int result = linearSearch(nums, target);
		if(result != -1) {
			System.out.println("Target Found At Index: " + result);
		} 
		else {
			System.out.println("Target Not Found");
		}
	}

	public static int linearSearch(int[] nums, int target) {
		
		int steps = 0;
		for(int i = 0; i<nums.length; i++) {
			steps ++;
			if(nums[i] == target) {
				System.out.println("Steps taken by linear: " + steps);
				return i;
			}
		}
		System.out.println("Steps taken by linear: " + steps);
		
		return -1;
	}

}
