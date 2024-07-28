package com.assignment1array;

public class MismatchNumbers {

	static int[] findDuplicateNumbers(int[] nums) {
		int dup = -1, missing = -1;

		for (int i = 1; i <= nums.length; i++) {
			int count = 0;
			for (int j = 0; j < nums.length; j++) {
				if (nums[j] == i) {
					count++;
				}
			}
			if (count == 2) {
				dup = i;
			} else if (count == 0) {
				missing = i;
			}
		}

		return new int[] { dup, missing };
	}

	public static void main(String[] args) {
		int[] nums = { 1, 2, 2, 4, 5, 6, 5 };

		int[] numbers = findDuplicateNumbers(nums);

		for (int n : numbers) {
			System.out.print(n + " ");
		}

	}

}