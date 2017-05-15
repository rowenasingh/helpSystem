class Help {
	public static void main(String[] args)
	throws java.io.IOException {

		char option;
		char clear;

		do {
			System.out.println("Help on: \n1. if \n2. switch \n3. for \n4. while \n5. do while \n6. break \n7. continue \nenter q to quit \nChoose one:\n");

			option = (char) System.in.read();

			if (option == '1') {
				System.out.println("The if: \n\nif (condition) statement; \nelse statement;\n");
			}

			else if (option == '2') {
				System.out.println("The switch: \n\nswitch(expression) { \n  case constant: \n    statement sequence \n    break; \n  // ... \n}\n");
			}

			else if (option == '3') {
				System.out.println("The for: \n\nfor (initialization; condition; iteration) \n{ \n  statement sequence \n}\n");
			}

			else if (option == '4') {
				System.out.println("The while: \nwhile (condition) { \n  statement sequence \n}\n");
			}

			else if (option == '5') {
				System.out.println("The do while: \ndo { \n  statements; \n} while(condition);\n");
			}

			else if (option == '6') {
				System.out.println("The break: \nbreak;\n");
			}

			else if (option == '7') {
				System.out.println("The continue: \ncontinue;\n");
			}

			else if (option == 'q') {
				break;
			}

			else {
				System.out.println("Please enter either a number between 1 and 7 or enter q to quit the program.\n");
			}

			do {
				clear = (char) System.in.read();
			} while(clear != '\n');

		} while(option != '1' || option != '2' || option != '3' || option != '4' || option != '5' || option != '6' || option != '7' || option != 'q');

	}
}