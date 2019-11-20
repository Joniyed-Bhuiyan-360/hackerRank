package com.company;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        List<Integer> arr = new ArrayList<>();
        for(int i=0;i<n;i++){
            arr.add(input.nextInt());
        }

        Collections.sort(arr);
        int count = 0, max = 0, flag = 0;
        for(int i=0;i<arr.size()-1;i++){
            if(arr.get(i+1)-arr.get(i)<2 && flag < 2){
                count++;
                max = Math.max(max,count);
                System.out.println(arr.get(i));
                if(arr.get(i+1)-arr.get(i)==1){
                    flag++;
                }
            }else {
                count = 0;
                flag = 0;
            }
        }
        System.out.println(max);
    }
}
