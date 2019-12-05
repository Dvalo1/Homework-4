package com.company;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        ArrayList params = new ArrayList();
        Scanner input = new Scanner(System.in);
        System.out.println("Choose language: en/ge/ru");
        String language = input.next();
        System.out.println("Choose parameters: e.g: p-2-s-5-7-w-7-9");
        String parameters = input.next();
        //String language = "en";
        //String parameters = "p-2-s-5-7-w-7-9";
        //System.out.println(language + " " + parameters);
        String[] parametersArray = parameters.split("-");
        for (String parameter: parametersArray) {
            try {
                params.add(Integer.parseInt(parameter));
            } catch (NumberFormatException e) {
                //e.printStackTrace();
            }
        }
        if (parameters.length() < 7) { // Not done (user input checking system)
            System.out.println("Wrong input, correct format: p-2-s-5-7-w-7-9");
        } else if (params.size() > 5) {
            System.out.println("Wrong input, correct format: p-2-s-5-7-w-7-9");
        }
        Homework homework = new Homework(language, params);
        homework.generateAlphabet();
        System.out.println(homework.generateSentence((int)params.get(0), (int)params.get(1), (int)params.get(2)));

    }
}