package com.atcoder;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class PrefixK_thMax {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int k = sc.nextInt();
		List<Integer> intList = new ArrayList<>();
		for(int i = 0; i < n; i++) {
			int a = sc.nextInt();
			intList.add(a);
		}
		
		List<Integer> resultList = prefixK_thMax(n, k, intList);
		for(int result : resultList) {
			System.out.println(result);
		}

	}
	
	public static List<Integer> prefixK_thMax(int n, int k, List<Integer> intList) {
		
		List<Integer> resultList = new ArrayList<>();
		for(int i = k; i < n + 1; i++) {
			List<Integer> subList = intList.subList(0, i);
			Collections.sort(subList);
			Collections.reverse(subList);
			int num = subList.get(k - 1);
			resultList.add(num);
		}
		return resultList;
	}

}
