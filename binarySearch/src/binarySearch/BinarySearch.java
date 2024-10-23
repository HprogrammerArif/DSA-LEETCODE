package binarySearch;

public class BinarySearch {

	public static void main(String[] args) {
		int nums [] = {3, 5, 6, 9, 12, 17, 33, 66};
		int target = 33;
		
		int result = binarySearch(nums, target);
		if(result != -1) {
			System.out.println("Target Found At Index: " + result);
		} 
		else {
			System.out.println("Target Not Found");
		}

	}

	public static int binarySearch(int[] nums, int target) {
		int left = 0;
		int right = nums.length-1;
		int steps = 0;
		
		
		while(left <= right) {
			steps ++;
			int mid = (left + right) /2;
			if(nums[mid] == target) {
				System.out.println("Steps taken by binary: " + steps);
				return mid;
			}
			else if (nums[mid] < target) {
				left = mid+1;
			}
			else {
				right = mid-1; 
			}
		}
		System.out.println("Steps taken by binary: " + steps);
		return -1;
		
	
	}

}
