package com.company;
import java.util.Arrays;
import java.util.Scanner;

public class Main {

    static boolean checkColumns(char[][] grid){
        for(int i = 0; i < grid[0].length; i++){
            for(int j = 1; j < grid.length; j++){
                if(grid[j][i] < grid[j-1][i])
                    return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int q = input.nextInt();

        while (q-->=0){
            int n = input.nextInt();

            char [][] str = new char[n][n];
            for(int i=0;i<n;i++){
                str[i]=input.next().toCharArray();
                Arrays.sort(str[i]);
            }
            System.out.println(checkColumns(str)?"YES":"NO");
        }
    }
}
