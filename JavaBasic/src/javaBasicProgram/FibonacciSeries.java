package javaBasicProgram;

public class FibonacciSeries {

	public static void main(String[] args) {

		// defining integer variable
		int number1 = 0, number2 = 1, number3, Count = 10;

		// Print number 1 and number 2

		System.out.print(number1 + " " + number2 + " ");

		// for loop for addition
		for (int i = 2; i <= Count; i++) {

			number3 = number1 + number2;

			System.out.print(number3 + " ");

			// Swapping number with Each other
			number1 = number2; // assign number 2 value to number 1
			number2 = number3; // assign number 3 value to number 2
		}
	}
}
