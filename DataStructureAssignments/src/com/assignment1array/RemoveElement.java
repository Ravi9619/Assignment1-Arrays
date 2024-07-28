package com.assignment1array;

public class RemoveElement {

	static int getNoOfOccurenceofNum(int[] nums, int k) {

		int count = 0;
		for (int i = 0; i < nums.length; i++) {
			if (nums[i] != k) {
				nums[count] = nums[i];
				count++;
			}
		}
		return count;
	}

	public static void main(String[] args) {
		int[] nums = { 3, 2, 2, 3, 5, 5, 5, 5 };
		int count = getNoOfOccurenceofNum(nums, 5);
		System.out.println("Occurence of num in nums Array:: " + count);
	}

}