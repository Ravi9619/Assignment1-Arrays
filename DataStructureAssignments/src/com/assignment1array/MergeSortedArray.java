package com.assignment1array;

public class MergeSortedArray {

	public static void main(String[] args) {

		int[] nums1 = { 1, 2, 3, 0, 0, 0 };
		int[] nums2 = { 2, 5, 6 };

		int index = nums1.length - 1;

		for (int i = nums2.length - 1; i >= 0; i--) {
			nums1[index--] = nums2[i];
		}

		System.out.println("After Merging...");
		for (int n : nums1) {
			System.out.print(n + " ");
		}
		System.out.println();
		System.out.println("=================");
		for (int i = 0; i < nums1.length; i++) {
			for (int j = i + 1; j < nums1.length; j++) {
				if (nums1[i] > nums1[j]) {

					int temp = nums1[i];
					nums1[i] = nums1[j];
					nums1[j] = temp;

				}
			}
		}

		System.out.println("After Sorting...");

		for (int i : nums1) {
			System.out.print(i + " ");
		}
	}

}