package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        long low = input.nextLong();
        long high = input.nextLong();
        if(low == 1){
            System.out.print(1+" ");
            low++;
        }
        int count=0;
        for(long i=low;i<=high;i++){
            String str = (i*i)+"";
            if(str.length()>1) {
                long a = Long.parseLong(str.substring(0,str.length()/2));
                long b = Long.parseLong(str.substring(str.length()/2));
                if(a+b==i){
                    System.out.print(i+" ");
                    count++;
                }
            }
        }
        if(count==0) System.out.println("INVALID RANGE");
    }
}
