package resources;

public class ArraysPrac {

	// print array in sorted format , find even elements of arrays between a given
	// range

	public static void main(String[] args) {
		int arr[] = { 1, 2, 3, 0, 4, 5, 6 };
		for (int i = 0; i < arr.length; i++) {
			for (int j = i + 1; j < arr.length; j++) {
				if (arr[i] > arr[j]) {
					int temp = arr[i];
					arr[i] = arr[j];
					arr[j] = temp;
				}
			}
		}
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] % 2 == 1) {
				System.out.println(arr[i]);
			}
		}
	}
}
