package com.atcoder;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

/**
 * 
 * AtCoder Beginners SelectionのCardCameforTwoの解答
 *
 */
public class CardGameforTwo {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		List<Integer> intList = new ArrayList<>();
		for(int i = 0; i < n; i++) {
			int a = sc.nextInt();
			intList.add(a);
		}
		
		int result = cardGameforTwo(n, intList);
		System.out.println(result);

	}
	
	public static int cardGameforTwo(int n, List<Integer> intList) {
		
		Collections.sort(intList);
		int alice_sum = 0;
		int bob_sum = 0;
		int result;
		if(n % 2 == 0) {
			for(int i = 0; i < n; i++) {
				if(i % 2 == 0) {
					bob_sum = bob_sum + intList.get(i);
				}else {
					alice_sum = alice_sum + intList.get(i);
				}
			}
			
		}else {
			for(int i = 0; i < n; i++) {
				if(i % 2 == 0) {
					alice_sum = alice_sum + intList.get(i);
				}else {
					bob_sum = bob_sum + intList.get(i);
				}
			}
		}
		
		result = alice_sum - bob_sum;
		return result;
	}

}














