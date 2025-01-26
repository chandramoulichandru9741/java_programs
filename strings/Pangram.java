package com.gqt.basicsofjava.strings;

import java.util.Scanner;

public class Pangram {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter string ");
		String str = sc.nextLine();
		str = str.toLowerCase();
		int[] c = new int[26];
		for(int i = 0; i < str.length(); i++) {
			if(str.charAt(i) >= 97 || str.charAt(i) <= 122) {
				c[str.charAt(i) - 97]++;
			}
		}

		boolean isPangram = true;
		for(int i = 0; i < c.length; i++) {
			if(c[i] == 0) {
				isPangram = false;
				break;
			}
		}

		if(isPangram) {
			System.out.println("String is pangram");
		} else {
			System.out.println("String is not pangram");
		}
	}

}

