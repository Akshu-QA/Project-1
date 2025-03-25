package resources;

import java.util.HashMap;

public class StringWordsCount {

	public static void main(String[] args) {
		String s = "Ankit and Akshu are highest paid QA with 25 lakhs of package and good QA and Ankit and also Akshu QA";
		String[] a = s.split(" ");

		HashMap<String, Integer> hm = new HashMap<String, Integer>();
		for (String ref : a) {
			if (hm.containsKey(ref)) {
				int x = hm.get(ref);
				hm.put(ref, x + 1);
			} else {
				hm.put(ref, 1);
			}
		}

		for (String ref1 : hm.keySet()) {
			System.out.println("Repeated word is: + " + ref1 + " = " + hm.get(ref1));
		}

	}

}
