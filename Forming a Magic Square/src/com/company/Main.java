package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int []arr = new int[9];

        for(int i=0;i<9;i++) {
            arr[i] = input.nextInt();
        }

        int temp[][]=new int[][]{
                {8,1,6,3,5,7,4,9,2},
                {8,3,4,1,5,9,6,7,2},
                {6,1,8,7,5,3,2,9,4},
                {4,3,8,9,5,1,2,7,6},
                {4,9,2,3,5,7,8,1,6},
                {6,7,2,1,5,9,8,3,4},
                {2,9,4,7,5,3,6,1,8},
                {2,7,6,9,5,1,4,3,8}
        };


        int min = Integer.MAX_VALUE;
        int total = 0;
        System.out.println();

        for(int j=0;j<8;j++) {
            for (int k = 0; k < 9; k++) {
                if(arr[k]!=temp[j][k]){
                    total+=Math.abs(arr[k]-temp[j][k]);
                }
            }
            if(min>total)min=total;
            total = 0;
        }
        System.out.print(min);
    }
}
