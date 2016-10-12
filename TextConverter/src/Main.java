import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		String text = "";
		Scanner sc = new Scanner(System.in);
		while (true) {
			System.out.print("Import from file or console? (f/c): ");
			sc = sc.useDelimiter("\n");
			String choice = sc.next();
			switch (choice) {
				case "f":
					text = getTextFromFile();
					break;
				case "c":
					text = getTextFromConsole();
					break;
				default:
					System.out.println("It is literally one letter. How did you mess up?");
			}
		}
	}
	
	public static String getTextFromFile() {
		Scanner sc = new Scanner(System.in);
		sc = sc.useDelimiter("\n");
		System.out.println("Type in full path of txt file: ");
		return sc.next();
	}
	
	public static String getTextFromConsole() {
		Scanner sc = new Scanner(System.in);
		sc = sc.useDelimiter("\n");
		System.out.println("Type in text: ");
		return sc.next();
	}
}