// find Two Maximum number

package if_else_program;

public class MaxNumber {

	public static void main(String[] args) {

		int number1 = 100, number2 = 200;

		MaxNumber M = new MaxNumber();

		M.Max_Number(number1, number2);
	}

	public void Max_Number(int x, int y) {
		if (x > y)
			System.out.println(" Number = " + x + " is Maximum Number");
		else
			System.out.println("Number2= " + y + " is Maximum Number");

	}

}
