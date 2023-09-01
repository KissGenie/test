package com.jslhrd.exam02com.jslhrd.util;

public interface DataArr extends Data {
	int getMaxArr(int[] var);
	
	int getMinArr(int[] var);
	
	default int getSumArr(int[] var) {
		int sum=0;
		for(int i=0; i<var.length;i++) {
			sum += var[i];
		}
		return sum;
	}
}
