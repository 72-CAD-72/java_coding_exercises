package com.techreturners.exercise005;

import java.util.HashSet;
import java.util.Locale;
import java.util.Set;

public class Exercise005 {

    public boolean isPangram(String input) {

        // set to lower case, remove spaces and punctuation
        input = input.toLowerCase(Locale.ROOT);
        input = input.replaceAll("\\s+","");
        input = input.replaceAll("\\p{Punct}+", "");

        // put into Hash set to remove duplicates
        Set<Character> inputString = new HashSet<>();
        for(int i=0; i < input.length(); i++)
        {
            inputString.add(input.charAt(i));
        }

        // check length, if equal to length of alphabet then true/
        return (inputString.size() >= 26);

        }
    }


