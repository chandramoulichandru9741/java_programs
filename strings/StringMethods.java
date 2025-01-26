package com.gqt.basicsofjava.strings;

public class StringMethods {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "SachinRameshTendulkar";
		int len = str.length();
		System.out.println(len);
		System.out.println("============");
		
		char c1 = str.charAt(5);
		System.out.println(c1);
		System.out.println("============");
		
		int c2 = str.charAt(5);
		System.out.println(c2);
		System.out.println("============");

		String str_new = str.concat("is a cricketer");
		System.out.println(str_new);
		System.out.println("============");

		boolean res1 = str.contains("Ramesh");
		System.out.println(res1);
		System.out.println("============");

		res1 = str.contains("ramesh");
		System.out.println(res1);
		System.out.println("============");

		res1 = str.contentEquals("Ramesh");
		System.out.println(res1);
		System.out.println("============");

		
		boolean res2 = str.endsWith("Tendulkar");
		System.out.println(res2);
		System.out.println("============");

		res2 = str.endsWith("Ramesh");
		System.out.println(res2);
		System.out.println("============");
		
		res2 = str.startsWith("Sachin");
		System.out.println(res2);
		System.out.println("============");

		res2 = str.startsWith("Ramesh");
		System.out.println(res2);
		System.out.println("============");
		
		Class className = str.getClass();
		System.out.println(className);
		System.out.println("============");
		
		int hashCode = str.hashCode();
		System.out.println(hashCode);
		System.out.println("============");
		
		String indent = str.indent(5);
		System.out.println(indent);
		System.out.println("============");
		
		int indexOf = str.indexOf('n');
		System.out.println(indexOf);
		System.out.println("============");
		
		indexOf = str.indexOf('a', 10);
		System.out.println(indexOf);
		System.out.println("============");
		
		int lastIndexOf = str.lastIndexOf('a');
		System.out.println(lastIndexOf);
		System.out.println("============");
		
		boolean isBlank = "     ".isBlank();
		System.out.println(isBlank);
		System.out.println("============");
		
		boolean isEmpty = "".isEmpty();
		System.out.println(isEmpty);
		System.out.println("============");
		
		String str2 = str.substring(6);
		System.out.println(str2);
		System.out.println("============");
		
		String str3 = str.substring(6, 12);
		System.out.println(str3);
		System.out.println("============");
		
		str3 = str.replace('a', '@');
		System.out.println(str3);
		System.out.println("============");

		
		
		

	}

}
