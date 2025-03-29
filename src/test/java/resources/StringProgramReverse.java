package resources;

public class StringProgramReverse {

	public static void main(String[] args) {
		// Question is: reverse the string but not the order or words instead words
		// replace in the same location in string//

		String s = "I am Ankit";
		String[] a = s.split(" ");

		StringBuilder sb = new StringBuilder();
		for (String ref : a) {
			sb.append(new StringBuilder(ref).reverse()).append(" ");
		}
		System.out.println("reverse of string is: " + sb);

	}

}
