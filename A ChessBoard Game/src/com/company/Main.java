package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int t = input.nextInt();
        while(t-->0){
            int a = input.nextInt();
            int b = input.nextInt();

            if(((a-1)/2)%2==0 && ((b-1)/2)%2==0){
                System.out.println("Second");
            }else{
                System.out.println("First");
            }
        }
    }
}
