// Write a function to replace all spaces in the string with "%20".
// You may assume that the string has suffcient at the end to hold the additional
// characters, and that you are given a "true" length of the strings

// Example
// s = "Hello World  Java                 ", 17
// urlified = "Hello%20World%20%20Java"

import java.util.Scanner;
import java.util.Arrays;

public class URLifySolution {

  public static String urlify(String str, int length) {
    if (str == null) return null;

    char[] characters = str.toCharArray();
    int numSpaces = 0;

    // Only count the spaces up to given length
    // Ignore all spaces after the last character
    for (int i = 0; i < length; i++) {
      if (characters[i] == ' ') numSpaces++;
    }

    int newLength = length + 2*numSpaces;

    // Create new character array with enough length
    // if (newLength > characters.length) {
    //   char[] aux = new char[newLength];
    //   for (int i = 0; i < characters.length; i++) {
    //     aux[i] = characters[i];
    //   }
    //   characters = aux;
    // }
    // characters[newLength] = null;

    for (int i = length-1;i >= 0; i--) {
      if (characters[i] != ' ') { // normal character
        characters[newLength-1] = characters[i];
        newLength -= 1;
      } else {
        characters[newLength-3] = '%';
        characters[newLength-2] = '2';
        characters[newLength-1] = '0';
        newLength -= 3;
      }
    }
    return new String(characters, 0, length + 2*numSpaces);
  }

  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    String s = scanner.nextLine();
    System.out.println("Before: " + s);
    int length = scanner.nextInt();
    String urlifiedStr = URLifySolution.urlify(s, length);
    System.out.println(urlifiedStr);
  }
}
