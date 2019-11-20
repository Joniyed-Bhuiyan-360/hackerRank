package com.company;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        int k = input.nextInt();
        List<Integer> s = new ArrayList<>();
        for(int i=0;i<n;i++){
            s.add(input.nextInt());
        }

        List<Integer> result = new ArrayList<>();
        int res=0;
        for(int i=0;i<s.size()-1;i++){
            result.add(s.get(i));
            for(int j=i+1;j<s.size();j++){
                if((s.get(i)+s.get(j))%k!=0){
                    result.add(s.get(j));
                }
                System.out.println(result);
                if(result.size()>res) res = result.size();
                result.clear();
            }
        }
        System.out.println(res);
    }
}
