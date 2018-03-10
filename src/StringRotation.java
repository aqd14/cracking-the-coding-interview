// Given two strings, s1 & s2. Write a function to check if a string is a rotation
// of other using only one call for isSubString()

public class StringRotation {

    public static boolean isStringRotation(String s1, String s2) {
        if (s1 == null || s2 == null) return false;

        if (s1.length() == s2.length()) {
            String s = s1 + s1;
            return s.indexOf(s2) != -1;
        }

        return false;
    }

    public static boolean isStringRotation2(String s1, String s2) {
        if (s1 == null || s2 == null) return false;

        if (s1.length() != s2.length()) return false;

        int l = s1.length();

        for (int offset = 0; offset < l; offset++) {
            boolean isRotation = checkRotation(s1, s2, offset);
            if (isRotation == true) return true;
        }

        return false;
    }

    private static boolean checkRotation(String s1, String s2, int rotationOffset) {
        int l = s1.length();
        for (int i = 0, j = rotationOffset; i < l; i++, j++) {
            if (j >= l) j = j -= l;
            if (s1.charAt(i) != s2.charAt(j)) return false;
        }
        return true;
    }

    public static void main(String[] args) {
        String s1 = "rotatedstring";
        String s2 = "tedstringrota";
        System.out.println("s1 = " + s1);
        System.out.println("s2 = " + s2);
        System.out.println(StringRotation.isStringRotation2(s1, s2));
        System.out.println(StringRotation.isStringRotation2(s1, s2));

        System.out.println("----------------------");
        s1 = "rotatedstring";
        s2 = "tedstringroat";
        System.out.println("s1 = " + s1);
        System.out.println("s2 = " + s2);
        System.out.println(StringRotation.isStringRotation2(s1, s2));
        System.out.println(StringRotation.isStringRotation2(s1, s2));
    }
}
