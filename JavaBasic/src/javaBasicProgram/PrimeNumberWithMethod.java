package javaBasicProgram;

public class PrimeNumberWithMethod {

	static void checkPrime(int n) {

		int i;
		int m = 0;
		int flag = 0;

		m = n / 2; // m=10/2=5

		if (n == 0 || n == 1) {
			System.out.println(n + " is not Prime number");

		} else {
			for (i = 2; i <= m; i++) {
				if (n % 2 == 0) {

					System.out.println(n + " is not prime number ");
					flag = 1;
					break;
				}
			}
			if (flag == 0) {
				System.out.println(n + " is Prime number");

			}
		}

	}

	public static void main(String[] args) {

		checkPrime(10);
		checkPrime(11);
		checkPrime(47);
		checkPrime(0);
	}
}
