package com.atcoder;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * 
 * １２月２４日 Count Interval の解答
 *
 */
public class CountInterval {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		long k = sc.nextLong();
		long[] a = new long[n];
		for(int i = 0; i < n; i++) {
			a[i] = sc.nextLong();
		}
		
		long result = countInterval(n, k, a);
		System.out.println(result);
		

	}
	
	public static long countInterval(int n, long k, long[] a) {
		List<Long> longList = new ArrayList<>();
		int count = 0;
		for(long element : a) {
			longList.add(element);
		}
		
		for(int i = 0; i < n; i++) {
			for(int j = i + 1; j < n + 1; j++) {
				List<Long> subList = longList.subList(i, j);
				
				int size = subList.size();
				long sum = 0;
				for(int l = 0; l < size; l++) {
					sum = sum + subList.get(l);
				}
				
				if(sum == k) {
					count++;
				}
			}
		}
		
		return count;
	}

}
