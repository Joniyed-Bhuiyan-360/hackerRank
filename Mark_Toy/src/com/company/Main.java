package com.company;

import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        int k = input.nextInt();
        long price[] = new long[n];
        for(int i=0;i<n;i++){
            price[i]=input.nextLong();
        }

        Arrays.sort(price);

        long res = 0;
        int count=0;
        for(int i=0;i<n;i++){
            res += price[i];
            if(res<=k){
                count++;
            }
        }
        System.out.println(count);
    }
}
