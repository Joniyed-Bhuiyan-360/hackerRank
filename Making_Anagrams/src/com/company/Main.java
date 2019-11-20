package com.company;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String str = input.next();
        String str1 = input.next();
        List<Character> temp = new ArrayList<>();
        for(int i=0;i<str.length();i++){
            temp.add(str.charAt(i));
        }
        List<Character> temp1 = new ArrayList<>();
        for(int i=0;i<str1.length();i++){
            temp1.add(str1.charAt(i));
        }
        Collections.sort(temp);
        Collections.sort(temp1);

//        int res=0;
//        System.out.println(temp+"\n"+temp1);
//        for(int i=0;i<temp.size();i++){
//            if(temp.get(i)!=temp1.get(i)){
//                res++;
//                temp.remove(i);
//                temp1.remove(i);
//                i--;
//            }
//        }
        System.out.println(temp+"\n"+temp1);
    }
}
