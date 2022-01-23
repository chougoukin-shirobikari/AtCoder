package com.atcoder;

import java.util.Scanner;

/**
 * 
 * 1月１５日のコンテストのClimbingTakahashiの解答
 *
 */
public class ClimbingTakahashi {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		int[] h = new int[n];
		for(int i = 0; i < n; i++) {
			int a = sc.nextInt();
			h[i] = a;
		}
		
		int result = climbingTakahashi(n, h);
		System.out.println(result);
		
	}
	
	public static int climbingTakahashi(int n, int[] h) {
		int num = 0;
		for(int i = 0; i < n - 1; i++) {
			int x = h[i];
			int y = h[i + 1];
			
			num = x;
			if(x < y) {
				num = y;
			}else {
				return num;
			}
		}
		
		return num;
	}

}
