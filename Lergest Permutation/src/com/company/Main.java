package com.company;

import java.text.CollationElementIterator;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        int k = input.nextInt();
        List<Long> arr = new ArrayList<>();
        List<Long> temp = new ArrayList<>();
        for(int i=0;i<n;i++){
            arr.add(input.nextLong());
        }
        temp.addAll(arr);
        for(int i=0,j=0;j<k;i++,j++){
            long max = Collections.max(temp);
            int a = arr.indexOf(max);
            System.out.println(max+" "+a);
            if(arr.get(i)<max){
                Collections.swap(arr,i,a);
                temp.add(i,Long.MIN_VALUE);
            }
            if(i==arr.size()-1) i=0;
        }

    }
}
