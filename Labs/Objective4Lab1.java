import java.util.Scanner;

public class Objective4Lab1 {
  public static void main(String[] args) {

    Scanner keyboard = new Scanner(System.in);

    String fname = "";
    String lname = "";
    String favoriteAnimal = "";
    String favoriteFood = "";
    String favoriteSong = "";

    //TODO prompt the user to get input for all of the String variables.
    Scanner scanner = new Scanner(System.in);

    System.out.println("What is your first name?");
    fname = scanner.nextLine();

    System.out.println("What is your last name?");
    lname = scanner.nextLine();

    System.out.println("What is your favorite animal?");
    favoriteAnimal = scanner.nextLine();

    System.out.println("What is your favorite food?");
    favoriteFood = scanner.nextLine();

    System.out.println("What is your favorite Song?");
    favoriteSong = scanner.nextLine();

    //TODO print the output formatted to look like the expected output using String concatenation.

    System.out.println("My name is "+fname+" "+lname+".");
    System.out.println("My favorite animal is the "+favoriteAnimal+".");
    System.out.println("My favorite food is "+favoriteFood+".");
    System.out.println("My favorite song is "+ favoriteSong+".");
  }
}