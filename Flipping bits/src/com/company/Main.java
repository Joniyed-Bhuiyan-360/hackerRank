package com.company;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int q = input.nextInt();
        while(q-->0){
            long n = input.nextLong();
            BigInteger number = new BigInteger(n+"");
            String str = number.toString(2);
            List<Character> demo = new ArrayList<>();
            for(int i=0;i<32;i++){
                demo.add('1');
            }
            int j = str.length()-1;
            for(int i=demo.size()-1;i>=0;i--){
                if(str.charAt(j)=='0'){
                    demo.set(i,'1');
                    j--;
                }
                else if(str.charAt(j)=='1'){
                    demo.set(i,'0');
                    j--;
                }
                if(j<0) break;
            }
            str = "";
            for(int i=0;i<demo.size();i++){
                str+=demo.get(i);
            }
            number = new BigInteger(str,2);
            System.out.println(number);
            //System.out.println(str);
        }
    }
}
