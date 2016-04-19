// Create a program that asks the user for a noun and an adjective. Make sure to prompt them with something like: System.out.println("Give me a noun.");
// Save those responses into String variables
// Create a sentence that will will use your saved noun and adjective.

import java.io.Console;

public class ImportingCode {
	public static void main (String[] args) {
		Console myConsole = System.console();

		System.out.println("Enter a noun!");
		String nounInput = myConsole.readLine();
		
		System.out.println("Enter an adjective!");
		String adjInput = myConsole.readLine();
		
		String sentence = "The " + nounInput + " is " + adjInput;
		System.out.println(sentence);
	}
}