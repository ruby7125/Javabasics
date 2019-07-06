import java.util.Scanner;

public class SwitchStatement {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter the command: ");
		String text = input.nextLine();
		
		switch(text) {
		
		case "Start":
			System.out.println("Machine started");
			break;
			
		case "Stop":
			System.out.println("Machine stopped");
			break;
			
		default :
			System.out.println("Command not recognized");
		}

	}

}
