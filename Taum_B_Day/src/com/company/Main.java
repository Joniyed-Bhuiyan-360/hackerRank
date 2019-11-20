package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int t = input.nextInt();
        while (t-->0){
            long b = input.nextLong();
            long w = input.nextLong();
            long bc = input.nextLong();
            long wc = input.nextLong();
            long z = input.nextLong();

            if(bc>wc+z){
                long res = b*(wc+z)+w*wc;
                System.out.println(res);
            }else if(wc>bc+z){
                long res = b*bc+w*(bc+z);
                System.out.println(res);
            }else {
                long res = b*bc+w*wc;
                System.out.println(res);
            }
        }
    }
}
