package com.atcoder;

import java.util.Scanner;

public class AReverse {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int r = sc.nextInt();
		String s = sc.next();
		
		String result = aReverse(n, r, s);
		System.out.println(result);
		
	}
	
	public static String aReverse(int n, int r, String str) {
		
		String substring = str.substring(n - 1, r);
		StringBuilder sb = new StringBuilder(substring);
		sb.reverse();
		String result = str.replace(substring, sb.toString());
		
		return result;
	}

}
