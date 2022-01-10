package com.atcoder;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Otoshidama {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int y = sc.nextInt();
		
		List<Integer> result = otoshidama(n, y);
		System.out.println(result.get(0) + " " + result.get(1) + " " + result.get(2));
		
	}
	
	public static List<Integer> otoshidama(int n, int y) {
		int a = n / 10000;
		List<Integer> intList = new ArrayList<>();
		
		label:
		for(int i = a; i >= 0; i--) {
			int p = n - (10000 * i);
			int b = p / 5000;
			
			for(int j = b; j >= 0; j--) {
				int q = p - (5000 * j);
				int c = q / 1000;
				
				for(int k = c; k >= 0; k--) {
					int r = q - (1000 * k);
					if(r == 0 && i + j + k == y) {
						intList.add(i);
						intList.add(j);
						intList.add(k);
						break label;
					}
				}
			}
		}
		
		boolean ans = (intList.size() == 0);
		
		if(ans) {
			intList.add(-1);
			intList.add(-1);
			intList.add(-1);
			return intList;
		}else {
			return intList;
		}
	}

}



