package com.techreturners.exercise005;

import java.util.HashSet;
import java.util.Locale;
import java.util.Set;

public class Exercise005 {

    public boolean isPangram(String input) {

        final int LOWER_ASCII = 96, HIGHER_ASCII = 122;

        /* set to lower case */
        input = input.toLowerCase(Locale.ROOT);

        /* put into Hash set to remove duplicates */
        Set<Character> inputString = new HashSet<>();

        for (int i = 0; i < input.length(); i++) {
            /* check to ensure we only collect lower case alphabet chars */
            if (LOWER_ASCII < input.charAt(i) && input.charAt(i) <= HIGHER_ASCII)
                inputString.add(input.charAt(i));
        }

        /* check length, if equal to length of alphabet then true/ */
        return (inputString.size() >= 26);
    }
}


