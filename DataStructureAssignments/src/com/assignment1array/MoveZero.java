package com.assignment1array;

public class MoveZero {

	static void moveZeroesToEnd(int[] nums) {

		int index = 0;
		for (int i = 0; i < nums.length; i++) {
			if (nums[i] != 0) {
				nums[index++] = nums[i];
			}
		}

		while (index < nums.length) {
			nums[index++] = 0;
		}
	}

	public static void main(String[] args) {

		int[] nums = { 0, 1, 0, 3, 1, 12 };

		moveZeroesToEnd(nums);

		for (int n : nums) {
			System.out.print(n + " ");
		}
	}

}