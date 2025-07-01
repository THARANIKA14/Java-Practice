import java.util.Scanner;

public class HillCipher {
    public static String encrypt(String text, int[][] key) {
        while (text.length() % 3 != 0) text += 'x'; 
        String result = "";
        for (int i = 0; i < text.length(); i += 3) {
            int a = text.charAt(i) - 'a';
            int b = text.charAt(i + 1) - 'a';
            int c = text.charAt(i + 2) - 'a';
            result += (char) ((key[0][0] * a + key[0][1] * b + key[0][2] * c) % 26 + 'a');
            result += (char) ((key[1][0] * a + key[1][1] * b + key[1][2] * c) % 26 + 'a');
            result += (char) ((key[2][0] * a + key[2][1] * b + key[2][2] * c) % 26 + 'a');
        }
        return result;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the text to encrypt: ");
        String text = scanner.nextLine().toLowerCase().replaceAll("[^a-z]", "");

        int[][] key = {{6, 24, 1}, {13, 16, 10}, {20, 17, 15}};
        
        String encryptedText = encrypt(text, key);
        System.out.println("Encrypted text: " + encryptedText);

        scanner.close();
    }
}
