package com.company;

import generateText.GenerateText;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Hashtable;
import java.util.Random;

public class Homework implements GenerateText {
    private Hashtable alphabet;
    private String language;
    private ArrayList parameters;
    private Random random;

    public Homework(String language, ArrayList parameters) {
        alphabet = new Hashtable();
        random = new Random();
        this.language = language;
        this.parameters = parameters;

    }

    @Override
    public void generateAlphabet() {
        alphabet.put("ge", alphabet('ა','ჰ'));
        alphabet.put("en", alphabet('a','z'));
        alphabet.put("ru", alphabet('а','я'));

    }
    public String alphabet(char starter, char ender) {
        String alpha = "";
        for (int i=(int)starter;i<=(int)ender; i++) {
            alpha += (char)i;
        }
        return alpha;
    }
    @Override
    public char generateChar() {
        String symbols = alphabet.get(language).toString();
        char symbol = symbols.charAt(random.nextInt(symbols.length()));
        return symbol;
    }

    @Override
    public String generateWord(int amount) {
        String word = "";
        for (int i=0; i<amount; i++) {
            word += generateChar();
        }
        return word;
    }

    @Override
    public String generateSentence(int amt, int wordMin, int wordMax) {
        String sentence = "";
        int rand = random.nextInt(wordMax - wordMin + 1) + wordMin;
        for (int i=0; i<amt; i++) {
            if(i==1) {
                sentence += "    ";
            }
            for (int io=0; io < rand; io++) {
                sentence += generateWord(rand) + " ";
            }
        }
        return sentence;
    }

}