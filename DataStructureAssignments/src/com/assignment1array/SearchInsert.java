/*
Given a sorted array of distinct integers and a target value, return the index if the target is found. 
If not, return the index where it would be if it were inserted in order.
You must write an algorithm with O(log n) runtime complexity.

**Example 1:**
Input: nums = [1,3,5,6], target = 5
Output: 2
 */
package com.assignment1array;

public class SearchInsert {

	static int getIndexOfTarget(int[] nums, int k) {
		int start = 0;
		int end = nums.length - 1;
		
		while (start <= end) {
			int mid = (start + end)/2;
			if (nums[mid] == mid) {
				return mid;
			}if (nums[mid] < k) {
				start = mid + 1;
			}else {
				end = mid - 1;
			}
		}
		return start;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] nums = { 1, 3, 5, 6 };
		int target = 4;
		int index = getIndexOfTarget(nums, target);
		System.out.println(index);
	}

}
