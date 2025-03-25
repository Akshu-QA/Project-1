package resources;

import java.util.HashMap;
import java.util.HashSet;

public class StringWordsCount {

	public static void uniqueEle() {
		String s = "Ankit and Akshu are highest paid QA with 25 lakhs of package and good QA and Ankit and also Akshu QA";
		String[] a = s.split(" ");
		HashSet<String> hs = new HashSet<String>();
		for (String ref : a) {
			hs.add(ref);
		}
		System.out.println(hs);
	}

	public static void main(String[] args) {
//		String s = "Ankit and Akshu are highest paid QA with 25 lakhs of package and good QA and Ankit and also Akshu QA";
//		char[] a = s.toCharArray();
//
//		HashMap<Character, Integer> hm = new HashMap<Character, Integer>();
//		for (char ref : a) {
//			if (hm.containsKey(ref)) {
//				int x = hm.get(ref);
//				hm.put(ref, x + 1);
//			} else {
//				hm.put(ref, 1);
//			}
//		}
//
//		for (char ref1 : hm.keySet()) {
//			System.out.println("Repeated word is " + ref1 + " = " + hm.get(ref1));
//		}

		uniqueEle();

	}

}
