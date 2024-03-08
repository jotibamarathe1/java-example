package com.jotiba.practice.coreJava.strings.stringMethods;

public class IsBlankExample {
    public static void main(String[] args) {
        String myString1 = new String();
        if(myString1.isBlank()){
            System.out.println("This string is blank");
        }

        String myString2 = new String("string two");
        if(myString2.isBlank()){
            System.out.println("string two is not blank");
        }

        String myString3 = new String("string three");
        if(!myString3.isBlank()){
            System.out.println("string three is not blank\n");

            //there are three different strings in is blank.
            String sentence = "this is my string.";           //sentence contains blank space.
            var wordSets = "world1 world2 world3 ";           //set of words contains blank spaces.
            var blanks = "       ";                           //only blank space.

            System.out.println("isBlank (sentence) : " + sentence.isBlank());
            System.out.println("isBlank (wordSets) : " + wordSets.isBlank());
            System.out.println("isBlank (blanks) : " + blanks.isBlank());
        }
    }
}
