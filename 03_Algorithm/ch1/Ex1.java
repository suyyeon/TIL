package ch1;

import java.util.Scanner;

// 연습문제
public class Ex1 {
	public static void main(String[] args) {

		System.out.println(max4(12, 56, 78, 23));
		System.out.println(min3(12, 56, 23));
		System.out.println(min4(12, 56, 78, 23));

	}

	public static int max4(int a, int b, int c, int d) {

		int max = a;

		if (b > max)
			max = b;

		if (c > max)
			max = c;

		if (d > max)
			max = d;

		return max;
	}

	public static int min3(int a, int b, int c) {

		int min = a;

		if (b < min)
			min = b;

		if (c < min)
			min = c;

		return min;
	}

	public static int min4(int a, int b, int c, int d) {

		int min = a;

		if (b < min)
			min = b;

		if (c < min)
			min = c;

		if (d < min)
			min = d;
		
		return min;
	}
}

