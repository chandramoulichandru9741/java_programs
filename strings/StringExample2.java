package com.gqt.basicsofjava.strings;

public class StringExample2 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str1 = "Rama";
		String str2 = "Rama";
		
		if(str1.equals(str2) == true) {
			System.out.println("Strings are equal");
		} else {
			System.out.println("Strings are not equal");
		}
		
		
		if(str1.equalsIgnoreCase(str2) == true) {
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
