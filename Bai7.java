package KiemTraJavaCore;

import java.util.Arrays;

public class Bai7 {
	public static void main(String[] args) {
		int[] arr = new int[] { 0, 4, -1, 5, 6, 3, -8 };
		System.out.println(Arrays.toString(arr));
		System.out.println("So luong so chan: " + demSoChan(arr));
		System.out.println("Gia tri max: " + arr[max(arr)]);
		sapXep(arr);
		System.out.println(Arrays.toString(arr));
	}
	
	public static int demSoChan(int[] a) {
		int count = 0;
		for(int i = 0; i < a.length; i++) {
			if(a[i] % 2 == 0) count++;
		}
		return count;
	}
	
	public static int max(int[] a) {
		int vtMax = 0;
		int max = a[vtMax];
		
		for(int i = 1; i < a.length; i++) {
			if(max < a[i]) {
				vtMax = i;
				max = a[vtMax];
			}
		}
		
		return vtMax;
	}
	
	public static int min(int[] a, int start) {
		int vtMin = start;
		int min = a[vtMin];
		
		for(int i = start; i < a.length; i++) {
			if(min > a[i]) {
				vtMin = i;
				min = a[vtMin];
			}
		}
		
		return vtMin;
	}
	
	public static void sapXep(int[] a) {
		for(int i = 0; i < a.length; i++) {
			int vtMin = min(a, i);
			int temp = a[i];
			a[i] = a[vtMin];
			a[vtMin] = temp;
		}
	}
	
}
