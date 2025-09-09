package org.example;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class MainTest {

    @Test
    void testSingleWord() {
        String[] result = Main.findWordWithMinUniqueChars("hello");
        assertEquals("hello", result[0]);
    }

    @Test
    void testWordWithSpacesAround() {
        String[] result = Main.findWordWithMinUniqueChars("   hello   ");
        assertEquals("hello", result[0]);
    }

    @Test
    void testSameWords() {
        String[] result = Main.findWordWithMinUniqueChars("hello hello hello");
        assertEquals("hello", result[0]);
    }

    @Test
    void testTwoWordsDifferentUniqueCounts() {
        String[] result = Main.findWordWithMinUniqueChars("aaa bbbcd");
        assertEquals("aaa", result[0]);
    }

    @Test
    void testTwoWordsSameUniqueCounts() {
        String[] result = Main.findWordWithMinUniqueChars("abc bca");
        assertEquals("abc", result[0]);
    }

    @Test
    void testDifferentCaseWords() {
        String[] result = Main.findWordWithMinUniqueChars("Aa bb");
        assertEquals("bb", result[0]);
    }

    @Test
    void testEmptyString() {
        String[] result = Main.findWordWithMinUniqueChars("");
        assertEquals("No words entered", result[0]);
    }

    @Test
    void testOnlySpaces() {
        String[] result = Main.findWordWithMinUniqueChars("     ");
        assertEquals("No words entered", result[0]);
    }

    @Test
    void testNullInput() {
        String[] result = Main.findWordWithMinUniqueChars(null);
        assertEquals("No words entered", result[0]);
    }

    @Test
    void testMultipleSpacesBetweenWords() {
        String[] result = Main.findWordWithMinUniqueChars("   hi      hello     world   ");
        assertEquals("hi", result[0]);
    }

    @Test
    void testWordWithRepeatedCharacters() {
        String[] result = Main.findWordWithMinUniqueChars("abbbb zzzzzz bcd");
        assertEquals("zzzzzz", result[0]);
    }

    @Test
    void testSpecialCharacters() {
        String[] result = Main.findWordWithMinUniqueChars("!!! $$$ $$ %%");
        assertEquals("!!!", result[0]);
    }

    @Test
    void testNumbersAsWords() {
        String[] result = Main.findWordWithMinUniqueChars("1234 567 11111");
        assertEquals("11111", result[0]);
    }

    @Test
    void testUnicodeCharacters() {
        String[] result = Main.findWordWithMinUniqueChars("machine м'яч привіт");
        assertEquals("м'яч", result[0]);
    }

    @Test
    void testResultIsFirstWithSameUniqueCount() {
        String[] result = Main.findWordWithMinUniqueChars("dog cat bat");
        assertEquals("dog", result[0]);
    }

    @Test
    void testLongInputString() {
        String[] result = Main.findWordWithMinUniqueChars("74w8fuwosgjwr8gy9wh9goresjoi bye goodbye");
        assertEquals("bye", result[0]);
    }

    @Test
    void testEmojis() {
        String[] result = Main.findWordWithMinUniqueChars("😊😊😊 😂😂 😎");
        assertEquals("😊😊😊", result[0]);
    }
}
