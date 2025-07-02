import java.util.Scanner;

public class RailFenceCipher {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter plaintext: ");
        String plaintext = scanner.nextLine().toUpperCase(); 

        System.out.println("Encrypted text: " + encryptRailFence(plaintext));
        
        scanner.close();
    }

    public static String encryptRailFence(String text) {
        StringBuilder rail1 = new StringBuilder();
        StringBuilder rail2 = new StringBuilder();

        for (int i = 0; i < text.length(); i++) {
            if (i % 2 == 0) rail1.append(text.charAt(i));
            else rail2.append(text.charAt(i));
        }

        return rail1.toString() + rail2.toString();
    }
}
