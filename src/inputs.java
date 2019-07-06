import java.util.Scanner;

public class inputs {

	public static void main(String[] args) {

		//		Create scanner object
		Scanner input = new Scanner(System.in);
		
//		Output the prompt
		System.out.println("Enter a line of text: ");
		
		// Wait for the user to enter a line of text (Text: .nextLine(); Integer:  .nextInt(); Float:  .nextDouble();
		String line = input.nextLine();
		
		// Tell them what they entered
		
		System.out.println("User entered: " + line);
	}
}
