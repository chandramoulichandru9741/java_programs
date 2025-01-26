package com.gqt.basicsofjava.array;

import java.util.Scanner;
class ArrayOpertions1 {
	
	String[][] arr;
	
	void createArray(int class_count, int stu_count) {
		System.out.println("Array is creating.......");
		arr = new String[class_count][stu_count];
		System.out.println("Array is created..");
	}
	
	void insertData() {
		Scanner sc = new Scanner(System.in);
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


public class ArrayCode2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number of classes");
		int class_count = sc.nextInt();
		System.out.println("Enter number of students");
		int stu_count = sc.nextInt();
		ArrayOpertions1 ao = new ArrayOpertions1();
		ao.createArray(class_count, stu_count);
		System.out.println("==========");
		ao.insertData();
		System.out.println("==========");
		ao.displayData();
		sc.close();
	}

}
