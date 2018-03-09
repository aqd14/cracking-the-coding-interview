// Implement an algorithm to determine if a string contains all unique characters?
// What if you can't use additional data structure

// Example:
// s = "abcd" -> true
// s = "abad" -> false


public class IsUniqueSolution {

  public static boolean isUnique(String str) {
    int[] count = new int[256];

    for (int i = 0; i < str.length(); i++) {
      if (count[str.charAt(i)] == 0) {
        count[str.charAt(i)]++;
      } else {
        return false;
      }
    }
    return true;
  }

  public static void main(String args[]) {
    if (args.length > 0) {
        System.out.println("Is string " + args[0] + " unique? " + IsUniqueSolution.isUnique(args[0]));
    }
  }
}
