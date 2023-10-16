package KiemTraJavaCore;

public class Bai5 {
	public static void main(String[] args) {
		System.out.println(findMax("facebook.com"));
	}
	
	public static char findMax(String s) {
		char maxChar = s.charAt(0);
		int maxCount = countChar(s, maxChar);
		
		for(int i = 1; i < s.length(); i++) {
			char nextChar = s.charAt(i);
			int nextCount = countChar(s, nextChar);
			if(nextCount > maxCount) {
				maxChar = nextChar;
				maxCount = nextCount;
			}
		}
		
		return maxChar;
	}
	
	public static int countChar(String s, char c) {
		int count = 0;
		
		for(int i = 0; i < s.length(); i++) {
			if(s.charAt(i) == c) {
				count++;
			}
		}
		
		return count;
	}
}
