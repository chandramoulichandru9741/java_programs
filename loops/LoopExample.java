package com.gqt.basicsofjava.loops;

import java.util.Scanner;

public class LoopExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter name want to be looped for the 'for loop' :");
		String name1 = sc.next();
		System.out.println("Enter number want to looped number of times");
		int n1 = sc.nextInt();
		for(int i = 0; i < n1; i++) {
			System.out.println(name1);
		}
		System.out.println("-----------");
		
		
		System.out.println("Enter name want to be looped for the 'while loop' :");
		String name2 = sc.next();
		System.out.println("Enter number want to looped number of times");
		int n2 = sc.nextInt();
		int i = 0;
		while(i < n2) {
			System.out.println(name2);
			i++;
		}
		System.out.println("-----------");
		
		System.out.println("Enter name want to be looped for the 'do while loop' :");
		String name3 = sc.next();
		System.out.println("Enter number want to looped number of times");
		int n3 = sc.nextInt();
		int j = 0;
		do{
			System.out.println(name3);
			j++;
		}
		while(j < n3);
		
		System.out.println("-----------");
	}

}
