public class Homework4 {

private String word;
private int number;

	/* Finish the constructor and create any necessary instance
	 * variables
	 */
	public Homework4(String s, int i) {

		word = s;
		number = i;

	}

	/* Return the product of the stored number and the
	 * provided double. Cast the number after the
	 * multiplication FAIL1
	 */
	public int multiply(double d) {

		double z = (d * ((double) number));
		return ((int) z);

	}

	/* Add the two provided numbers, and then multiply the
	 * product(do you mean sum??) by the stored number FAIL 2
	 */
	public double sumProduct(int a, double b) {

		double sum = a + b;
		double x = sum * number;
		return x;

	}

	/* Return the remainder of the first number divided by
	 * the integer portion of the provided double PASS
	 */
	 public int remainder(double d) {

		 int y = (number) % ((int) d);
		 return y;

	}

	/* Return the length of the stored String PASS
	 */
	public int getLength() {

		int l = word.length();
		return l;

	}

	/* Return the stored String followed by the provided
	 * String. Put a space between the two Strings FAIL 5
	 */
	public String concat(String s) {

		return (word + " " + s);

	}

	public static void main(String[] args) {
		int exitCode = 0;

		Homework4 hw4 = new Homework4("Hello, World!", 5);

		if (hw4.multiply(2.5) == 12) {
			System.out.println("Pass 1");
		} else {
			System.out.println("Fail 1");
			exitCode += 1;
		}

		if (hw4.sumProduct(2, 2.5) == 22.5) {
			System.out.println("Pass 2");
		} else {
			System.out.println("Fail 2");
			exitCode += 1;
		}

		if (hw4.remainder(3.5) == 2) {
			System.out.println("Pass 3");
		} else {
			System.out.println("Fail 3");
			exitCode += 1;
		}

		if (hw4.getLength() == 13) {
			System.out.println("Pass 4");
		} else {
			System.out.println("Fail 4");
			exitCode += 1;
		}

		if (hw4.concat("Goodbye!").equals("Hello, World! Goodbye!")) {
			System.out.println("Pass 5");
		} else {
			System.out.println("Fail 5");
			exitCode += 1;
		}

		if (exitCode == 0) {
			System.out.println("All Pass");
		} else {
			System.out.println("Fail");
		}

		System.exit(exitCode);
	}

}
