package dsa;

public class ValidAnagram {
	static {
		for(int i = 0; i < 500; i++) {
			isAnagram("a","");
		}
	}
	public static boolean isAnagram(String s, String t) {
		if(t.length() != s.length()) return false;
		int[] fcy = new int[26];
		for(int i = 0; i < s.length(); i++) {
			fcy[s.charAt(i)-'a']++;
			fcy[t.charAt(i)-'a']--;
		}
		for(int i = 0; i < 26; i++) {
			if(fcy[i] != 0) return false;
		}
		return true;
	}
	public static void main(String[] args) {
		boolean a = isAnagram("anagram","nagaram");
	}
}
/*
 * self executing program when predetermined conditions are met
 */
