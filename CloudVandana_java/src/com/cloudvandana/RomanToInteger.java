package com.cloudvandana;

import java.util.Scanner;

public class RomanToInteger {
	
	public static void main(String[] args) {
		
		Scanner myObj = new Scanner(System.in);  // Create a Scanner object
	    System.out.println("Enter the roman number");    //Enter the Roman Number
	    String s = myObj.nextLine();
	    String roman = s.toUpperCase();            // Converting it to uppercase
	    
		int ans = 0, num = 0;
		
		// Iterate through roman from right to left
        for (int i = roman.length()-1; i >= 0; i--) {
            switch(roman.charAt(i)) {
                case 'I': num = 1; break;
                case 'V': num = 5; break;
                case 'X': num = 10; break;
                case 'L': num = 50; break;
                case 'C': num = 100; break;
                case 'D': num = 500; break;
                case 'M': num = 1000; break;
            }
            // Check if num in less than ans then substract otherwise add(checking for 4'IV' and 9'IX')
            if (4 * num < ans) ans -= num;
            else ans += num;
        }
        // Print the result
        System.out.println("The integer of roman " + roman + " is " + ans);
        
	}

}
