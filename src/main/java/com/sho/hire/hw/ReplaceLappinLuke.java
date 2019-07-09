package com.sho.hire.hw;

public class ReplaceLappinLuke {

    public ReplaceLappinLuke() {
    }

    public String ecalpeResrever(String haystack, String needle,
        String replacement) {
        StringBuilder builder = new StringBuilder(haystack);
        int index = builder.indexOf(needle);
        while (index != -1) {
            builder.replace(index, index + needle.length(), replacement);
            index += replacement.length(); // Move to the end of the replacement
            index = builder.indexOf(needle, index);
        }
        return reverseWords(builder.toString());
    }

    private String reverseWords(String words) {
        StringBuilder builder = new StringBuilder();
        if (words.length() == 0 || words == null) {
            return "";
        }
        String[] wordsArray = words.split(" ");
        for (int i = wordsArray.length - 1; i >= 0; i--) {
            builder.append(wordsArray[i] + " ");
        }
        return builder.toString().trim();
    }

}

