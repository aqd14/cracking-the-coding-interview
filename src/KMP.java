// Implementation of Knuth-Morris-Patt alogirhtm
// for searching substring

import java.util.Arrays;

public class KMP {

    public static int[] search(String pattern, String text) {
        int[] P = new int[text.length()]; // positions in S at which W is found
        int nP = 0; // number of positions found

        int[] T = precomputeT(pattern);

        int M = pattern.length();
        int N = text.length();
        int i = 0, j = 0;
        while (i < N) {
            if (pattern.charAt(j) == text.charAt(i)) {
                i++;
                j++;

                if (j == M) {
                    P[nP++] = i - j; // found one substring matching
                    j = T[j-1];
                }
            } else {
                if (j != 0) {
                    j = T[j-1];
                } else {
                    i++;
                }
            }
        }
        return P;
    }

    // construct kmp table
    private static int[] precomputeT(String pattern) {
        if (pattern == null || pattern.length() == 0) return null;

        int M = pattern.length();
        int[] T = new int[M];
        T[0] = 0;
        int i = 1; // the current position we are computing in T
        int j = 0; // the length of the longest previous prefix

        while (i < M) {
            if (pattern.charAt(i) == pattern.charAt(j)) {
                T[i] = j+1;
                i++;
                j++;
            } else {
                if (j > 0) {
                    j = T[j-1];
                } else {
                    T[i] = 0;
                    i++;
                }
            }
        }

        return T;
    }

    public static void main(String[] args) {
        String text = "ABC ABCABCDABDDAB ABCDABCDABDE";
        String pattern = "ABCDABD";
        int[] P = KMP.search(pattern, text);
        System.out.print(Arrays.toString(P));
    }
}
