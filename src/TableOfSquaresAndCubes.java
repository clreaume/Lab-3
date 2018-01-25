import java.util.Scanner;

public class TableOfSquaresAndCubes {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		String ans;

		do {
			System.out.println("Please enter an integer: ");
			int num = input.nextInt();

			System.out.printf("%15s %15s %15s\n", "Number", "Squared", "Cubed");
			System.out.printf("%15s %15s %15s\n", "======", "======", "======");

			for (int i = 1; i <= num; ++i) {
				System.out.printf("%15d %15d %15d\n", i, (int)Math.pow(i, 2), (int)Math.pow(i, 3));
			}

			System.out.println("Want to keep going? Enter Y if so: ");
			ans = input.next();

		} while (ans.equalsIgnoreCase("Y"));

		System.out.println("K, bye!");

		input.close();
	}
}
