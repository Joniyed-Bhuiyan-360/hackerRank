package com.company;

import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        int k = input.nextInt();

        List<Integer> arr = new ArrayList<>();
        for(int i=0;i<n;i++){
            arr.add(input.nextInt());
        }
        int freq[]= new int[k];
        Arrays.fill(freq,0);
        for (int i = 0; i < n; i++) {
            freq[arr.get(i) % k]++;
        }
        if (k % 2 == 0) {
            freq[k / 2] = Math.min(freq[k / 2], 1);
        }
        int res = Math.min(freq[0], 1);
        for (int i = 1; i <= k/2; i++)
            res += Math.max(freq[i], freq[k-i]);

        System.out.println(res);
    }
}
