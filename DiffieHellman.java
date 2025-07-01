import java.math.BigInteger;
import java.security.SecureRandom;
import java.util.Scanner;

public class DiffieHellman {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        SecureRandom random = new SecureRandom();
        
        System.out.print("Enter a prime number (p): ");
        BigInteger p = scanner.nextBigInteger();
        
        System.out.print("Enter a base (g): ");
        BigInteger g = scanner.nextBigInteger();
        
        BigInteger a = new BigInteger(10, random); // Alice's private key
        BigInteger b = new BigInteger(10, random); // Bob's private key
        
        BigInteger A = g.modPow(a, p); // Alice's public key
        BigInteger B = g.modPow(b, p); // Bob's public key
        
        BigInteger keyAlice = B.modPow(a, p);
        BigInteger keyBob = A.modPow(b, p);
        
        System.out.println("\nAlice's Public Key: " + A);
        System.out.println("Bob's Public Key: " + B);
        System.out.println("Shared Secret Key for Alice: " + keyAlice);
        System.out.println("Shared Secret Key for Bob: " + keyBob);
        
        scanner.close();
    }
} 
