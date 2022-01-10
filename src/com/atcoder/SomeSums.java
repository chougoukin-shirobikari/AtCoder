package com.atcoder;

import java.util.Scanner;

public class SomeSums {

	public static void main(String[] args) {
		int n1 = 20;
		int a1 = 2;
		int b1 = 5;
		
		int n2 = 10;
		int a2 = 1;
		int b2 = 2;
		
		int n3 = 100;
		int a3 = 4;
		int b3 = 16;
		
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int a = sc.nextInt();
		int b = sc.nextInt();
		int result = someSums(n, a, b);
		System.out.println(result);
		
		int result1 = someSums(n1, a1, b1);
		int result2 = someSums(n2, a2, b2);
		int result3 = someSums(n3, a3, b3);
		
		System.out.println(result1);
		System.out.println(result2);
		System.out.println(result3);

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
