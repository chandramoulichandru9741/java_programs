package com.gqt.basicsofjava.pattern;

import java.util.Scanner;

public class Pattern9 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number");
		int n = sc.nextInt();
		int count;
		for(int i = 1; i <= n; i++) {
			count = i;
			for(int j = 1; j <= n; j++) {
				System.out.print(count + " ");
				count+=n;
			}
			System.out.println();
		}
	}
}
