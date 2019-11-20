package com.company;

import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        List<Long> arr = new ArrayList<>();
        for(int i=0;i<n;i++){
            arr.add(input.nextLong());
        }
        Collections.sort(arr);
        int count=1;
        long a = arr.get(0)+4;
        for(int i=0;i<arr.size();i++){
            if(arr.get(i)>a){
                count++;
                a = arr.get(i)+4;
            }
        }
        System.out.println(count);
    }
}
