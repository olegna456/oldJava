package last;

import java.util.*;

class Options extends UserInput {
	public Scanner console = new Scanner(System.in);
	SetDimension setDi = new SetDimension();

	public int choice;

	public void selectOption() {
		System.out.println("Select an Option");
		System.out.println("1. Print");
		System.out.println("2. Edit");
		System.out.println("3. ....");
		System.out.print("Enter your choice: ");
		choice = Integer.parseInt(console.nextLine());
		selected(choice);
	}
	
	public void selected(choice) {
		switch(choice) {
			case 1:
				setDi.setPrint();
				break;
			case 2:
				break;
			default:
		}
	}
}