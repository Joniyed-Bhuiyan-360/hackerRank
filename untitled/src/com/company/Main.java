package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner mk = new Scanner(System.in);
        int t = mk.nextInt();
        while(t-->0)
        {
            int n = mk.nextInt();
            int Thiago = 0,Mateo = 0;
            while(n-->0)
            {
                int m = mk.nextInt();
                int k = mk.nextInt();

                int max = Math.max(m,k);
                int min= Math.min(m,k);

                if(m%k==0)
                {
                    Mateo++;
                }else if(coprime(m,k)==1)
                {
                    Thiago++;
                }else{
                    Thiago++;
                    Mateo++;
                }

            }
            if(Thiago>Mateo)
            {
                System.out.println("It's six baby!") ;
            }else{
                System.out.println("Corner taken quickly!");
            }
        }
    }

    public static int coprime(int a, int b)
    {
        if (a == 0 || b == 0)
            return 0;

        if (a == b)
            return a;

        if (a > b)
            return coprime(a-b, b);

        return coprime(a, b-a);
    }
}
