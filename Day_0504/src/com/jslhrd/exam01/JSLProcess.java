package com.jslhrd.exam01;

public interface JSLProcess {
	public abstract int max(int a, int b);
	
	int min(int a, int b);
	
	int max(int ... a);
	
	int min(int ... a);
	
	default int sum(int ...val) {
		int s=0;
		for(int i=0; i<val.length; i++)
			s += val[i];
		
		return s;
	}
}
