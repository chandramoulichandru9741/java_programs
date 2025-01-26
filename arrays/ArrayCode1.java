package com.gqt.basicsofjava.arrays;

import java.util.Scanner;
class ArrayOpertions {
	int size;
	int[] arr;
	
	void createArray(int count) {
		size = count;
		System.out.println("Array is creating.......");
		arr = new int[size];
		System.out.println("Array is created..");
	}
	
	void insertData() {
		Scanner sc = new Scanner(System.in);
		for(int i = 0; i < size; i++) {
			System.out.println("Enter student" + i + "marks");
			int marks = sc.nextInt();
			arr[i] = marks;
		}
		sc.close();
	}
	
	void displayData() {
		for(int i = 0; i < size; i++) {
			System.out.println("Student" + i + "marks is" + arr[i]);
		}
	}
	

}

class ArrayCode1{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int count = sc.nextInt();
		ArrayOpertions ao = new ArrayOpertions();
		ao.createArray(count);
		System.out.println("==========");
		ao.insertData();
		System.out.println("==========");
		ao.displayData();
		sc.close();
	}
}
