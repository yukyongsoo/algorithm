package com.yuk.algorithm.maths;

public class Maths {
	public void makeCatalanNum(StringBuilder sb, int num, int open, int close) {
		if (open == 0 && close == 0) {
			return;
		}
		if (open > 0) {
			sb.append("{");
			makeCatalanNum(sb, num + 1, open - 1, close + 1);
		}
		if (close > 0) {
			sb.append("}");
			makeCatalanNum(sb, num + 1, open, close - 1);
		}
	}

	public void permutation(int[] arr, int depth, int legth, int size) {
		if (depth == size) {
			for (int i = 0; i < size; i++) {
				if (i == size - 1)
					System.out.println(arr[i]);
				else
					System.out.print(arr[i] + ",");
			}
			return;
		}
		for (int i = depth; i < legth; i++) {
			int temp = arr[i];
			arr[i] = arr[depth];
			arr[depth] = temp;
			permutation(arr, depth + 1, legth, size);
			temp = arr[i];
			arr[i] = arr[depth];
			arr[depth] = temp;
		}
	}

	public void combination(int arr[], int data[], int start, int end, int index, int size) {
		if (index == size) {
			for (int j = 0; j < size; j++)
				System.out.print(data[j] + " ");
			System.out.println("");
			return;
		}
		for (int i = start; i <= end && end - i + 1 >= size - index; i++) {
			data[index] = arr[i];
			combination(arr, data, i + 1, end, index + 1, size);
		}
	}
	
	public long fibo(int val) {
		long val1=1;
		long val2=0;
		long valnew = 0;
		for(int i = 0 ; i < val; i++) {
			valnew = val1 + val2;
			val2 = val1;
			val1= valnew;
		}
		return valnew;
	}
}
