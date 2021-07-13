//Check Leap Year

package if_else_program;

public class LeapYear {

	static boolean isLeap = false;

	public static void main(String[] args) {

		int Year = 1900;

		if (Year % 4 == 0) {

			System.out.println("This is Leap Year");
		} else {
			System.out.println("This is not Leap Year");
		}
	}

	public void leapYear(int yr) {
		if (yr % 4 == 0)
			System.out.println(isLeap = true);

		else
			isLeap = false;

	}

}
