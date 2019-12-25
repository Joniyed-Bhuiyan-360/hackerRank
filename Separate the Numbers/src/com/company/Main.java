package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int q = input.nextInt();
        while (q-->0){
            String str = input.next();
            int l = str.length()/2;
            String validString = "";
            boolean no = true;
            for(int i=1;i<=l;i++){
                validString = str.substring(0,i);
                long num = Long.parseLong(validString);
                long res = num;
                while (validString.length()<str.length()){
                    validString+=(++num)+"";
                }
                if(validString.equals(str)){
                    System.out.println("YES "+res);
                    no = false;
                    break;
                }
            }
            if(no){
                System.out.println("NO");
            }
        }
    }
}
