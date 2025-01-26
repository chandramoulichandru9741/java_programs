package com.gqt.basicsofjava.array;

import java.util.Scanner;
class ArrayOpertions2 {
	
	String[][] arr;
	Scanner sc = new Scanner(System.in);

	void createArray(int class_count) {
		System.out.println("Array is creating.......");
		arr = new String[class_count][];
		
		//Collecting number of students for class
		for(int i = 0; i < arr.length; i++) {
			System.out.println("Enter student count inside the class number " + (i+1));
			int stu = sc.nextInt();
			arr[i] = new String[stu];
		}
		
		System.out.println("Array is created..");
	}
	
	void insertData() {
		for(int i = 0; i < arr.length; i++) {
			System.out.println("Inside the class number - " + (i+1));
			for(int j = 0; j < arr[i].length; j++) {
				System.out.println("Enter name of the student -" + (j+1));
				arr[i][j] = sc.next();
			}
			
		}
		sc.close();
	}
	
	void displayData() {
		for(int i = 0; i < arr.length; i++) {
			System.out.println("Displaying names of the student in a class number " + (i+1));
			for(int j = 0; j < arr[i].length; j++) {
				System.out.println("name of the student number " + (j+1 ) + " is "+ arr[i][j]);
			}
		}
	}
	

}


public class ArrayCode3 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number of classes");
		int class_count = sc.nextInt();
	
		ArrayOpertions2 ao = new ArrayOpertions2();
		ao.createArray(class_count);
		System.out.println("==========");
		ao.insertData();
		System.out.println("==========");
		ao.displayData();
		sc.close();
	}

}
