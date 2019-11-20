package com.company;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String s = input.nextLine();
        Map<Character, Integer> myMap = new HashMap<>();
        for(char letter : s.toCharArray())
        {
            if(myMap.containsKey(letter))
                myMap.put(letter, myMap.get(letter) + 1);
            else
                myMap.put(letter, 1);
        }
        Set<Integer> myList = new HashSet<>();
        for(int freq : myMap.values())
        {
            myList.add(freq);
        }
        if(myList.size() > 2)
            System.out.println("NO");
        else if(myList.size() == 1)
            System.out.println("YES");
        else
        {
            int f1 = 0;
            int f2 = 0;
            int f1Count = 0;
            int f2Count = 0;
            int i = 0;
            for(int n : myList)
            {
                if(i == 0) f1 = n;
                else f2 = n;
                i++;
            }
            for(int freq : myMap.values())
            {
                if(freq == f1) f1Count++;
                if(freq == f2) f2Count++;
            }
            if((f1 == 1 && f1Count == 1 ) || (f2 == 1 && f2Count == 1 ))
                System.out.println("YES");
            else if ((Math.abs(f1 - f2)  == 1) && (f1Count == 1 || f2Count == 1))
                System.out.println("YES");
            else
                System.out.println("NO");
        }
    }
}
