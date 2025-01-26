package com.gqt.basicsofjava.strings;
//Without using sort method
import java.util.Scanner;

public class Anagram1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Enter string 1:");
        String str1 = sc.nextLine().toLowerCase();
        
        System.out.println("Enter string 2:");
        String str2 = sc.nextLine().toLowerCase();
        
        
        if (str1.length() != str2.length()) {
            System.out.println("Not anagram");
            return;
        }

        int[] s1 = new int[26];
        int[] s2 = new int[26];

        for (int i = 0; i < str1.length(); i++) {
            s1[str1.charAt(i) - 'a']++;
            s2[str2.charAt(i) - 'a']++;
        }

        boolean isAnagram = true;
        for (int i = 0; i < 26; i++) {
            if (s1[i] != s2[i]) {
                isAnagram = false;
                break;
            }
        }

        if (isAnagram) {	
            System.out.println("Anagram");
        } else {
            System.out.println("Not anagram");
        }
    }
}
