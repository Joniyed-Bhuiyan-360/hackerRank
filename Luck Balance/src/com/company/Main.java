package com.company;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        int m = input.nextInt();
        List<Long> l1 = new ArrayList<>();
        List<Long> l2 = new ArrayList<>();
        for(int i=0;i<n;i++){
            long a = input.nextLong();
            long b = input.nextLong();
            if(b==1){
                l1.add(a);
            }
            else l2.add(a);
        }

        Collections.sort(l1);
        long res = 0;
        int count = 0;
        for(int i=l1.size()-1;i>=0;i--){
            if(count<m){
                res += l1.get(i);
                count++;
            }
            else{
                res -= l1.get(i);
            }

        }
        for(int i=0;i<l2.size();i++){
            res+=l2.get(i);
        }
        System.out.println(res);

    }
}
