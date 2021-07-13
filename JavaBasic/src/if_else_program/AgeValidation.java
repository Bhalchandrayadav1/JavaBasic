//If the input age is 18 or greater than 18 then the voter is eligible to vote, else not.

package if_else_program;

public class AgeValidation {

	public static void main(String[] args) {

		int age = 15;
		// call static method directly in class

		ageConfirmation(age);

		// calling by reference

		AgeValidation A = new AgeValidation();

		A.ageConfirmation(52);
	}

	public static void ageConfirmation(int age) {

		if (age >= 18) {
			System.out.println("voter is eligible to vote");
		} else {
			System.out.println("voter is not eligible to vote");
		}

	}
}
