package com.company;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Main {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int t = input.nextInt();
        while (t-->0) {
            String s1 = input.next();
            String s2 = input.next();

            Set<Character> str1 = new HashSet<>();
            for (int i = 0; i < s1.length(); i++) {
                str1.add(s1.charAt(i));
            }
            Set<Character> str2 = new HashSet<>();
            for (int i = 0; i < s2.length(); i++) {
                str2.add(s2.charAt(i));
            }

            str1.retainAll(str2);
            if (str1.isEmpty()) System.out.println("NO");
            else System.out.println("YES");
        }
    }
}
