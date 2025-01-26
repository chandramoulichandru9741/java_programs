package com.gqt.basicsofjava.strings;

import java.util.Scanner;

public class StringExample7 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the string: ");
		String str = sc.nextLine();
		int count = 0;
		for (int i = 0; i < str.length(); i++) {
			if (str.charAt(i) == ' ') {
				count++;
			}
		}

		String[] words = new String[count + 1];
		int index = 0;
		int start = 0;
		for (int i = 0; i < str.length(); i++) {
			if (str.charAt(i) == ' ') {
				words[index] = str.substring(start, i);
				index++;
				start = i + 1;
			}

		}
		words[count] = str.substring(start, str.length());

		for (String word : words) {
			for (int i = word.length() - 1; i >= 0; i--) {
				System.out.print(word.charAt(i));

			}
			System.out.println();
		}

	}

}













