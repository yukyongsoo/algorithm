package com.yuk.algorithm.strings;

public class Strings {
	public String makepointComma(long value,int point) {
		StringBuilder sb = new StringBuilder();
		char[] c = String.valueOf(value).toCharArray();
		int index = 0;
		for(int i = c.length-1; i > -1; i --) {
			if(index == point) {
				index = 0;
				sb.append(",");
			}
			sb.append(c[i]);
			index++;
		}
		return sb.reverse().toString();
	}
	
	public int atoi(String data){
		int value = 0;
		int positive = 1;
		char arr[] = data.toCharArray();
		if(arr[0] == '-')
			positive = -1;
		for(char c : arr) {
			if(c > '0' && c < '9')
				value = value * 10 + (c - '0');
		}
		return value*positive;
	}
	
	public String itoa(int val, int radix) {
		StringBuilder builder = new StringBuilder();
		while(val > 0) {
			if(radix <= 10)
				builder.append((char)((val % radix) + '0'));
			else {
				int t = val % radix;
				if (t <= 9)
					builder.append((char)(t + '0'));
				else
					builder.append((char)(t - 10 + 'a'));
			}

			val /= radix;
		}
		return builder.reverse().toString();
	}
}
