package com.jotiba.practice.coreJava.strings.stringMethods;

import java.util.stream.Stream;

public class LinesExample {
    public static void main(String[] args) {
        String sentence = "This\nis\nmy\nstring.";    //sentence contains blank spaces
        Stream<String> lines = sentence.lines();
        lines.forEach(System.out::println);
    }
}
