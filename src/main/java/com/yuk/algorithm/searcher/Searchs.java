package com.yuk.algorithm.searcher;

public class Searchs {
	public int biSearch(int[] nums,int target) {
		int low = 0 , hi = nums.length, mid = 0;
		while(low <= hi) {
			mid = (low + hi) >>> 1;
			int midV = nums[mid];
			//search find
			if(target == midV)
				return mid;
			//mid bigger than target
			else if(midV > target) {
				hi = mid -1;
			}
			else
				low = ++mid;
		}
		return -mid-1;
	}
}
