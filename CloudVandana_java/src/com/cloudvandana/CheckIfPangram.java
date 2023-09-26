package com.cloudvandana;

import java.util.Scanner;

public class CheckIfPangram {
	
	public static void main(String[] args) {
		
		Scanner myObj = new Scanner(System.in);  // Create a Scanner object
	    System.out.println("Enter the sentence");    //Enter the sentence to check
	    String sentence = myObj.nextLine();
	    boolean ans = checkPangram(sentence);
	    if(ans)
	    	System.out.println("The string is pangram");
	    else
	    	System.out.println("The string is not pangram");
	    
	}
	
	public static boolean checkPangram(String sentence) {
		int[] counts = new int[26]; // Initialize an array for letter counts

        // Convert the input sentence to lowercase to handle uppercase letters as well
        sentence = sentence.toLowerCase();

        // Count the frequency of each lowercase letter
        for (int i = 0; i < sentence.length(); i++) {
            char c = sentence.charAt(i);
            if (c >= 'a' && c <= 'z') {
                counts[c - 'a']++;
            }
        }

        // Check if any letter has a count of 0
        for (int count : counts) {
            if (count == 0) {
                return false;
            }
        }

        return true;
	}

}
