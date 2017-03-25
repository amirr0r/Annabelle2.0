import java.util.Scanner;

public class Functions {
	private static Scanner sc;
	/**
	 * 
	 * @return how many characters the user wants in his password.
	 */
	public static int nbrCharacters() {
		sc = new Scanner(System.in);
		int digits;
		System.out.println("Hello dear user. My name is Annabelle2.0 and I will help you generate a completely random password."
				+ "\nHow many digits/characters would you like your password to contain ? ");
		digits = Integer.parseInt(sc.nextLine());
		while (digits <= 0) {
			System.out.println("The password must contain at least one character"
					+ "\nPlease try again : ");
			digits = Integer.parseInt(sc.nextLine());
		}
		return digits;
	}
	/**
	 * 
	 * @return what type(1, 2 or 3) of password the user wants.
	 */
	public static int choice() {
		sc = new Scanner(System.in);
		int choice;
		System.out.println("Now, would you like :"
				+ "\n1. A numeral password (ex : 12345678)"
				+ "\n2. An alphanumeral password (ex : 123df7y4)"
				+ "\n3. An alphanumeral password with caps (ex : 12Za3Z6e)"
				+ "\n4. A password with all charcters (ex : 1!%2Za3Ze6e)"
				+ "\nPlease Enter your choice :");
		choice = Integer.parseInt(sc.nextLine());
		while (choice < 1 || choice > 4) {
			System.out.println("Choose an option of the menu"
					+ "\nPlease try again : ");
			choice = Integer.parseInt(sc.nextLine());
		}
		return choice;
	}
	/*
	 * This function print a number at random
	 */
	public static void randomNumbers() {
		int nbr = (int) (Math.random() * 10) + 48;
		char c = (char) nbr;
		System.out.print(c);
	}
	/*
	 * This function print a lowercase letter at random
	 */
	public static void randomMinus() {
		int random = (int) (Math.random()*26)+97;
		char minus = (char) random;
		System.out.print(minus);
	}
	/*
	 * This function print a capital letter at random
	 */
	public static void randomMaj() {
		int random = (int) (Math.random()*26)+65;
		char maj = (char) random;
		System.out.print(maj);
	}
	/*
	 * This function print a random character
	 */
	public static void randomAll() {
		int random = (int) (Math.random()*95)+31;
		char c = (char) random;
		System.out.print(c);
	}
	public static char tryAgain() {
		sc = new Scanner(System.in);
		char yesNoMaybe;
		System.out.println("\nYou might not like your password, would you like a new one? [Y/N]");
		yesNoMaybe = sc.nextLine().charAt(0);
		return yesNoMaybe;
	}
}
