package com.jslhrd.exam01;

public class ExamProcess implements JSLProcess {

	@Override//어노테이션
	public int max(int a, int b) {
		return (a>b)?a:b;
	}

	@Override
	public int min(int a, int b) {
		int min=0;
		if(a>b)
			min=b;
		else
			min=a;
		return min;
	}

	@Override
	public int max(int... a) {
		int max=a[0];
		for(int i=1; i<a.length;i++) {
			if(max < a[i])
				max=a[i];
		}
		return max;
	}

	@Override
	public int min(int... a) {
		// TODO Auto-generated method stub
		return 0;
	}

}
