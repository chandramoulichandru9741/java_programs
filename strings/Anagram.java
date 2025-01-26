package com.gqt.basicsofjava.strings;

import java.util.Arrays;
import java.util.Scanner;

public class Anagram {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter string 1");
		String str1 = sc.nextLine();
		System.out.println("Enter string 2");
		String str2 = sc.nextLine();
		char[] c1 = new char[str1.length()];
		char[] c2 = new char[str2.length()];
		
		for(int i = 0; i < str1.length(); i++) {
			c1[i] = str1.charAt(i);
		}
		for(int i = 0; i < str2.length(); i++) {
			c2[i] = str2.charAt(i);
		}
		Arrays.sort(c1);
		Arrays.sort(c2);
		
		boolean isAnagram = true;
		if(c1.length != c2.length) {
			System.out.println("Not anagram");
			isAnagram = false;
		} else {
			for(int i = 0; i < c1.length; i++) {
				if(c1[i] != c2[i]) {
					isAnagram = false;
					break;
				}
			}
		}
		if(isAnagram) {
			System.out.println("Anagram");
		} else {
			System.out.println("Not anagram");
		}
		sc.close();
	}

}
