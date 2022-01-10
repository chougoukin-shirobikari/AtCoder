package com.atcoder;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Shiftonly {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		List<Integer> intList = new ArrayList<>();
		for(int i = 0; i < n; i++) {
			int a = sc.nextInt();
			intList.add(a);
		}
		
		int result = shiftonly(n, intList);
		System.out.println(result);
	}
	
	public static int shiftonly(int n, List<Integer> intList) {
		
		int count = 0;
		int min = Collections.min(intList);
		
		label:
		while(min != 1) {
				for(int i = 0; i < n; i++) {
					if(intList.get(i) % 2 == 0) {
						intList.set(i, intList.get(i) / 2);
					}else {
						break label;
					}
				}
			min = Collections.min(intList);
			count++;
		}
		
		return count;
		
	}

}
