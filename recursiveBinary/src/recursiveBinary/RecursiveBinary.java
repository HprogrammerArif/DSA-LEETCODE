package recursiveBinary;

public class RecursiveBinary {

	public static void main(String[] args) {
		int nums [] = {3, 5, 6, 9, 11, 12, 17, 33, 66};
		int target = 11;
		
		int result = binarySearch(nums, target, 0, nums.length-1);
		if(result != -1) {
			System.out.println("Target Found At Index: " + result);
		} 
		else {
			System.out.println("Target Not Found");
		}

	}

	public static int binarySearch(int[] nums, int target, int left, int right) {
		
		if(left <= right) {
			int mid = (left+right)/2;
			if(nums[mid] == target) {
				return mid;
			}
			else if(nums[mid] <target) {
				//left = mid+1;
				return binarySearch(nums, target, left=mid+1, right);
			}
			else {
				//right = mid-1;
				return binarySearch(nums, target, left, right=mid-1);
			}
		}
		
		return -1;
	}

}
