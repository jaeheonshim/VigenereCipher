public class Cipher {
	 private static char[][] cipherArray = new char[26][26];

	 static {
		  char startChar = 65;
		  for (int j = 0; j < 26; j++) {
				for (int i = 0; i < 26; i++) {
					 cipherArray[j][i] = startChar + i + j > 90 ? (char)(startChar + i + j - 26) : (char)(startChar + i + j);
				}
		  }
	 }

	 public static String buildKey (String key, int length) {
		  StringBuilder keyStream = new StringBuilder(length);
		  String keyString;

		  int keysInText = length / key.length();
		  keysInText++;

		  for (int i = 0; i < keysInText; i++) {
				keyStream.append(key);
		  }

		  keyString = keyStream.toString().substring(0, length);

		  return keyString;
	 }

	 public static String encryptText (String key, String text) {
		  key = key.toUpperCase();
		  text = text.toUpperCase();

		  StringBuilder encryptedMessage = new StringBuilder(text.length());
		  String keyString = buildKey(key, text.length());

		  char[] keyArray = keyString.toCharArray();
		  char[] textArray = text.toCharArray();

		  for (int i = 0; i < textArray.length; i++) {
				if (textArray[i] == 32) {
					 // keep spaces
					 encryptedMessage.append(' ');
					 continue;
				}

				encryptedMessage.append(cipherArray[keyArray[i] - 65][textArray[i] - 65]);
		  }

		  return encryptedMessage.toString();
	 }

	 public static String decryptText (String key, String text) {
		  key = key.toUpperCase();
		  text = text.toUpperCase();

		  StringBuilder decryptedMessage = new StringBuilder(text.length());
		  String keyString = buildKey(key, text.length());

		  char[] keyArray = keyString.toCharArray();
		  char[] textArray = text.toCharArray();

		  for (int i = 0; i < textArray.length; i++) {
				if (textArray[i] == 32) {
					 // keep spaces
					 decryptedMessage.append(' ');
					 continue;
				}

				char[] cipherRow = cipherArray[keyArray[i] - 65];

				// I know it's inefficient to loop through the entire array, and I could build a model of the indices, but it's only O(26) constant time so what the heck.
				for (int j = 0; j < cipherRow.length; j++) {
					 if (cipherRow[j] == textArray[i]) {
						  decryptedMessage.append((char)(j + 65));
					 }
				}
		  }

		  return decryptedMessage.toString();
	 }
}
