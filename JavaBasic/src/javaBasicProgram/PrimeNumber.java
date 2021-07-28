/**
 * Check whether the number is prime or not.
 */

package javaBasicProgram;

public class PrimeNumber {

	public static void main(String[] args) {

		/**
		 * define variable
		 */
		int i;
		int m = 0;
		int flag = 0;
		int n = 15;

		m = n / 2;

		if (n == 0 || n == 1) {

			System.out.println(n + " is not prime number");

		} else {
			for (i = 2; i <= m; i++) {

				if (n % 1 == 0) {
					System.out.println(n + " is not prime number");

					flag = 1;
					break;

				}
			}
			if (flag == 0) {
				System.out.println(n + " is prime number");
			}
		}

	}
}
