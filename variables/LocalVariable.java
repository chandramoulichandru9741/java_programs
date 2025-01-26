package com.gqt.basicsofjava.variables;

class Calculator{
	void add() {
		int a = 20;
		int b = 10;
		int c = a + b;
		System.out.println(c);
	}
	
	void sub(int a, int b) {
		int c = a - b;
		System.out.println(c);
	}
}

public class LocalVariable {

	public static void main(String[] args) {
		Calculator c = new Calculator();
		c.add();
		c.sub(20, 10);
	}

}
