package com.yuk.algorithm.numbers;

import java.util.ArrayList;
import java.util.List;

public class Numbers {
	public int getReverseNum(int value) {
		int result = 0;
		while (value != 0) {
			result = (result * 10) + (value % 10);
			value /= 10;
		}
		return result;
	}

	public List<Integer> sepNum(int value) {
		List<Integer> list = new ArrayList<>();
		while (value > 10) {
			list.add(0, value % 10);
			value = value / 10;
		}
		list.add(0, value);
		return list;
	}

	public boolean checkPrime(int value) {
		if (value <= 1)
			return false;
		if (value <= 3)
			return true;
		if (value % 2 == 0 || value % 3 == 0)
			return false;
		for (int i = 5; i * i <= value; i = i + 6) {
			if (value % i == 0 || value % (i + 2) == 0)
				return false;
		}
		return true;
	}

	public int getGCD(int val, int val2) {
		int r = 1;
		if (val < val2) {
			int temp = val;
			val = val2;
			val2 = temp;
		}
		while (r > 0) {
			r = val % val2;
			val = val2;
			val2 = r;
		}
		return val;
	}

	public int getLCM(int val, int val2) {
		return val * val2 / getGCD(val, val2);
	}
}
