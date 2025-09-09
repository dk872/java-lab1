package org.example;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a string of words:");
        String input = scanner.nextLine();

        String[] result = findWordWithMinUniqueChars(input);
        System.out.println("Result:");
        for (String word : result) {
            System.out.println(word);
        }

        scanner.close();
    }

    public static String[] findWordWithMinUniqueChars(String input) {
        if (input == null || input.trim().isEmpty()) {
            return new String[]{"No words entered"};
        }

        String[] words = input.trim().split("\\s+");

        if (words.length == 0 || (words.length == 1 && words[0].isEmpty())) {
            return new String[]{"No words entered"};
        }

        String minWord = words[0];
        int minCharsCount = countUniqueChars(minWord);

        for (int i = 1; i < words.length; i++) {
            int uniqueCount = countUniqueChars(words[i]);
            if (uniqueCount < minCharsCount) {
                minCharsCount = uniqueCount;
                minWord = words[i];
            }
        }

        return new String[]{minWord};
    }

    private static int countUniqueChars(String word) {
        char[] chars = word.toCharArray();
        boolean[] seen = new boolean[65536];
        int count = 0;

        for (char c : chars) {
            if (!seen[c]) {
                seen[c] = true;
                count++;
            }
        }
        return count;
    }
}
