package com.atcoder;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class LongestSegment {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[][] deepArray = new int[n][];
		for(int i = 0; i < n; i++) {
			int[] array = new int[2];
			int x = sc.nextInt();
			int y = sc.nextInt();
			array[0] = x;
			array[1] = y;
			deepArray[i] = array;
		}
		
		double num = longestSegment(n, deepArray);
		System.out.println(num);
		
	}
	
	public static double longestSegment(int n, int[][] deepArray) {
		List<Integer> intList = new ArrayList<>();
		
		for(int i = 0; i < n - 1; i++) {
			int p = i;
			for(int j = p + 1; j < n; j++) {
				int[] array1 = deepArray[i];
				int[] array2 = deepArray[j];
				
				int a = (array1[0] - array2[0]) * (array1[0] - array2[0]);
				int b = (array1[1] - array2[1]) * (array1[1] - array2[1]);
				int c = a + b;
				intList.add(c);
			}
		}
		
		int c_max = Collections.max(intList);
		double num = Math.sqrt(c_max);
		return num;
		
	}

}
