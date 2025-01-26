package com.gqt.basicsofjava.pattern;

import java.util.Scanner;

public class Pattern16 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number");
		int n = sc.nextInt();
		int count;
		for(int i = 1; i <=n; i++) {
			count = 1;
			for(int j = n; j >=i; j--) {
				System.out.print(count + " ");
				count++;
			}
			
			System.out.println();
			
		}
	}

}
