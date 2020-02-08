package com.company;


import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) {
        while (true) {
            Scanner input = new Scanner(System.in);
            System.out.println("\n\nEnter a String: ");
            String userInput = input.next();

            long start = System.currentTimeMillis();

            File file = new File("D:\\Intelijj_Idea\\SearchFromList\\data.txt");
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
            int total_wrod = (new ArrayList<>(Arrays.asList(str.split(" "))).size());

            List<String> list = new ArrayList<>(l1);
            List<String> temp1 = new ArrayList<>();
            List<String> temp = new ArrayList<>();

            list.forEach(value ->
            {
                if (value.charAt(0) == userInput.charAt(0) && value.length() >= userInput.length()) {
                    temp1.add(value);
                }
            });

            list.clear();
            list.addAll(temp1);

            for (int i = 1; i < userInput.length(); i++) {
                for (int j = 0; j < list.size(); j++) {
                    if (!(list.get(j).charAt(i) == userInput.charAt(i))) {
                        list.remove(j);
                        j--;
                    } else {
                        temp.add(list.get(j));
                    }
                }
            }

            System.out.println("\n\nTotal Word: " + total_wrod + "\n\n\nSuggested word: \n");

            if (list.size() > 10) {
                for (int i = 0; i < 10; i++) {
                    System.out.println(list.get(i));
                }
            } else {
                list.forEach(System.out::println);
                temp.forEach(System.out::println);
                if (temp1.size() > 10 - list.size()) {
                    for (int i = 0; i < 10 - list.size(); i++) {
                        System.out.println(temp1.get(i));
                    }
                } else temp1.forEach(System.out::println);
            }

            long end = System.currentTimeMillis();
            System.out.println("\n\nTime: " + ((Double.parseDouble("" + (end - start))) / 1000) + " s");
        }

    }
}
