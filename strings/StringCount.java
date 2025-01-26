package com.gqt.basicsofjava.strings;

import java.util.Scanner;

public class StringCount {

	public static void main(String[] args) {
		String vowels = "aeiouAEIOU";
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the string: ");
		String str = sc.nextLine();
		int count_vow = 0;
		int count_cons = 0;
		for(int i = 0; i < str.length(); i++) {
			if(str.charAt(i) >= 65 && str.charAt(i) <= 122) {
				if(vowels.indexOf(str.charAt(i)) != -1) {
					count_vow++;
					
				} else {
					count_cons++;
				}
			}
		}                  
		System.out.println("Number of vowels are " + count_vow);
		System.out.println("Number of consonants are " + count_cons);
		sc.close();
	}

}
