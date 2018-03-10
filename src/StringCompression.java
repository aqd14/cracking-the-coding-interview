// Problem: Implement a simple string compression using the counts of repeated characters
// For example, string aabcccccaaa would become a2b1c5a3. If the compressed string would not
// become smaller than the original, your method should return the original string.
// You can assume that the string contains only uppercase and lowercase letters (a-z)

public class StringCompression {

    public static String compressString(String s) {
        if (s == null) return null;

        char current = s.charAt(0);
        int count = 1, i = 0;
        StringBuilder sb = new StringBuilder();
        while (true) {
            while (++i < s.length() && s.charAt(i) == current) {
                count++;
            }
            sb.append(current).append(count);
            if (i == s.length()) break;
            current = s.charAt(i);
            count = 1;
        }

        String compressed = sb.toString();
        return s.length() > compressed.length() ? compressed : s;
    }

    public static void main(String[] args) {
        if (args.length == 1) System.out.println(StringCompression.compressString(args[0]));
    }
}
