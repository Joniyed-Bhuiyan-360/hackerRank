package com.company;

import java.util.*;

public class Main {
    static String happyLadybugs(String b) {
        int empty = 0;
        int unhappy = 0;
        Map<Character, Integer> color = new HashMap<Character, Integer>();
        for(int i=0;i<b.length();i++){
            char temp = b.charAt(i);
            if(temp == '_'){
                empty=1;
            }
            else{
                if ((i == 0 || b.charAt(i - 1) != temp) && (i == b.length() - 1 || b.charAt(i + 1) != temp)) {
                    unhappy = 1;
                }
                if(!color.containsKey(temp)){
                    color.put(temp,0);
                }
                color.put(temp,color.get(temp)+1);
            }
        }
        if(!color.values().isEmpty())
        {
            List<Integer> result = new ArrayList<>();
            result.addAll(color.values());

            int res = Collections.min(result);
            if(empty==1 && res>=2){
                return "YES";
            }
            else if(unhappy == 1){
                return "NO";
            }
        }
        return "YES";
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int g = input.nextInt();
        for (int i = 0; i < g; i++) {
            int n = input.nextInt();
            String b = input.next();
            System.out.println(happyLadybugs(b));
        }
    }
}
