package KiemTraJavaCore;

public class Bai4 {
	public static void main(String[] args) {
		for(int i = 100; i <= 999; i++) {
			int donVi = i % 10;
			int hangChuc = (i % 100) / 10;
			int hangTram = i / 100;
			if(donVi + hangChuc + hangTram == 10) {
				System.out.println(i);
			}
		}
	}
}
