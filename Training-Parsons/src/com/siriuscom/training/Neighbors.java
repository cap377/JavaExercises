package com.siriuscom.training;

public class Neighbors {

	public static void main(String[] args) {
		int[] nums = {4,8,6,1,2,9,4};
		int smallestGap = 10000000;
		int smallestIndex = -1;
		for (int i = 0; i < (nums.length - 1); i++) {
			int gap = (nums[i]-nums[i+1]);
			if (gap < 0) {
				gap = -gap;
			}
			if(gap < smallestGap) {
				smallestGap = gap;
				smallestIndex = i;
			}
		}
		System.out.println(smallestIndex);
	}

}
