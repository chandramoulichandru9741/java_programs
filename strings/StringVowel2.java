package com.gqt.basicsofjava.strings;

import java.util.Scanner;

public class StringVowel2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the string: ");
		String str = sc.nextLine();
		for(int i = 0; i < str.length(); i++) {
			if(str.charAt(i) == 'a' || str.charAt(i) == 'e' || str.charAt(i) == 'i' 
					|| str.charAt(i) == 'o' || str.charAt(i) == 'u' ) {
				str = str.replace(str.charAt(i), '@');
			}
			if(str.charAt(i) == 'A' || str.charAt(i) == 'E' || str.charAt(i) == 'I' 
					|| str.charAt(i) == 'O' || str.charAt(i) == 'U') {
				str = str.replace(str.charAt(i), '@');

			}

			
		}
		System.out.println(str);
	}

}
