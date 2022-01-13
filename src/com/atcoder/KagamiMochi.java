package com.atcoder;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

/**
 * 
 * AtCoder Beginners SelectionのKagamiMochiの解答
 *
 */
public class KagamiMochi {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		List<Integer> intList = new ArrayList<>();
		for(int i = 0; i < n; i++) {
			int a = sc.nextInt();
			intList.add(a);
		}
		int result = kagamiMochi(n, intList);
		System.out.println(result);

	}
	
	public static int kagamiMochi(int n, List<Integer> intList) {
		intList = intList.stream()
				.distinct()
				.collect(Collectors.toList());
		
		int size = intList.size();
		
		return size;
	}

}
