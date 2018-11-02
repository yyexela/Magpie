import java.util.Scanner;

/**
 * A simple class to run the Magpie class.
 * 
 * @author Laurie White
 * @version April 2012
 */
public class MagpieRunner3 {

	/**
	 * Create a Magpie, give it user input, and print its replies.
	 */
	public static void main(String[] args) {
		Magpie3 maggie = new Magpie3();

		System.out.println(maggie.getGreeting());
		Scanner scan = new Scanner(System.in);
		String statement = scan.nextLine().toLowerCase();

		while (!statement.equals("bye")) {
			System.out.println(maggie.getResponse(statement));
			statement = scan.nextLine();
		}
	}

}
