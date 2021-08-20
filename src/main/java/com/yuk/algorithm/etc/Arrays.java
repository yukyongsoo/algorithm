package com.yuk.algorithm.etc;

import java.util.PriorityQueue;

public class Arrays {
	public int maxValueOfSubArray(int[] nums) {
		//min value
		int maxSoFar = -100000 , maxEndHere = -100000;

		for(int i = 0 ; i < nums.length; ++i) {
			// 기존 값에서 큰 값이면 취하는 규칙
			maxEndHere = Math.max(maxEndHere + nums[i], nums[i]);
			// 어레이의 앞에서 작은 값들을 버리는 규칙
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

	public void reverseArray(int nums[] , int i , int j){
		while(i < j){
			int temp = nums[i];
			nums[i] = nums[j];
			nums[j] = temp;
			i++;
			j--;
		}
	}
}
