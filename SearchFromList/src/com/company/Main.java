package com.company;


import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Enter a String: ");
        String userInput = input.next();
        long start = System.currentTimeMillis();
        File file = new File("C:\\Users\\joniyed\\Desktop\\routine.txt");
        StringBuilder stringBuilder = new StringBuilder();

        try {
            BufferedReader bufferedReader = new BufferedReader(new FileReader(file));
            String st;
            while ((st = bufferedReader.readLine()) != null) {
                stringBuilder.append(st).append(" ");
            }
        } catch (IOException ex) {
            ex.printStackTrace();
        }
        String str = stringBuilder.toString();
        SortedSet<String> l1 = new TreeSet<>(Arrays.asList(str.split(" ")));
        List<String> l2 = new ArrayList<>(Arrays.asList(str.split(" ")));

        List<String> list = new ArrayList<>(l1);
        List<String> temp = new ArrayList<>();
        List<String> temp1 = new ArrayList<>();

            for (int i = 0; i < list.size(); i++) {
                if (list.get(i).charAt(0) == userInput.charAt(0) && list.get(i).length()>=userInput.length()) {
                    temp1.add(list.get(i));
                }
            }

            for(int i=1;i<userInput.length();i++){
                for(int j=0;j<temp1.size();j++){
                    if(temp1.get(j).charAt(i)==userInput.charAt(i)){
                        temp.add(temp1.get(j));
                    }
                }
            }
            if(temp.size()<5){
                temp.addAll(temp1);
            }


        System.out.println("Total Word: "+ l2.size()+"\n\n\nSuggested word: \n\n");
            for(int i=0;i<10;i++){
                System.out.println(temp1.get(i)+"\n");
            }
        long end = System.currentTimeMillis();
        System.out.println("Time: "+(end-start));

    }
}
