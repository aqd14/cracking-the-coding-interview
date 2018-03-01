// Problem: Given a string, check if it's a permutation of a palindrome
// Example: abdaccb -> true. abcdcba

import java.util.Arrays;

public class PalindromePermutationSolution {

    // O(n) solution that requires O(1) space complexity
    // with the assumption that the string contains only ASCII encoding
    // public static boolean isPalindromePermutation(String str) {
    //
    // }

    // O(nlogn) solution that requires O(1) space complexity
    public static boolean isPalindromePermutation(String str) {
        if (str == null) return false;
        if (str.length() == 1) return true;

        str = str.toLowerCase();
        char[] characters = str.toCharArray();
        Arrays.sort(characters);

        int l;
        char c;
        boolean seenOddBefore = false; // have we seen the odd length character before?
        boolean hasOddLength = characters.length % 2 != 0;
        for (int i = 0; i < characters.length;) {
            l = 0;
            c = characters[i];
            while (i < characters.length && c == characters[i]) {
                i++;
                l++;
            }

            if (l % 2 != 0) {
                if (seenOddBefore == true) {
                    return false;
                }
                seenOddBefore = true;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        // args = new String[1];
        // args[0] = "ababce";
        if (args.length == 1) {
            boolean result = PalindromePermutationSolution.isPalindromePermutation(args[0]);
            System.out.println("String " + args[0] + ": " + result);
        }
    }
}
