package com.sho.hire.hw;

import java.util.LinkedHashMap;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertTrue;

public class ReplaceLappinLukeTest {

    private static final ReplaceLappinLuke replaceReverser = new ReplaceLappinLuke();

    private static final LinkedHashMap<String, String[]> testMap = new LinkedHashMap<>();

    @Before
    public void setUp() {
        String[] testArray = new String[3];
        testArray[0] = "ABC";
        testArray[1] = "A";
        testArray[2] = "a";
        testMap.put("aBC", testArray);
        testArray = new String[3];
        testArray[0] = "AAA AAB BAA";
        testArray[1] = "AA";
        testArray[2] = "a";
        testMap.put("Ba aB aA", testArray);
        testArray = new String[3];
        testArray[0] = "I Work.";
        testArray[1] = "Work";
        testArray[2] = "Play";
        testMap.put("Play. I", testArray);
        testArray = new String[3];
        testArray[0] = "Tests are the best!";
        testArray[1] = "the best!";
        testArray[2] = "just ok.";
        testMap.put("ok. just are Tests", testArray);
        testArray = new String[3];
        testArray[0] = "abcdabcabcdabcfabcdabcabe";
        testArray[1] = "abcdabcabe";
        testArray[2] = "!!!!luke!!!!";
        testMap.put("abcdabcabcdabcf!!!!luke!!!!", testArray);
        testArray = new String[3];
        testArray[0] = "no match small haystack!";
        testArray[1] = "hugggggggggeeeeeeeeeeeeeeeeeeeeeeeeeeeeee neeeeeeeeeeeeeeeeeeeeedleeeeeeeeeeeeeeeeeeeeee";
        testArray[2] = "blah";
        testMap.put("haystack! small match no", testArray);
        testArray = new String[3];
        testArray[0] = " ......I love Star Trek.. ,..";
        testArray[1] = "Trek";
        testArray[2] = "Wars";
        testMap.put(",.. Wars.. Star love ......I", testArray);
    }

    @Test
    public void testResrever() {
        boolean success = false;
        String haystack, needle, replacement;
        String[] testArray;
        for (String key : testMap.keySet()) {
            long startTime = System.nanoTime();
            testArray = testMap.get(key);
            haystack = testArray[0];
            needle = testArray[1];
            replacement = testArray[2];
            success = replaceReverser.ecalpeResrever(haystack, needle, replacement).equals(key);
            if (success == false) {
                break;
            }
            System.out.println(
                "HAYSTACK: " + haystack + " NEEDLE: " + needle + " REPLACEMENT: " + replacement + " ANSWER: " + replaceReverser
                    .ecalpeResrever(
                        haystack, needle, replacement));
            long endTime = System.nanoTime();
            long diffTime = endTime - startTime;
            System.out.println("Elapsed time in milliseconds: " + diffTime);
        }
        assertTrue(success);
    }

}




