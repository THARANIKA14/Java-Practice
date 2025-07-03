import java.security.*;
import java.util.Base64;
import java.util.Scanner;

public class DigitalSignatureWithScanner {
    public static void main(String[] args) {
        try {
            Scanner scanner = new Scanner(System.in);
            
            // Generate Key Pair (Public & Private Keys)
            KeyPairGenerator keyGen = KeyPairGenerator.getInstance("RSA");
            keyGen.initialize(2048);
            KeyPair keyPair = keyGen.generateKeyPair();
            PrivateKey privateKey = keyPair.getPrivate();
            PublicKey publicKey = keyPair.getPublic();

            // User enters message to be signed
            System.out.print("Enter the message: ");
            String message = scanner.nextLine();

            // Signing the message
            Signature signature = Signature.getInstance("SHA256withRSA");
            signature.initSign(privateKey);
            signature.update(message.getBytes());
            byte[] digitalSignature = signature.sign();
            
            // Display results
            System.out.println("\nGenerated Digital Signature:");
            System.out.println(Base64.getEncoder().encodeToString(digitalSignature));

            // Verifying the signature
            signature.initVerify(publicKey);
            signature.update(message.getBytes());
            boolean isVerified = signature.verify(digitalSignature);

            System.out.println("\nSignature Verified: " + isVerified);

            scanner.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
