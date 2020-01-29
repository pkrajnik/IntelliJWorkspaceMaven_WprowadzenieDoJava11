package com.sdacademy.guavademo;

import com.google.common.base.Joiner;
import com.google.common.base.Strings;
import com.google.common.base.Splitter;

public class Main {

    public static void main(String[] args) {

        Joiner joiner = Joiner.on(";;");
        String[] words = {"Ala", "ma", "kota", "i", "psa"};
        String result = "[" + joiner.join(words) + "]";
        System.out.println(result);

        String repeatedJA = Strings.repeat("JA", 5);
        System.out.println(repeatedJA);

        String text = "the ,quick, ,brown, fox, jumps, over, the, lazy, little dog.";
        Iterable<String> splittedText = Splitter.on(',').trimResults().omitEmptyStrings().split(text);

        for (String s : splittedText) {
            System.out.println(s);
        }
    }
}
