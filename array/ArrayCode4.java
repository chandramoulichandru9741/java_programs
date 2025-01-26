package com.gqt.basicsofjava.array;

import java.util.Scanner;
class ArrayOpertions3 {
	
	int[][][] arr;
	int sum = 0;
	Scanner sc = new Scanner(System.in);

	void createArray(int class_count) {
		System.out.println("Array is creating.......");
		arr = new int[class_count][][];
		
		//Collecting class count
		for(int i = 0; i < arr.length; i++) {
			System.out.println("Enter class count in college number " + (i+1));
			int cla = sc.nextInt();
			arr[i] = new int[cla][];
		}
		
		System.out.println("------------");
		System.out.println("Collecting student count");
		for(int i = 0; i < arr.length; i++) {
			System.out.println("College number " + (i+1));

			for(int j = 0; j < arr[i].length; j++) {
				System.out.println("Enter student number for class room number " + (j+1));
				int stu = sc.nextInt();
				arr[i][j] = new int[stu];

			}
		}
		
		System.out.println("Array is created..");
	}
	
	void insertData() {
		for(int i = 0; i < arr.length; i++) {
			System.out.println("================");
			System.out.println("Inside the college number - " + (i+1));
			for(int j = 0; j < arr[i].length; j++) {
				System.out.println("Inside class room number -" + (j+1));
				for(int k = 0; k < arr[i][j].length; k++) {
					System.out.println("Enter fees for student number " + (k+1));
					arr[i][j][k] = sc.nextInt();
					sum += arr[i][j][k];
				}
			}
			
		}
		sc.close();
	}
	
	void displayData() {
		for(int i = 0; i < arr.length; i++) {
			System.out.println("================");
			System.out.println("Inside the college number - " + (i+1));
			for(int j = 0; j < arr[i].length; j++) {
				System.out.println("Inside class room number -" + (j+1));
				for(int k = 0; k < arr[i][j].length; k++) {
					System.out.println("The fees for student number " + arr[i][j][k]);
					
				
				}
			}
			
		}
		System.out.println("===================");
		System.out.println("Total sum of the fees of all the students " + sum);
	}
	

}


public class ArrayCode4 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number of colleges");
		int class_count = sc.nextInt();
	
		ArrayOpertions3 ao = new ArrayOpertions3();
		ao.createArray(class_count);
		System.out.println("==========");
		ao.insertData();
		System.out.println("==========");
		ao.displayData();
		sc.close();
	}

}
