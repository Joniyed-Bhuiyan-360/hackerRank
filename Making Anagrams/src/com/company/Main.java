package com.company;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String str1 = input.next();
        String str2 = input.next();

        List<Integer> str1Freq = new ArrayList<>();
        List<Integer> str2Freq = new ArrayList<>();

        str1 = str1.toUpperCase();
        str2 = str2.toUpperCase();

        for(int i=0;i<26;i++){
            str1Freq.add(0);
            str2Freq.add(0);
        }
        for(int i=0;i<str1.length();i++){
            str1Freq.set(str1.charAt(i)-65,str1Freq.get(str1.charAt(i)-65)+1);
        }

        for(int i=0;i<str2.length();i++){
            str2Freq.set(str2.charAt(i)-65,str2Freq.get(str2.charAt(i)-65)+1);
        }

        int res = 0;

        for(int i=0;i<26;i++){
            res+=Math.abs(str1Freq.get(i)-str2Freq.get(i));
        }
        System.out.println(res);
    }
}
