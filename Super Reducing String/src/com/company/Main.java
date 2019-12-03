package com.company;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String s = input.next();
        List<Character> str = new ArrayList<>();
        int i;
        for(i=0;i<s.length();i++){
            str.add(s.charAt(i));
        }
        i=0;
        while (i<str.size()-1){
            if(str.get(i)==str.get(i+1)){
                str.remove(i);
                str.remove(i);
                i=0;
            }
            else i++;
        }
        if(str.size()<=0){
            System.out.println("Empty String");
        }
        else{
            for(i=0;i<str.size();i++){
                System.out.print(str.get(i));
            }
        }
    }
}
