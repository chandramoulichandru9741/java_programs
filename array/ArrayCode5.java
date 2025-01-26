package com.gqt.basicsofjava.array;

import java.util.Scanner;
class ArrayOpertions4 {
	
	int[][] m1;
	int[][] m2;
	int[][] res;
	
	Scanner sc = new Scanner(System.in);

	void createArray(int count, int count) {
		System.out.println("Array is creating.......");
		m1 = new int[count][count];
		m2 = new int[count][count];
		res = new int[count][count];

		//Collecting class count
		
		
		
		System.out.println("Array is created..");
	}
	
	void insertData() {
		for(int i = 0; i < m1.length; i++) {
			for(int j = 0; j < m1[i].length; j++) {
				m1[i][j] = sc.nextInt();
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


public class ArrayCode5 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number of colleges");
		int class_count = sc.nextInt();
	
		ArrayOpertions4 ao = new ArrayOpertions4();
		ao.createArray(class_count);
		System.out.println("==========");
		ao.insertData();
		System.out.println("==========");
		ao.displayData();
		sc.close();
	}

}
