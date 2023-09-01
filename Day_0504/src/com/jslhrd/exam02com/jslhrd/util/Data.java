package com.jslhrd.exam02com.jslhrd.util;

public interface Data {
	int getMax(int ... var);
	int getMin(int ... var);
	void sort(int[] var, boolean bool );
	
	default int getSum(int ... var) {
		int sum=0;
		for(int i=0; i<var.length;i++) {
			sum += var[i];
		}
		return sum;
	}
}
