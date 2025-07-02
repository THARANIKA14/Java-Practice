import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.Scanner;

public class SHAEncryption {
    public static String encryptSHA(String message) {
        try {
            MessageDigest md = MessageDigest.getInstance("SHA-256"); // You can also use SHA-1 or SHA-512
            byte[] hash = md.digest(message.getBytes());
            StringBuilder hexString = new StringBuilder();
            for (byte b : hash) {
                hexString.append(String.format("%02x", b));
            }
            return hexString.toString();
        } catch (NoSuchAlgorithmException e) {
            throw new RuntimeException(e);
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter message: ");
        String message = scanner.nextLine();
        System.out.println("SHA-256 Hash: " + encryptSHA(message));
        scanner.close();
    }
}
