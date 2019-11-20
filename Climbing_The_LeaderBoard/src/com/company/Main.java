package com.company;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        int[] scores = new int[n];
        for (int i = 0; i < scores.length; i++) {
            scores[i] = input.nextInt();
        }

        int[] ranks = new int[scores.length];
        int rank = 1;
        for (int i = 0; i < ranks.length; i++) {
            if (i > 0 && scores[i] != scores[i - 1]) {
                rank++;
            }
            ranks[i] = rank;
        }

        int m = input.nextInt();
        for (int i = 0; i < m; i++) {
            int alice = input.nextInt();
            int l = 0;
            int u = scores.length - 1;
            int a = 1;
            while (l <= u) {
                int mid = (l + u) / 2;
                if (alice == scores[mid]) {
                    a = ranks[mid];
                    break;
                } else if (alice < scores[mid]) {
                    a = ranks[mid] + 1;
                    l = mid + 1;
                } else {
                    u = mid - 1;
                }
            }
            System.out.println(a);
        }
    }
}
