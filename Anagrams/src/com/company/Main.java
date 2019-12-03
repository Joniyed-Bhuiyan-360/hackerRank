package com.company;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int t = input.nextInt();
        while (t-->0){
            String str = input.next();
            if(str.length()%2==1){
                System.out.println("-1");
            }
            else
            {
                String a = str.substring(0,str.length()/2);
                String b = str.substring(str.length()/2);
                List<Integer> aFreq = new ArrayList<>();
                List<Integer> bFreq = new ArrayList<>();

                for(int i=0;i<26;i++){
                    aFreq.add(0);
                    bFreq.add(0);
                }
                a = a.toUpperCase();
                b = b.toUpperCase();
                for(int i=0;i<a.length();i++){
                    aFreq.set(a.charAt(i)-65,aFreq.get(a.charAt(i)-65)+1);
                    bFreq.set(b.charAt(i)-65,bFreq.get(b.charAt(i)-65)+1);
                }
                int res=0;
                for(int i=0;i<aFreq.size();i++){
                    res += Math.abs(aFreq.get(i)-bFreq.get(i));
                }
                res /= 2;
                System.out.println(res);
            }
        }
    }
}