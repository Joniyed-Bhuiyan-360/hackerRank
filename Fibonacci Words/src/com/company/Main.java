package com.company;

import com.sun.xml.internal.ws.api.model.wsdl.WSDLOutput;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    static int getResult(String one, String two, BigInteger n) {
        List<BigInteger> fcount = new ArrayList<BigInteger>();
        BigInteger oneInt = BigInteger.valueOf(one.length());
        BigInteger twoInt = BigInteger.valueOf(two.length());
        fcount.add(oneInt);
        fcount.add(twoInt);
        int result = -1;
        do{
            fcount.add(oneInt.add(twoInt));
            oneInt = twoInt;
            twoInt = fcount.get(fcount.size()-1);
        }while(twoInt.compareTo(n)<0);
        int i = fcount.size() -3;
        int currentIndex = i;
        while(i>=0) {
            BigInteger current = fcount.get(i);
            if(n.compareTo(current)>0) {
                n = n.subtract(current);
                i--;
                currentIndex = i;
            }
            else
            {
                if(i==0)
                    result = one.charAt(n.intValue() - 1);
                if(i==1)
                    result = two.charAt(n.intValue() - 1);
                i = currentIndex - 2;
                currentIndex = i;
            }
        }
        if(result == -1)
            result = two.charAt(n.intValue() - 1);
        return (result - 48);
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        long n = input.nextLong();

        while(n-->0) {

            String a = input.next();
            String b = input.next();
            String index = input.next();

            BigInteger bigInteger = new BigInteger(index);

            System.out.println(getResult(a, b, bigInteger));
        }
    }
}
