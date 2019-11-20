package com.company;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        String str = input.next();
        List<String> arr = new ArrayList<>();
        if(str.length()!=n) return;
        int res=0,j=1;
        str = str.trim();
        if(str == "0101010") System.out.println("Ue");
        for(int i=0;i<str.length()-2;i++,j++){
            String value = str.substring(i,j);
            System.out.println(value);
            if(str.substring(i,j)=="0"){
                System.out.println("Yes");
            }
        }
        System.out.println(arr);
    }
}
