package resources;

public class ArraysProgInterview {

	public static void main(String[] args) {
		// Give an array int arr[] = {2,5,8,7,1,3,6,4,5,9); shift all even numbers to
		// the left and odd numbers to the right.
		int[] arr = { 2, 5, 8, 7, 1, 3, 6, 4, 5, 9 };
		int left = 0;
		int right = arr.length - 1;

		while (left < right) {
			while (left < right && arr[left] % 2 == 0) {
				left++;
			}
			while (left < right && arr[right] % 2 != 0) {
				right--;
			}
			if (left < right) {
				int temp = arr[left];
				arr[left] = arr[right];
				arr[right] = temp;
				left++;
				right--;
			}
		}

		System.out.println(java.util.Arrays.toString(arr)); // Output: [2, 8, 6, 4, 1, 3, 5, 7, 5, 9]
	}
}
