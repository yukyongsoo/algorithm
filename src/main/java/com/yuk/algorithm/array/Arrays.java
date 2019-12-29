package com.yuk.algorithm.array;

import java.util.PriorityQueue;

public class Arrays {
	public int maxValueOfSubArray(int[] nums) {
		int maxSoFar = nums[0] , maxEndHere = nums[0];
		for(int i = 0 ; i < nums.length; ++i) {
			maxEndHere = Math.max(maxEndHere + nums[i], nums[i]);
			maxSoFar = Math.max(maxSoFar, maxEndHere);
		}
		return maxSoFar;
	}
	
	public int findKthLargest(int[] nums, int k) {
	    final PriorityQueue<Integer> pq = new PriorityQueue<>();
	    for(int val : nums) {
	        pq.offer(val);
	        if(pq.size() > k) {
	            pq.poll();
	        }
	    }
	    return pq.peek();
	}
}
