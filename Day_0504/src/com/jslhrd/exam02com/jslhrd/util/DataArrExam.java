package com.jslhrd.exam02com.jslhrd.util;

public class DataArrExam {
	public static void main(String[] args) {
		Data data = new DataArrPro();
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

		//int max2 = data.getMaxArr(new int[] {7,9,4,7,3,6});
		//int min2 = data.getMinArr(new int[] {7,9,4,7,3,6});
		//int sum2=data.getSum(new int[] {7,9,4,7,3,6});
		
		DataArr arr = new DataArrPro();
		int max2 = arr.getMax(1,2,3,4,5);
		System.out.println("max=" + max);
		int min2 = arr.getMin(1,2,3,4,5);
		System.out.println("min=" + min);
		
		int sum2 = arr.getSum(1,2,3,4,5);
		System.out.println("sum=" + sum);
		
		int score2[] = {9,4,7,2,8,5,6};
		System.out.print("score : "  );
		for(int i=0; i<score2.length; i++) {
			System.out.print(score2[i] + "\t");
		}
		System.out.println();
		
		data.sort(score2, true);
		System.out.print("sort asc : "  );
		for(int i=0; i<score2.length; i++) {
			System.out.print(score2[i] + "\t");
		}

		max2 = arr.getMaxArr(new int[] {7,9,4,7,3,6});
		min2 = arr.getMinArr(new int[] {7,9,4,7,3,6});
		sum2=  arr.getSum(new int[] {7,9,4,7,3,6});
		
	}

}
