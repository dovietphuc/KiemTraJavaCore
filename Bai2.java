package KiemTraJavaCore;

import java.util.Scanner;

public class Bai2 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		float a = sc.nextFloat();
		float b = sc.nextFloat();
		float c = sc.nextFloat();
		System.out.println("TBC = " + tbc(a, b, c));
		System.out.println("TBN = " + tbn(a, b, c));
	}
	
	public static float tbc(float a, float b, float c) {
		return (a + b + c) /3;
	}
	
	public static double tbn(float a, float b, float c) {
		return Math.pow(a * b * c, 1/3f);
	}
}
