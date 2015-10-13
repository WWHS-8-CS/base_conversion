import java.util.*;
public class BetterConverter {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("Number: ");
		String inputNumber = scan.next();
		System.out.print("Base to convert from: ");
		int baseIn = scan.nextInt();
		System.out.print("Base to convert to: ");
		int baseOut = scan.nextInt();
		try {
			// Yay for integer methods that do everything for you... it's like Java isn't entirely useless!
			System.out.println("Answer: " + Integer.toString(Integer.valueOf(inputNumber, baseIn), baseOut));
		} catch (NumberFormatException e) {
			System.err.println("Input isn't the correct base.");
		}
	}
}