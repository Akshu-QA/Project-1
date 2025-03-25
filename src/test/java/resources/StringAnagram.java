package resources;

public class StringAnagram {

	public static void main(String[] args) {
		String s = "abcbcd";
		String rev = ""; 

		for (int i = s.length() - 1; i >= 0; i--) {
			rev = rev + s.charAt(i);
		}//abcdcba
		if(s.equals(rev)) {
			System.out.println("yes anagram");
		}
		else {
			System.out.println("not anagram");
		}

	}

}
