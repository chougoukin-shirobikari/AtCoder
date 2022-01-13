package com.atcoder;

import java.util.Scanner;

/**
 * 
 * AtCoder Beginners Selectionの白昼夢の解答
 *
 */
public class Hakuchuumu {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		String str = sc.next();
		
		String result = hakuchuumu(str);
		System.out.println(result);

	}
	
	public static String hakuchuumu(String str) {
		if(str.contains("eraser")) {
			str = str.replace("eraser", "");
		}
		if(str.contains("erase")) {
			str = str.replace("erase", "");
		}
		if(str.contains("dreamer")) {
			str = str.replace("dreamer", "");
		}
		if(str.contains("dream")) {
			str = str.replace("dream", "");
		}
		
		if(str.length() == 0) {
			return "YES";
		}else {
			return "NO";
		}
	}

}
