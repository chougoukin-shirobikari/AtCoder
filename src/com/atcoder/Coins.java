package com.atcoder;

import java.util.Scanner;

/**
 * 
 * AtCoder Beginners SelectionのCoinsの解答
 *
 */
public class Coins {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		int x = sc.nextInt();
		
		int result = coins(a, b, c, x);
		System.out.println(result);
		

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




