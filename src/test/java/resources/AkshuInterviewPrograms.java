package resources;

public class AkshuInterviewPrograms {

	static int a = 19;
	static int b = 21;
	static int c;

	// swap using 2 var
	public static void swap2var() {
		a = a + b;
		b = a - b;
		a = a - b;
		System.out.println("swapped numbers are: " + a + " & " + b);
	}

	// swap using 3rd var
	public static void swapUsing3var() {
		System.out.println("before swapping numbers are: " + a + " & " + b);
		c = a; // 19
		a = b; // 21
		b = c; // 19
		System.out.println("after swapped numbers are: " + a + " & " + b);
	}

	public static void main(String[] args) {
		swap2var();
		swapUsing3var();
	}

}
