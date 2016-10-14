import java.util.Scanner;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class Main {
	public static void main(String[] args) {
		String text = "";
		Scanner sc = new Scanner(System.in); // Create ability to read in user input
		String choice = "";
		boolean next = false;
		Text input;
		
		while (next == false) {
			System.out.print("Import from file or console? (f/c): "); // Print to console
			sc = sc.useDelimiter("\n"); // Set the scanner to only end when the user hits return
			choice = sc.next(); // Create a new string with the user's input
			switch (choice) {
				case "f": // If the user typed in "f", then...
					text = getTextFromFile();
					next = true;
					break;
				case "c":
					text = getTextFromConsole();
					next = true;
					break;
				default: // If the user messed up, then...
					System.out.println("It is literally one letter. How did you mess up?");
			}
		}
		next = false;
		while (next == false) {
			System.out.print("What format is this, hex, ascii, binary, decimal? (h/a/b/d): ");
			choice = sc.next();
			switch (choice) {
				case "h":
					
			}
		}
	}
	
	public static String getTextFromFile() {
		Scanner sc = new Scanner(System.in);
		sc = sc.useDelimiter("\n");
		System.out.println("Type in full path of txt file: ");
		String filename = sc.next();
		
	    String content = null;
	    File file = new File(filename); // Create the file from given filename
	    FileReader reader = null; // Create a file reader object
	    try { // There may be many errors so we chloroform the code
	        reader = new FileReader(file);
	        char[] chars = new char[(int) file.length()];
	        reader.read(chars);
	        content = new String(chars);
	        reader.close();
	    } catch (IOException e) {
	        e.printStackTrace();
	    } finally {
	        try {
	        	reader.close();
	        }
	        catch (IOException e) {
	        	e.printStackTrace();
	        }
	    }
	    return content;
	}
	
	public static String getTextFromConsole() {
		Scanner sc = new Scanner(System.in);
		sc = sc.useDelimiter("\n");
		System.out.println("Type in text: ");
		return sc.next();
	}
}