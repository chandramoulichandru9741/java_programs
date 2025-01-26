package com.gqt.basicsofjava.strings;

public class StringExample6 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str1 = new String("Rama");
		String str2 = new String("RAMA");
		
		if(str1.compareTo(str2) == 0) {
			System.out.println("Strings are equal");
		} else {
			System.out.println("Strings are not equal");
		}
		
		
		if(str1.compareToIgnoreCase(str2) == 0) {
			System.out.println("Strings are equal");
		} else {
			System.out.println("Strings are not equal");
		}
		
		if(str1 == str2) {
			System.out.println("References are equal");
		} else {
			System.out.println("References are not equal");
		}
		

	}

}
