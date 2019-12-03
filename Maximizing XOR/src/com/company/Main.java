package com.company;

import java.math.BigInteger;
import java.text.CollationElementIterator;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int l = input.nextInt();
        int r = input.nextInt();
        BigInteger b;
        BigInteger a;
        List<Integer> res = new ArrayList<>();
        for(int i=l;i<=r;i++){
            a = new BigInteger(i+"");
            for(int j=l;j<=r;j++){
                b = new BigInteger(j+"");
                res.add((a.xor(b)).intValue());
            }
        }
        System.out.println(Collections.max(res));
    }
}
