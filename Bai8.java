package KiemTraJavaCore;

import java.util.Arrays;

public class Bai8 {
	public static void main(String[] args) {
		int[][] a = new int[][] {
			{3, 5, 2 , -1},
			{3, 6, 7, 3},
			{-6, -3, 2, 1},
			{6, 3, 8, 4},
			{-4, 5, -3, 2}
		};
		for(int i = 0; i < a.length; i++) {
			System.out.println(Arrays.toString(a[i]));
		}
		System.out.println("Tong cot 2 = " + tongCot(a, 2));
		System.out.println("So luong pt duong = " + demDuong(a));
		System.out.println("So luong pt am tai hang 2 = " + demAmHang(a, 2));
		
		int[] result = new int[2];
		min(a, result);
		System.out.println("Gia tri min: " + a[result[0]][result[1]]);
	
	}
	
	public static int tongCot(int[][] a, int c) {
		int tong= 0;
		for(int i = 0; i < a.length; i++) {
			tong += a[i][c];
		}
		return tong;
	}
	
	public static int demDuong(int[][] a) {
		int count = 0;
		for(int i = 0; i < a.length; i++) {
			for(int j = 0; j < a[i].length; j++) {
				if(a[i][j] > 0) {
					count++;
				}
			}
		}
		return count;
	}
	
	public static int demAmHang(int[][] a, int h) {
		int count = 0;
		for(int i = 0; i < a[h].length; i++) {
			if(a[h][i] < 0) {
				count++;
			}
		}
		return count;
	}
	
	public static void min(int[][] a, int[] result) {
		result[0] = 0;
		result[1] = 0;
		int min = a[result[0]][result[1]];
		for(int i = 0; i < a.length; i++) {
			for(int j = 0; j < a[i].length; j++) {
				if(min > a[i][j]) {
					result[0] = i;
					result[1] = j;
					min = a[result[0]][result[1]]; 
				}
			}
		}
	}
}
