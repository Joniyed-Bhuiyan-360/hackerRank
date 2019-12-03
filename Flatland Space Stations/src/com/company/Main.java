package com.company;

import com.sun.media.jfxmediaimpl.HostUtils;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Input the value of n");
        int n = input.nextInt();
        System.out.println("Input the value of m");
        int m = input.nextInt();
        System.out.println("input the value of m stations ....");
        List<Integer> stations = new ArrayList<>();
        for(int i=0;i<m;i++){
            stations.add(input.nextInt());
        }
        List<Integer> count = new ArrayList<>();
        int min = 0;
        Collections.sort(stations);
        for(int i=0;i<n;i++){
            min = Math.abs(stations.get(0)-i);
            for(int j=0;j<stations.size();j++) {
                if (i>=stations.get(j)) {
                    min = Math.abs(Math.min(min,stations.get(j)-i));
                }
                else{
                    min = Math.abs(Math.min(min,stations.get(j)-i));
                    count.add(min);
                    min = 0;
                    break;
                }
                if(j==stations.size()-1 && i>=stations.get(j)){
                    count.add(min);
                    min=0;
                    break;
                }
            }
        }
        System.out.println(Collections.max(count));

    }
}
