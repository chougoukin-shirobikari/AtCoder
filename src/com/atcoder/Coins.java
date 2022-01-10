package com.atcoder;

import java.util.Scanner;

public class Coins {

	public static void main(String[] args) {
		/**
		int a1 = 2;
		int b1 = 2;
		int c1 = 2;
		int x1 = 100;
		
		int a2 = 5;
		int b2 = 1;
		int c2 = 0;
		int x2 = 150;
		
		int a3 = 30;
		int b3 = 40;
		int c3 = 50;
		int x3 = 6000;
		**/
		
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		int x = sc.nextInt();
		
		int result = coins(a, b, c, x);
		System.out.println(result);
		
		/**
		int result1 = coins(a1, b1, c1, x1);
		int result2 = coins(a2, b2, c2, x2);
		int result3 = coins(a3, b3, c3, x3);
		
		System.out.println(result1);
		System.out.println(result2);
		System.out.println(result3);
		**/

	}
	
	public static int coins(int a, int b, int c, int x) {
		
		int count = 0;
		
		for(int i = 0; i <= a; i++) {
			int sum_i = 500 * i;
			
			for(int j = 0; j <= b; j++) {
				int sum_j = sum_i + (100 * j);
				
				for(int k = 0; k <= c; k++) {
					int sum_k = sum_j + (50 * k);
					
					if(sum_k == x) {
						count++;
					}
				}
			}
		}
		
		return count;
	}

}




