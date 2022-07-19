package com.stackroute.strings;

import java.util.Arrays;

public class Anagram {
    //write logic to check given two phrases are anagrams or not and return result
    public String checkAnagrams(String phraseOne, String phraseTwo) {
    	if (phraseOne.length() == 0 || phraseTwo.length() == 0) {
            return "Give proper input not empty phrases";
        }

        phraseOne = phraseOne.replaceAll("//s", "");
        phraseTwo = phraseTwo.replaceAll("//s","");
        char[] phraseOneArray = phraseOne.toCharArray();
        char[] phraseTwoArray = phraseTwo.toCharArray();

        Arrays.sort(phraseOneArray);
        Arrays.sort(phraseTwoArray);

        if (!Arrays.equals(phraseOneArray, phraseTwoArray)) {
            return "Given phrases are not anagrams";
        }
        return "Given phrases are anagrams";
    }
}
