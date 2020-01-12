package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        long t = in.nextLong();
        long res = 3;
        while(t>res){
            t=t-res;
            res=2*res;
        }

        res = res-t+1;
        System.out.println(res);
    }
}
