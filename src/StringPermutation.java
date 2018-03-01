// Backtracking implementation to print all permutation of a given string

public class StringPermutation {

    public static void permuteString(String s) {
        permuteHelper(s, "");
    }

    private static void permuteHelper(String suffix, String prefix) {
        if (suffix.isEmpty()) {
            System.out.println(prefix);
        } else {
            for (int i = 0; i < suffix.length(); i++) {
                // Follow a strategy: choose/explore/un-choose
                System.out.println("---------------------");
                // choose a character to explore
                System.out.println("Prefix = " + prefix);
                System.out.println("Suffix = " + suffix);
                char c = suffix.charAt(i);
                suffix = suffix.substring(0, i) + suffix.substring(i+1);
                prefix = prefix + c;
                System.out.println("i = " + i);
                System.out.println("c = " + c);
                System.out.println("Prefix = " + prefix);
                System.out.println("Suffix = " + suffix);
                System.out.println("---------------------");
                // explore
                permuteHelper(suffix, prefix);
                // un-choose
                prefix = prefix.substring(0, prefix.length()-1);
                StringBuilder sb = new StringBuilder(suffix);
                suffix = sb.insert(i, c).toString();
                // System.out.println("Prefix = " + prefix);
                // System.out.println("Suffix = " + suffix);
            }
        }
    }

    public static void main(String[] args) {
        StringPermutation.permuteString("ANH");
    }
}
