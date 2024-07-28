package com.assignment1array;

public class UniqueArray {

	static boolean checkUnique(int[] nums) {
		boolean isUnique = false;
		int index = 0;
		for (int i = 1; i < nums.length; i++) {
			if (nums[index] == nums[i]) {
				isUnique = true;
			}
		}
		return isUnique;
	}

	public static void main(String[] args) {
		int[] nums = {1,2,3,1};
		
		boolean unique = checkUnique(nums);
		System.out.println(unique);
	}

}