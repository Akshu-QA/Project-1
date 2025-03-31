package resources;

public class Testing {

	public static void main(String[] args) {

		String s = "i am ankit";
		
		String rev = "";

		int s1 = s.length();

		for (int i = s1 - 1; i >= 0; i--) {
			rev = rev + s.charAt(i);
		}
		System.out.println("reverse strin is:" +rev);

	}

}
