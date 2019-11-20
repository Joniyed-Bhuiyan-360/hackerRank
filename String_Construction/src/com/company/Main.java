package com.company;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        List<Character> res = new ArrayList<>();
        String[] str = new String[n];
        for(int i=0;i<n;i++){
            str[i]= input.next();
            for(int j=0;j<str[i].length();j++){
                if(!res.contains(str[i].charAt(j))){
                    res.add(str[i].charAt(j));
                }
            }
            System.out.println(res.size());
            res.clear();
        }

    }
}
