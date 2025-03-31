package resources;

import java.io.StringReader;

public class StringAllProg {

	public static void main(String[] args) {
		String s = "AkshU";
		System.out.println(s.toUpperCase());
		System.out.println(s.toLowerCase());
		System.out.println(s.replace('U', 'X'));
		System.out.println(s.indexOf('h'));

		StringBuilder sb = new StringBuilder();
		System.out.println(sb.append(s).insert(2, "ZZ"));
		System.out.println(sb.append("WW"));

		StringReader sr = new StringReader(s);
	}

}
