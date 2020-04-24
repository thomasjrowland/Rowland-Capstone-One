package PigLatinTranslator;

import java.util.Scanner;

public class PigLatinTranslator {

	public static void main(String[] args) {
		
		

		System.out.println("Lingua Porcus Interpres!!!");
		
		boolean keepGoing = true;
		String completedOutput;
		String userChoice;
		String userInput;
		
			do {
				
				Scanner scnr = new Scanner(System.in);

				System.out.println(" ");
				System.out.print("Salve. Scribe tibi verba: ");
				userInput = scnr.nextLine();
				System.out.println();
		
				completedOutput = PigLatinMethods.sentenceBreaker(userInput);
		
				System.out.print("\"" + userInput + "\" translates to: ");
				System.out.println(completedOutput);
				System.out.println();

				System.out.println("Iterum? y/n");
				userChoice = scnr.next();
				
				if (userChoice.startsWith("y")) {
					keepGoing = true;
				} else if (userChoice.startsWith("n")) {
					keepGoing = false;
				} else {
					System.out.print("Iterum? y/n ");
					userChoice = scnr.next();				
				}
				//scnr.close();
				
			} while (keepGoing);
		
		
		
		
	}

}
