// Create an application that estimates shipping cost for a user. You will need to calculate weight, distance and a pricing modifier. Your formula might look something like: ( packageWeight / 10 ) + ( distanceToTravel / 5 ) * priceModifier.
// Play around with your formula until it feels good.
// Create an application that will encrypt a phrase that a user enters. You might use the .replaceAll() method to change characters. Make sure you are resaving the results of .replaceAll() into a variable like:

import java.io.Console;

public class WritingMethods {
	public static void main (String[] args) {
		Console myConsole = System.console();
		
		System.out.println("How many ounces in your package?");
		String ounceInput = myConsole.readLine();
		Integer ounceNum = Integer.parseInt(ounceInput);

		System.out.println("How many miles away is your package destination");
		String milesInput = myConsole.readLine();
		Integer milesNum = Integer.parseInt(milesInput);
		shippingCost (ounceNum, milesNum);
	}

	public static void shippingCost(Integer ounces, Integer miles) {
		System.out.println(((ounces/10) + (miles/5)) * 20);
	}
}