package com.company;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String str = input.next();
        if(str.length()==1){
            System.out.println("YES");
            return;
        }
        List<Integer> temp = new ArrayList<>();
        List<Character> temp1 = new ArrayList<>();
        int count=0;
        for(int i=0;i<str.length();i++){
            char ch = str.charAt(i);
            for(int j=0;j<str.length();j++){
                if(ch==str.charAt(j)){
                    count++;
                }
            }
            if(!temp1.contains(ch)){
                temp.add(count);
                temp1.add(ch);
            }
            count=0;
        }

        int max = Integer.MIN_VALUE;
        int value=0;
        for(int i=0;i<temp.size();i++){
            int c = Collections.frequency(temp,temp.get(i));
            if(c>max)
            {
                max=c;
                value = temp.get(i);
            }
        }

        for(int i=0;i<temp.size();i++){
            if(temp.get(i)!=value){
                count++;
            }
        }
        if(count==1){
            System.out.println("YES");
        }
        else System.out.println("NO");
    }
}
