// Create an application that will ask a user for 2 Integers. Add those Integers together and then print the results for the user.
// Do the same for subtraction, multiplication and division. Congratulations, you made yourself a calculator!


import java.io.Console;

public class ChangingDateTypes {
	public static void main(String[] args) {
		Console myConsole = System.console();	
		
		System.out.println("Enter a number!");
		Integer numberOne = Integer.parseInt(myConsole.readLine());
		
		System.out.println("Ente another number!");
		Integer numberTwo = Integer.parseInt(myConsole.readLine());
		
		calcultions(numberOne, numberTwo);
	}

	public static void calcultions(Integer num1, Integer num2) {
		Console myConsole = System.console();	
		System.out.println("Added:" + (num1 + num2));
		System.out.println("Subtracted:" + (num1 - num2));
		System.out.println("Multiplied:" + (num1 * num2));
		System.out.println("Divided:" + (num1 / num2));
	} 

}