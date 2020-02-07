import java.util.Scanner;

public class Main {
	 public static void main (String[] args) {
		  Scanner scanner = new Scanner(System.in);

		  System.out.print("Enter a message. Exclude all characters except spaces and those in range A-Z. >>> ");
		  String input = scanner.nextLine();

		  System.out.print("Enter a key. Exclude all characters except spaces and those in range A-Z. >>> ");
		  String key = scanner.nextLine();

		  System.out.print("Encrypted Text: ");
		  System.out.println(Cipher.encryptText(key, input));

		  System.out.print("Decrypted Text: ");
		  System.out.println(Cipher.decryptText(key, input));
	 }
}
