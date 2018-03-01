// Problem: There are three types of edit that can be performed on string: insert new character,
// remove a character, replace a character. Given two string, write a function to check if they
// are one edit (or zero edit awa)

// Example
// pale, ple -> true
// pales, pale -> true
// pale, bale -> true
// pale, bake -> false

import java.lang.Math;

public class OneAwaySolution {

    // Use dynamic programming to calculate the edit distance
    // Time complexity: O(m*n)
    // Space complexity: O(m*n)
    public static boolean hasOneEditDP(String s1, String s2) {
        if (s1 == null || s2 == null) return false;

        int l1 = s1.length();
        int l2 = s2.length();

        int[][] editTable = new int[l1][l2];

        if (s1.charAt(0) == s2.charAt(0)) editTable[0][0] = 0;
        else editTable[0][0] = 1;

        for (int j = 1; j < l2; j++) {
            if (s1.charAt(0) == s2.charAt(j)) editTable[0][j] = editTable[0][j-1];
            else editTable[0][j] = editTable[0][j-1]+1;
        }

        for (int j = 1; j < l1; j++) {
            if (s2.charAt(0) == s1.charAt(j)) editTable[j][0] = editTable[j-1][0];
            else editTable[j][0] = editTable[j-1][0]+1;
        }

        for (int row = 1; row < l1; row++) {
            for (int col = 1; col < l2; col++) {
                if (s1.charAt(row) == s2.charAt(col)) {
                    editTable[row][col] = editTable[row-1][col-1];
                } else {
                    editTable[row][col] = 1+ Math.min(Math.min(
                                                    editTable[row-1][col-1],
                                                    editTable[row-1][col]),
                                                    editTable[row][col-1]
                                                    );
                }
            }
        }

        return editTable[l1-1][l2-1] <= 1;
    }

    // Using the fact that we only care about 1 edit so just compare length of
    // the string first, then move to check specific cases (insertion, deletion, replacement) later
    // Time complexity O(n)
    // Space complexity O(1)
    public static boolean hasOneEdit(String s1, String s2) {
        if (s1 == null || s2 == null) return false;

        if (s1.length() == s2.length()) { // check for one replacement
            return checkOneReplacement(s1, s2);
        } else if (Math.abs(s1.length() - s2.length()) == 1) {
            return checkOneReplacementOrInsertion(s1, s2);
        }
        return false;
    }

    private static boolean checkOneReplacement(String s1, String s2) {
        boolean reachedOneReplacement = false;
        for (int i = 0; i < s1.length(); i++) {
            if (s1.charAt(i) != s2.charAt(i)) {
                if (reachedOneReplacement) return false;
                reachedOneReplacement = true;
            }
        }
        return true;
    }

    private static boolean checkOneReplacementOrInsertion(String s1, String s2) {
        boolean reachedOneReplacementOrInsertion = false;

        int i = 0, j = 0;

        while (i < s1.length() && j < s2.length()) {
            if (s1.charAt(i) != s2.charAt(j)) {
                if (reachedOneReplacementOrInsertion) {
                    return false;
                } else {
                    reachedOneReplacementOrInsertion = true;
                }
                // Update running index of the shorter string
                if (s1.length() < s2.length()) {
                    i--;
                } else {
                    j--;
                }
            }
            i++;
            j++;
        }
        // All characters of shorter string have been matched
        // There is one insertion at the end of shorter string
        return true;
    }

    public static void main(String args[]) {
        if (args.length == 2) {
            System.out.println(OneAwaySolution.hasOneEdit(args[0], args[1]));
        }
    }
}
