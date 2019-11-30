package com.company;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int t = input.nextInt();
        while(t-->0){
            int n = input.nextInt();
            int a = input.nextInt();
            int b = input.nextInt();
            List<Integer> res = new ArrayList<>();
            int i = 0;
            int j = n-1;
            while(n-->0){
                res.add((a*j)+(b*i));
                i++;
                j--;
            }
            System.out.println(res);
            res.clear();
        }
    }
}
