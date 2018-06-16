import java.util.*;
import java.awt.*;

class codeCracker {
	public static void main(String[] args) {
		String input = "";
		String encryptedMessage = " ";
	
		char[] code = {'A', 'B', 'C', 'D', 'E', 'F', 'G', 'H', 'I', 'J', 'K', 'L', 'M', 'N', 'O', 'P', 'Q', 'R', 'S', 'T', 'U', 'V', 'W', 'X', 'Y', 'Z', ' '};
		char[] cracked = {'!', ')', '"', '(', '£', '*', '%', '&', '>', '<', '@', 'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n', 'o', ' '};
		
		
		System.out.println("What is the message that you would like to encrypt?");
		Scanner scan = new Scanner(System.in);
		input = scan.nextLine();
		input = input.toUpperCase();
		char[] inputArray = input.toCharArray();
		char[] encrypted = new char[inputArray.length];
		
		for(int i = 0; i < inputArray.length; i++) {
			for(int j = 0; j < code.length; j++) {
				if(inputArray[i] == code[j]){
					encrypted[i] = cracked[j];
				}
			}
		}
		
		
		StringBuilder sb = new StringBuilder();
		encryptedMessage = sb.append(encrypted).toString();
		
		
		System.out.println(encryptedMessage);
		
	
	}
}