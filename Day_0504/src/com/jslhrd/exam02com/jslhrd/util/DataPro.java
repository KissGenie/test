package com.jslhrd.exam02com.jslhrd.util;

public class DataPro implements Data {
	@Override
	public int getMax(int... var) {
		return 0;
	}

	@Override
	public int getMin(int... var) {
		return 0;
	}

	@Override
	public void sort(int[] var, boolean bool) {
		if(bool)
			ascSort(var);
		else
			descSort(var);
	}
	
	//오름차순
	private void ascSort(int[] var) {
		for(int i=0; i<var.length-1; i++) {
			for(int j=i+1; j<var.length; j++) {
				if(var[i] > var[j]) {
					int t= var[i];
					var[i]=var[j];
					var[j]=t;
				}
			}
		}
	}
	private void descSort(int[] var) {
		
	}
	
}
