package resources;

import java.util.Scanner;

public class ArmstrongNumber {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("enter the number u ewant to check for Armstrong");
		int num = sc.nextInt();
		int sum = 0, rem = 0;
		int n = num;
		while (n > 0) {
			rem = n % 10;
			sum = sum + (rem * rem * rem);
			n = n / 10;
		}
		if (sum == num) {
			System.out.println("yes armstrong");
		} else
			System.out.println("not armsstrong");

	}

}
