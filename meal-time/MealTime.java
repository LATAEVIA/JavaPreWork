import java.io.Console;

public class MealTime {
  public static void main(String[] args) {
    Console myConsole = System.console();

    System.out.println("What did you eat for breakfast?");
    String yourBreakfast = myConsole.readLine();
    System.out.println("You had " + yourBreakfast + " for breakfast.");

    System.out.println("What did you eat for lunch?");
    String yourLunch = myConsole.readLine();
    System.out.println("You had " + yourLunch + " for lunch.");

    System.out.println("What did you eat for dinner?");
    String yourDinner = myConsole.readLine();
    System.out.println("You had " + yourDinner + " for dinner.");
  }

  public static void askWhatYouAteForDinner(String meal) {
    System.out.println("What did you eat for" + meal + "?");
  }
}