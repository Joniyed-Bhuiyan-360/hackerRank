package com.company;

import java.math.BigInteger;
import java.util.*;

public class Main {
    static int compareFunction(String s1, String s2)
    {
        if(s1.length() > s2.length()) return 1;
        if(s1.length() < s2.length()) return -1;
        for(int i = 0; i < s1.length(); i++)
        {
            if((int)s1.charAt(i) > (int)s2.charAt(i)) return 1;
            if((int)s1.charAt(i) < (int)s2.charAt(i)) return -1;
        }
        return 0;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int n = input.nextInt();
        int sum = 0;


    }
}
