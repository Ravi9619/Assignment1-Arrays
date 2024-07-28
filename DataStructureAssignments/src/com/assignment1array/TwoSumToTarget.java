/*
Given an array of integers nums and an integer target, 
return indices of the two numbers such that they add up to target.
You may assume that each input would have exactly one solution, 
and you may not use the same element twice.
You can return the answer in any order.
Input: nums = [2,7,11,15], target = 9
Output= [0,1]
 */

package com.assignment1array;

public class TwoSumToTarget {
	
	static int[] getIndicesOfNumToTargetSum(int[] nums, int k) {
		
		int n = nums.length;
		int[] minmaxindices = new int[2];
		int i = 0;
		for (int j = 1; j < n; j++) {
			if (nums[i] + nums[j] == k) {
				minmaxindices[i] = i;
				minmaxindices[i+1] = j;
				break;
			}
		}
		return minmaxindices;
	}

	public static void main(String[] args) {
		
		int[] nums = {2,7,11,15};
		int target = 9;
		
		int[] targetSum = getIndicesOfNumToTargetSum(nums, target);
		
		for (int n : targetSum) {
			System.out.print(n+" ");
		}

	}

}
