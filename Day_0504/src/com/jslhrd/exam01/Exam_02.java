package com.jslhrd.exam01;

public class Exam_02 {
	public static void main(String[] args) {
		JSLProcess jsl1 = new ExamProcess();
		int m = jsl1.max(10,20);
		System.out.println("max=" + m);
		System.out.println("min=" + jsl1.min(90,50));
		
		m = jsl1.max(10,70,90,70,88,55,66);
		System.out.println("max=" + m);
		System.out.println("min=" + jsl1.min(4,6,3,9,8,6));
		int s = jsl1.sum(1,2,3,4,5,6,7,8,9,10);
		System.out.println("sum=" + s);

		JSLProcess jsl2 = new TestProcess();
		m = jsl2.max(10,20);
		System.out.println("max=" + m);
		System.out.println("min=" + jsl2.min(90,50));
		
		m = jsl2.max(10,70,90,70,88,55,66);
		System.out.println("max=" + m);
		System.out.println("min=" + jsl2.min(4,6,3,9,8,6));
		s = jsl2.sum(1,2,3,4,5,6,7,8,9,10);
		System.out.println("sum=" + s);
		
	}

}
