package resources;

import java.util.HashMap;

public class ReplaceStringProg {

	public static void main(String[] args) {

		String s = "Automation testing QA Ankit";
		char a[] = s.toCharArray();

		HashMap<Character, Character> hm = new HashMap<>();
		hm.put('a', '2');
		hm.put('A', '2');

		StringBuilder sb = new StringBuilder();

		for (char ref : a) {
			sb.append(hm.getOrDefault(ref, ref));
		}
		
		System.out.println(sb.toString());
	}

}
