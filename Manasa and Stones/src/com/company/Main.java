package com.company;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int t = input.nextInt();
        while(t-->0){
            int n = input.nextInt();
            int a = input.nextInt();
            int b = input.nextInt();
            List<Integer> res = new ArrayList<>();
            int i = 0;
            int j = n-1;
            int temp=0;
            while(n-->0){
                if(a>b){
                    temp = (a*i)+(b*j);
                    if(!res.contains(temp)){
                        res.add(temp);
                    }
                    i++;
                    j--;
                }else{
                    temp = (a*j)+(b*i);
                    if(!res.contains(temp)){
                        res.add(temp);
                    }
                    i++;
                    j--;
                }
            }
            for(int k=0;k<res.size();k++){
                System.out.print(res.get(k)+" ");
            }
            res.clear();
        }
    }
}
