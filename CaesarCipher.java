public package cns;

import java.util.Scanner;
public class CaesarCipher{
	public static void main (String [] args)
	{
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter text:");
		String text = scanner.nextLine();
		System.out.println("Enter shift");
		int shift = scanner.nextInt();
		for(char c : text.toCharArray())
			System.out.print(Character.isLetter(c)?(char) ((c - (Character.isUpperCase(c)? 'A' : 'a')+ shift)% 26 +(Character.isUpperCase(c)? 'A':'a')):c);
	}
}
