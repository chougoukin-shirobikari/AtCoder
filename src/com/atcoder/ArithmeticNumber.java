package com.atcoder;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;
import java.util.StringJoiner;



public class ArithmeticNumber {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		long x = sc.nextLong();
		long result = arithmeticNumber(x);
		
		System.out.println(result);

	}
	
	public static long arithmeticNumber(long x) {
		String str = String.valueOf(x);
		String _str = str.substring(0, 1);
		int num = Integer.valueOf(_str);
		int size = str.length();
		
		List<int[]> arrayList = new ArrayList<>();
		for(int i = 0; i < 10; i++) {
			int[] array = new int[size];
			array[0] = num;
			
			for(int j = 1; j < size; j++) {
				int before = array[j - 1];
				if(before + i < 10) {
					array[j] = before + i;
				}else {
					array[0] = 10;
					continue;
				}
				
			}
			
			if(array[0] < 10) {
				arrayList.add(array);
			}
		}
		
		for(int i = 0; i < 10; i++) {
			int[] array = new int[size];
			array[0] = num + 1;
			
			for(int j = 1; j < size; j++) {
				int before = array[j - 1];
				if(before - i >= 0) {
					array[j] = before - i;
				}else {
					array[0] = 10;
					continue;
				}
				
			}
			
			if(array[0] < 10) {
				arrayList.add(array);
			}
		}
		
		List<Long> intList = new ArrayList<>();
		
		for(int[] array : arrayList) {
			StringJoiner sj = new StringJoiner("");
		    Arrays.stream(array).forEach(i -> sj.add(String.valueOf(i)));
		    long number = Long.valueOf(sj.toString());
		    if(number >= x)
		    intList.add(number);
		}
		
		long num_min = Collections.min(intList);
		
		return num_min;
	}

}
