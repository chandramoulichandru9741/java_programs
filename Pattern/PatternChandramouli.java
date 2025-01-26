package com.gqt.basicsofjava.pattern;

import java.util.Scanner;

public class PatternChandramouli {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number");
        int n = sc.nextInt();
        for (int i = 0; i < n; i++) {
            // C
            for (int j = 0; j < n; j++) {
                if ((i == 0 && j != 0) || 
                    (j == 0 && i != 0 && i != n - 1) || 
                    (i == n - 1 && j != 0)) {
                    System.out.print("* ");
                } else {
                    System.out.print("  ");
                }
            }

            // H
            System.out.print("  ");
            for (int j = 0; j < n; j++) {
                if ((j == 0) || 
                    (j == n - 1) || 
                    (i == n / 2)) {
                    System.out.print("* ");
                } else {
                    System.out.print("  ");
                }
            }

            // A
            System.out.print("  ");
            for (int j = 0; j < n; j++) {
                if ((i == 0 && j != 0 && j != n - 1) || 
                    (j == 0 && i != 0) || 
                    (j == n - 1 && i != 0) || 
                    (i == n / 2)) {
                    System.out.print("* ");
                } else {
                    System.out.print("  ");
                }
            }

            // N
            System.out.print("  ");
            for (int j = 0; j < n; j++) {
                if ((j == 0) || 
                    (j == n - 1) || 
                    (i == j)) {
                    System.out.print("* ");
                } else {
                    System.out.print("  ");
                }
            }

            // D
            System.out.print("  ");
            for (int j = 0; j < n; j++) {
                if ((j == 0) || 
                    (i == 0 && j != n - 1) || 
                    (i == n - 1 && j != n - 1) || 
                    (j == n - 1 && i != 0 && i != n - 1)) {
                    System.out.print("* ");
                } else {
                    System.out.print("  ");
                }
            }

            // R
            System.out.print("  ");
            for (int j = 0; j < n; j++) {
                if ((j == 0) || 
                    (i == 0 && j != n - 1) || 
                    (i == n / 2 && j != n - 1) || 
                    (j == n - 1 && i != 0 && i < n / 2) || 
                    (i - j == n / 2)) {
                    System.out.print("* ");
                } else {
                    System.out.print("  ");
                }
            }

            // A
            System.out.print("  ");
            for (int j = 0; j < n; j++) {
                if ((i == 0 && j != 0 && j != n - 1) || 
                    (j == 0 && i != 0) || 
                    (j == n - 1 && i != 0) || 
                    (i == n / 2)) {
                    System.out.print("* ");
                } else {
                    System.out.print("  ");
                }
            }

            // M
            System.out.print("  ");
            for (int j = 0; j < n; j++) {
                if ((j == 0) || 
                    (j == n - 1) || 
                    (i == j && i <= n / 2) || 
                    (i + j == n - 1 && i <= n / 2)) {
                    System.out.print("* ");
                } else {
                    System.out.print("  ");
                }
            }

            // O
            System.out.print("  ");
            for (int j = 0; j < n; j++) {
                if ((i == 0 && j != 0 && j != n - 1) || 
                    (i == n - 1 && j != 0 && j != n - 1) || 
                    (j == 0 && i != 0 && i != n - 1) || 
                    (j == n - 1 && i != 0 && i != n - 1)) {
                    System.out.print("* ");
                } else {
                    System.out.print("  ");
                }
            }

            // U
            System.out.print("  ");
            for (int j = 0; j < n; j++) {
                if ((j == 0 && i != n - 1) || 
                    (j == n - 1 && i != n - 1) || 
                    (i == n - 1 && j != 0 && j != n - 1)) {
                    System.out.print("* ");
                } else {
                    System.out.print("  ");
                }
            }

            // L
            System.out.print("  ");
            for (int j = 0; j < n; j++) {
                if ((j == 0) || 
                    (i == n - 1)) {
                    System.out.print("* ");
                } else {
                    System.out.print("  ");
                }
            }

            // I
            System.out.print("  ");
            for (int j = 0; j < n; j++) {
                if ((i == 0) || 
                    (i == n - 1) || 
                    (j == n / 2)) {
                    System.out.print("* ");
                } else {
                    System.out.print("  ");
                }
            }

            System.out.println();
        }
        sc.close();
    }
}
