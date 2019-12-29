package com.yuk.algorithm.dp;

public class Pros {
	public int dp(int[] value) {
		int[] sol = new int[value.length];
		sol[0] = value[0];
		sol[1] = value[1];
		sol[2] = sol[0] + sol[1];
		int noSel, sel;
		for(int i = 3; i < value.length; i++) {
			//part of sol
			noSel = value[i] + value[i-1] + value[i-3];
			sel = value[i] + value[i-2];

			sol[i] = (noSel> sel)? noSel : sel;
		}
		return sol[value.length];
	}
	
	public void bt() {
		
	}
}
