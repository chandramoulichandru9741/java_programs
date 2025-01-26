package com.gqt.basicsofjava.datatypes;

public class WrapperClass {
	public static void main(String[] args) {
		byte b = 126;
		Byte b1 = new Byte(b);
		System.out.println("Byte = " + b1);
		System.out.println("------");
		short s = 12600;
		Short s1 = new Short(s);
		System.out.println("Short = " + s1);
		System.out.println("------");
		int i = 12645;
		Integer i1 = new Integer(i);
		System.out.println("Int = " + i1);
		System.out.println("------");
		long l1 = 12698987l;
		Long l2 = new Long(l1);
		System.out.println("Long = " + l2);
		System.out.println("------");
		float f = 126.45f;
		Float f1 = new Float(f);
		System.out.println("Float = " + f1);
		System.out.println("------");
		double d = 1262323.2312321;
		Double d1 = new Double(d);
		System.out.println("Double = " + d1);
		System.out.println("------");
		char c = 'c';
		Character c1 = new Character(c);
		System.out.println("Character = " + c1);
		System.out.println("------");
		String s2 = "chandra";
		String s3 = new String(s2);
		System.out.println("String = " + s3);
		System.out.println("------");
		
	}
}
