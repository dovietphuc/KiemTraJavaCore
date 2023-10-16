package KiemTraJavaCore;

public class Bai6 {
	public static void main(String[] args) {
		String s1 = "ashcbjashihic";
		String s2 = "hi";
		int count = 0;
		while(true) {
			int index = s1.indexOf(s2);
			if(index >= 0) {
				s1 = s1.substring(index + 1, s1.length());
				count++;
			} else {
				break;
			}
			System.out.println(s1);
		}
		System.out.println(count);
	}
}
