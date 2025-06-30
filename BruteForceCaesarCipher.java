import java.util.Scanner;

public class BruteForceCaesarCipher {
    public static String decrypt(String cipherText, int key) {
        StringBuilder decryptedText = new StringBuilder();
        for (char c : cipherText.toCharArray()) {
            if (Character.isLetter(c)) {
                char base = Character.isUpperCase(c) ? 'A' : 'a';
                decryptedText.append((char) ((c - base - key + 26) % 26 + base));
            } else {
                decryptedText.append(c);
            }
        }
        return decryptedText.toString();
    }

    public static void bruteForceAttack(String cipherText) {
        System.out.println("Brute Force Results:");
        for (int key = 1; key < 26; key++) {
            System.out.println("Key " + key + ": " + decrypt(cipherText, key));
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter ciphertext: ");
        String cipherText = scanner.nextLine();
        bruteForceAttack(cipherText);
        scanner.close();
    }
}
