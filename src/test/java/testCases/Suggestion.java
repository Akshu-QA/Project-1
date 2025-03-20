package testCases;

public class Suggestion {

	public String m5(String s) {
		return s;
	}

	public static void arraySort() {
		int a[] = { 19, 1334, 5, 256, 6 };

		for (int i = 0; i < a.length; i++) {
			for (int j = i + 1; j < a.length; j++) {
				if (a[i] > a[j]) {
					int temp = a[i];
					a[i] = a[j];
					a[j] = temp;
				}
			}
		}
		for (int arr : a) {
			System.out.println(arr);
		}

		System.out.println("second largest value in this array is: " + a[a.length - 2]);
	}

	public static void main(String[] args) {
		arraySort();
	}
}
