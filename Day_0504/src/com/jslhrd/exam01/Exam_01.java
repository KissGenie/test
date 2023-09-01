package com.jslhrd.exam01;
//인터페이스: 
interface AA{
	//상수정의
	static final double PI=3.14;
	//추상메소드
	public void test();
	public int sum(int a, int b);
	
	public default void print() {
		System.out.print("test");
	}
	public static void exam() {
		
	}
}
//구현채
class AA_A implements AA{
	@Override
	public void test() {
		// TODO Auto-generated method stub
		
	}
	@Override
	public int sum(int a, int b) {
		// TODO Auto-generated method stub
		return 0;
	}
}

public class Exam_01 {
	public static void main(String[] args) {
		AA_A a = new AA_A();
		
		AA aa = new AA_A();
		
	}

}
