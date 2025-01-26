package com.gqt.basicsofjava.strings;

import java.util.Scanner;

public class StringVowel4 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the string: ");
		String str = sc.nextLine();
		int len = str.length();
		char[] c = new char[len];
		for (int i = 0; i < len; i++) {
			c[i] = str.charAt(i);
		}
		for (int i = 0; i < len; i++) {
			System.out.println(c[i]);
		}
		System.out.println("===============");
		char[] c1 = str.toCharArray();
		for (int i = 0; i < len; i++) {
			System.out.println(c1[i]);
		}
		sc.close();

	}

}
