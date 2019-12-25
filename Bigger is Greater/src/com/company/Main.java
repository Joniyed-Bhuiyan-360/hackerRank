
package com.company;

import com.sun.org.apache.bcel.internal.generic.SWAP;

import java.sql.Array;
import java.text.CollationElementIterator;
import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int t = input.nextInt();
        while (t-->0){
            String s = input.next();
            char []ch = s.toCharArray();
            int n=ch.length,end=0;

            for(end=n-1;end>0;end--){
                if(ch[end]>ch[end-1]){
                    break;
                }
            }

            if(end==0){
                System.out.println("no answer");
            }else{
                int next = end,first=ch[end-1];
                for(int i=end+1;i<ch.length;i++){
                    if(ch[i]>first && ch[i]<ch[next]){
                        next = i;
                    }
                }
                char temp = ch[end-1];
                ch[end-1]=ch[next];
                ch[next]=temp;

                Arrays.sort(ch,end,n);

                System.out.println(new String(ch));
            }

        }
    }
}
