package com.Arrays;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class PangramChecker {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a sentence: ");
        String input = scanner.nextLine().toLowerCase();
        boolean isPangram = checkPangram(input);
        if (isPangram) {
            System.out.println("The input is a pangram.");
        } else {
            System.out.println("The input is not a pangram.");
        }
    }

    public static boolean checkPangram(String input) {
        Set<Character> alphabetSet = new HashSet<>();
        for (char ch = 'a'; ch <= 'z'; ch++) {
            alphabetSet.add(ch);
        }

        for (char ch : input.toCharArray()) {
            alphabetSet.remove(ch);
            if (alphabetSet.isEmpty()) {
                return true;
            }
        }

        return false;
    }
}
