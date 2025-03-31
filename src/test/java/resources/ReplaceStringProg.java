package resources;

import java.util.HashMap;

public class ReplaceStringProg {

	public static void main(String[] args) {

		String s = "Automation testing QA Ankit";
		String s1 = "start";
		char a[] = s.toCharArray();

//		HashMap<Character, Character> hm = new HashMap<>();
//		hm.put('a', '2');
//		hm.put('A', '2');

		StringBuilder sb = new StringBuilder();
	//	System.out.println(sb.append(s1).append("LT").append(" Akshu"));
		System.out.println(sb.append(s1).insert(2, "X"));

//		for (char ref : a) {
//			sb.append(hm.getOrDefault(ref, ref));
//		}
//
//		System.out.println(sb.toString());
	}

}
