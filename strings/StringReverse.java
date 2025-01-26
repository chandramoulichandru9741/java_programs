package com.gqt.basicsofjava.strings;

import java.util.Scanner;

public class StringReverse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the string to be reversed");
		String str = sc.nextLine();
		String str_rev = "";
		for(int i = str.length()-1; i >=0; i--) {
			str_rev += str.charAt(i);
		}
		System.out.println("Reversed string is " + str_rev);
	}

}
