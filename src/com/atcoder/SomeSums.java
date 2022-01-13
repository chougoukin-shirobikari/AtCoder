package com.atcoder;

import java.util.Scanner;

/**
 * 
 * AtCoder Beginners SelectionのSomeSumsの解答
 *
 */
public class SomeSums {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int a = sc.nextInt();
		int b = sc.nextInt();
		int result = someSums(n, a, b);
		System.out.println(result);

	}
	
	public static int someSums(int n, int a, int b) {
		int result = 0;
		
		for(int i = 1; i <= n; i++) {
			int num = i;
			int sum = 0;
	
			while(num != 0) {
				sum = sum + num % 10;
				num = num / 10;
				
			}
			if(sum >= a && sum <= b) {
				result = result + i;
			}
		}
		
		return result;
	}

}
