package com.atcoder;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * 
 * AtCoder Beginners SelectionのTravelingの解答
 *
 */
public class Traveling {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[][] deepArray = new int[n + 1][];
		int[] startingPoint = {0, 0, 0};
		deepArray[0] = startingPoint;
		for(int i = 0; i < n; i++) {
			int[] array = new int[3];
			for(int j = 0; j < 3; j++) {
				int a = sc.nextInt();
				array[j] = a;
			}
			deepArray[i + 1] = array;
		}
		
		String result = traveling(n, deepArray);
		System.out.println(result);
		
	}
	
	public static String traveling(int n, int[][] array) {
		
		List<String> strList = new ArrayList<>();
		
		for(int i = 0; i < n; i++) {
			int t = array[i + 1][0] - array[i][0];
			int x = array[i + 1][1] - array[i][1];
			int y = array[i + 1][2] - array[i][2];
			
			int z = Math.abs(x) + Math.abs(y);
			int u = t - z;
			
			if(u % 2 == 0 && t >= z) {
				strList.add("YES");
			}else {
				strList.add("NO");
			}
		}
		
		if(strList.contains("NO")) {
			return "NO";
		}else {
			return "YES";
		}
		
	}

}
