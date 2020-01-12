package com.company;

import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String s = input.next();
        Set<Integer> res = new HashSet<>();
        int w = 0;
        char prevLetter = ' ';

        for(int i=0;i<s.length();i++){
            if(s.charAt(i)!=prevLetter){
                w=s.charAt(i)-'a'+1;
            }else{
                w+=s.charAt(i)-'a'+1;
            }
            res.add(w);
            prevLetter = s.charAt(i);
        }

        int q = input.nextInt();
        while(q-->0){
            int test = input.nextInt();
            if(res.contains(test)) System.out.println("Yes");
            else System.out.println("No");
        }

    }
}
