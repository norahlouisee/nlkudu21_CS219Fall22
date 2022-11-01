package Exam2;

import java.io.IOException;
import java.net.URL;
import java.util.Arrays;
import java.util.Scanner;

public class Exam {

    public static String[] loadWords(String path, int n) {
        // connect to the webpage of speeds
        URL url = null;     // null is the nothing value
        Scanner s = null;

        try {
            url = new URL(path);
            s = new Scanner(url.openConnection().getInputStream());
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

        String[] words = new String[n];
        int i = 0;

        while (s.hasNextLine()) {
            String word = s.nextLine();
            if (isPalindrome(word))
                words[i++] = word;
        }

        return words;
    }

    public static String reverse(String s) {
        if (s.length() == 0)
            return "";
        else
            return reverse(s.substring(1)) + s.charAt(0);
    }

    public static boolean isPalindrome(String s) {
        return s.equals(reverse(s));
    }

    public static void swap(String[] aos, int i, int j) {
        String temp = aos[i];
        aos[i] = aos[j];
        aos[j] = temp;
    }

    public static void reverseArr(String[] a, int i, int j) {
        if (i < j) {
            swap(a, i, j);
            reverseArr(a, i + 1, j - 1);
        }
    }

    public static void main(String[] args) {
        String[] words = loadWords("http://10.60.15.25/~ehar/cs219/wordle-nyt-solutions.txt", 9);

        Arrays.sort(words);
        reverseArr(words, 0, words.length - 1);

        System.out.println(Arrays.toString(words));

    }

}
