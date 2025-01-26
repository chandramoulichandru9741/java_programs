package com.gqt.basicsofjava.scanner;

import java.util.Scanner;

public class ScannerExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter byte value");
		byte b = sc.nextByte();
		System.out.println("Byte value collected is" + b);
		System.out.println("---------");
		
		System.out.println("Enter short value");
		short s = sc.nextShort();
		System.out.println("Short value collected is" + s);
		System.out.println("---------");
		
		System.out.println("Enter int value");
		int i = sc.nextInt();
		System.out.println("Int value collected is" + i);
		System.out.println("---------");
		
		System.out.println("Enter long value");
		long l = sc.nextLong();
		System.out.println("Long value collected is" + l);
		System.out.println("---------");
		
		System.out.println("Enter float value");
		float f = sc.nextFloat();
		System.out.println("Float value collected is" + f);
		System.out.println("---------");
		
		System.out.println("Enter double value");
		double d = sc.nextDouble();
		System.out.println("Double value collected is" + d);
		System.out.println("---------");
		
		System.out.println("Enter boolean value");
		boolean b1 = sc.nextBoolean();
		System.out.println("Boolean value collected is" + b1);
		System.out.println("---------");
		
		System.out.println("Enter string value");
		String str = sc.next();
		System.out.println("String value collected is" + str);
		System.out.println("---------");

	}

}
