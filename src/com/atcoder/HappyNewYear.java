package com.atcoder;

import java.math.BigInteger;
import java.util.Scanner;

/**
 * 
 *１月８日のコンテストのHappyNewYearの解答
 *
 */
public class HappyNewYear {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		long k = sc.nextLong();
		
		BigInteger result = happyNewYear(k);
		System.out.println(result);
		
	}
	
	public static BigInteger happyNewYear(long k) {
		String binary = Long.toBinaryString(k);
		String _binary = binary.replace("1", "2");
		BigInteger num = new BigInteger(_binary);
		
		return num;
	}

}
