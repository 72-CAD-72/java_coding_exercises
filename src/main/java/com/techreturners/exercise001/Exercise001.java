package com.techreturners.exercise001;

import java.util.List;

public class Exercise001 {

    public String capitalizeWord(String word) {
        return Character.toUpperCase(word.charAt(0)) + word.substring(1);
    }

    public int countLinuxUsers(List<User> users) {
        long countUsers = users.stream().filter(u -> u.getType() == "Linux").count();
        return (int)countUsers;
    }

    public String generateInitials(String firstName, String lastName) {
        return firstName.substring(0,1) + "." + lastName.substring(0,1);
    }

    public double addVat(double originalPrice, double vatRate) {
        return Math.round((originalPrice + (originalPrice * (vatRate/100)))*100.0)/100.0;
    }

    public String reverse(String sentence) {
        StringBuilder stringBuilder = new StringBuilder();

        for(int i=sentence.length()-1; i >= 0; i--)
            stringBuilder.append(sentence.charAt(i));

        return stringBuilder.toString();
    }
}
