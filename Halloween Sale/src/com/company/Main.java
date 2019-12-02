package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int p = input.nextInt();
        int d = input.nextInt();
        int m = input.nextInt();
        int s = input.nextInt();
        int res = 0;
        int count=p;

        while(count<=s){
            res++;
            p = Math.max(m,p-d);
            count += p;
        }
        System.out.println(res);
    }
}
