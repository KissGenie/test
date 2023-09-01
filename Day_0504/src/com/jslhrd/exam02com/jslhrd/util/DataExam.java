package com.jslhrd.exam02com.jslhrd.util;

public class DataExam {
	public static void main(String[] args) {
		Data data = new DataPro();
		int max = data.getMax(1,2,3,4,5);
		System.out.println("max=" + max);
		int min = data.getMin(1,2,3,4,5);
		System.out.println("min=" + min);
		
		int sum = data.getSum(1,2,3,4,5);
		System.out.println("sum=" + sum);
		
		int score[] = {9,4,7,2,8,5,6};
		System.out.print("score : "  );
		for(int i=0; i<score.length; i++) {
			System.out.print(score[i] + "\t");
		}
		System.out.println();
		
		data.sort(score, true);
		System.out.print("sort asc : "  );
		for(int i=0; i<score.length; i++) {
			System.out.print(score[i] + "\t");
		}
		
	}

}
