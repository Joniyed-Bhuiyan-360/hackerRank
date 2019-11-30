package com.company;

import java.math.BigInteger;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        int m = input.nextInt();
        String[] Binary_str = new String[n];
        for(int i=0;i<n;i++){
            Binary_str[i] = input.next();
        }
        BigInteger[] binary = new BigInteger[n];

        for(int i=0;i<n;i++){
            binary[i] = new BigInteger(Binary_str[i],2);
        }
        int max = 0;
        int team = 0;
        for(int i=0;i<n;i++){
            for(int j=i+1;j<n;j++){
                BigInteger or = binary[i].or(binary[j]);
                if(or.bitCount()>max){
                    max = or.bitCount();
                    team = 1;
                }else if(or.bitCount()==max){
                    team++;
                }
            }
        }
        System.out.println(max+" "+team);
    }
}

