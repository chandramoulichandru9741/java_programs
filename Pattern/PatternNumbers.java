package com.gqt.basicsofjava.pattern;

import java.util.Scanner;

public class PatternNumbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number (size of pattern):");
        int n = sc.nextInt();

        // Printing numbers 0-9
        for (int i = 0; i < n; i++) {
            // 0
            for (int j = 0; j < n; j++) {
                if ((j == 0 && i != 0 && i != n - 1) || 
                    (j == n - 1 && i != 0 && i != n - 1) || 
                    (i == 0 && j != 0 && j != n - 1) || 
                    (i == n - 1 && j != 0 && j != n - 1)) {
                    System.out.print("* ");
                } else {
                    System.out.print("  ");
                }
            }

            // 1
            System.out.print("  ");
            for (int j = 0; j < n; j++) {
                if (j == n / 2) {
                    System.out.print("* ");
                } else {
                    System.out.print("  ");
                }
            }

            // 2
            System.out.print("  ");
            for (int j = 0; j < n; j++) {
                if (i == 0 || (j == n - 1 && i <= n/2) || i == n/2 || ( j == 0 && i >= n/2) || i == n-1) {
                    System.out.print("* ");
                } else {
                    System.out.print("  ");
                }
            }

            // 3
            System.out.print("  ");
            for (int j = 0; j < n; j++) {
                if ((i == 0) || 
                    (i == n - 1 && j != n - 1) || 
                    (j == n - 1 && i != n / 2) || 
                    (i == n / 2 && j != n - 1)) {
                    System.out.print("* ");
                } else {
                    System.out.print("  ");
                }
            }

            // 4
            System.out.print("  ");
            for (int j = 0; j < n; j++) {
                if ((j == n - 1) || 
                    (i == n / 2) || 
                    (i <= n/2 && j == 0)) {
                    System.out.print("* ");
                } else {
                    System.out.print("  ");
                }
            }

            // 5
            System.out.print("  ");
            for (int j = 0; j < n; j++) {
                if (i == 0 || (j == 0 && i <= n/2) || (i == n/2) || (j == n-1 && i >= n/2) || (i == n-1)) {
                    System.out.print("* ");
                } else {
                    System.out.print("  ");
                }
            }

            // 6
            System.out.print("  ");
            for (int j = 0; j < n; j++) {
                if ((j == 0) || 
                    (i == 0) || 
                    (i == n - 1 && j != n - 1) || 
                    (i == n / 2 && j != 0) || 
                    (i == n - 1 && j != 0) ||
                    (j == n-1 && i >=n/2)) {
                    System.out.print("* ");
                } else {
                    System.out.print("  ");
                }
            }

            // 7
            System.out.print("  ");
            for (int j = 0; j < n; j++) {
                if ((i == 0) || 
                    (j == n - 1)) {
                    System.out.print("* ");
                } else {
                    System.out.print("  ");
                }
            }

            // 8
            System.out.print("  ");
            for (int j = 0; j < n; j++) {
                if ((i == 0 && j != 0 && j != n - 1) || 
                    (i == n - 1 && j != 0 && j != n - 1) || 
                    (i == n / 2 && j != 0 && j != n - 1) || 
                    (j == 0 && i != 0 && i != n - 1) || 
                    (j == n - 1 && i != 0 && i != n - 1)) {
                    System.out.print("* ");
                } else {
                    System.out.print("  ");
                }
            }

            // 9
            System.out.print("  ");
            for (int j = 0; j < n; j++) {
                if ((i == 0 && j != 0 && j != n - 1) || 
                    (i == n - 1) || 
                    (j == n - 1) || 
                    (i == n / 2 && j != n - 1)||
                    (j == 0 && i <= n/2)) {
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
