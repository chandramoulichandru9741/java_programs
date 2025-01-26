package com.gqt.basicsofjava.strings;

import java.util.Scanner;

public class StringVowel1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the string: ");
		String str = sc.nextLine();
		int count_small_vow = 0;
		int count_cap_vow = 0;
		for(int i = 0; i < str.length(); i++) {
			if(str.charAt(i) >= 65 && str.charAt(i) <= 90) {
				if(str.charAt(i) == 'A' || str.charAt(i) == 'E' || str.charAt(i) == 'I' 
						|| str.charAt(i) == 'O' || str.charAt(i) == 'U') {
					count_cap_vow++;
				}
			}
			if(str.charAt(i) >= 97 && str.charAt(i) <= 122) {
				if(str.charAt(i) == 'a' || str.charAt(i) == 'e' || str.charAt(i) == 'i' 
						|| str.charAt(i) == 'o' || str.charAt(i) == 'u') {
					count_small_vow++;
				}
			}
		}
			System.out.println("Small vowels are " + count_small_vow);
			System.out.println("Capital vowels are " + count_cap_vow);
		
	}

}
