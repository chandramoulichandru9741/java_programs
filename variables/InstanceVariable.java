package com.gqt.basicsofjava.variables;

import java.util.Scanner;

class Dog{
	String name;
	String color;
	String breed;
	int age;
	int cost;
	
	void addData() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the name of the Dog");
		name = sc.next();
		System.out.println("Enter the color of the Dog");
		color = sc.next();
		System.out.println("Enter the breed of the Dog");
		breed = sc.next();
		System.out.println("Enter the age of the Dog");
		age = sc.nextInt();
		System.out.println("Enter the cost of the Dog");
		cost = sc.nextInt();
	}
	
	void displayData() {
		System.out.println(name);
		System.out.println(color);
		System.out.println(breed);
		System.out.println(age);
		System.out.println(cost);
	}
}

public class InstanceVariable {

	public static void main(String[] args) {
		Dog d1 = new Dog();
		d1.displayData();
		System.out.println("-----------");
		d1.addData();
		d1.displayData();
	}

}
