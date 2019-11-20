package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String s = input.next();
        Double a = Math.sqrt(s.length());
        Double x = Math.ceil(a);

        char [] myChar = s.toCharArray();
        for(int i=0;i<x;i++){
            int j = i;
            while(j<=s.length()){
                System.out.print(myChar[j]);
                j = (int) (j+x);
            }
            System.out.print(" ");
        }
    }
}
