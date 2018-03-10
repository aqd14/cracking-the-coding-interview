// Given two strings, write a method to check if one is a permutation of other
// Example:
// s1 = abc, s2 = bac -> true
// s1 = abc, s2 = def -> false

public class CheckPermutation {

  // Counting the occurences of characters in s1
  // Check with s2's characters
  public static boolean checkPermutation(String s1, String s2) {
	if (s1 == null || s2 == null) return false;

	if (s1.length() != s2.length()) return false;

	int[] count = new int[256];

	for (int i = 0; i < s1.length(); i++) {
	  count[s1.charAt(i)]++;
	}

	for (int j = 0; j < s2.length(); j++) {
      count[s2.charAt(j)]--;
	  if (count[s2.charAt(j)] < 0) return false;
	}

	return true;
  }
}
