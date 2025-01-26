package com.gqt.basicsofjava.strings;

import java.util.Scanner;

public class StringPalindrom {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the string to be reversed");
		String str = sc.nextLine();
		String str_rev = "";
		for(int i = str.length()-1; i >=0; i--) {
			str_rev += str.charAt(i);
		}
		boolean isPalindrom = true;
		for(int i = 0; i < str.length(); i++) {
			if(str.charAt(i) != str_rev.charAt(i)) {
				isPalindrom = false;
				break;
			}
		}
		if(isPalindrom) {
			System.out.println("String is palindrom");
		} else {
			System.out.println("String is not palindrom");
		}
		
	}
}
